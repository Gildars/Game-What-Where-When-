--DROP TABLE answers, questions, tips, users,games_sessions, games_setings, teams;

CREATE TABLE tips (
  tip_id INTEGER UNSIGNED AUTO_INCREMENT NOT NULL,
  title VARCHAR(500) NOT NULL,
  PRIMARY KEY(tip_id)
);

CREATE TABLE questions (
  question_id INTEGER UNSIGNED AUTO_INCREMENT NOT NULL,
  tip_id INTEGER UNSIGNED NOT NULL,
  title VARCHAR(1000) NOT NULL,
  PRIMARY KEY (question_id),
  FOREIGN KEY (tip_id) REFERENCES tips(tip_id)
);

CREATE TABLE answers (
  answer_id INTEGER UNSIGNED AUTO_INCREMENT NOT NULL,
  question_id INTEGER UNSIGNED NOT NULL,
  title VARCHAR(350) NOT NULL,
  is_right TINYINT (1) CHECK(
    is_right = 0
    OR is_right = 1
  ),
  PRIMARY KEY (answer_id),
  FOREIGN KEY (question_id) REFERENCES questions(question_id)
);

CREATE TABLE teams (
  team_id INTEGER UNSIGNED AUTO_INCREMENT NOT NULL,
  name VARCHAR(50) NOT NULL,
  PRIMARY KEY (team_id)
);

CREATE TABLE users (
  user_id INTEGER UNSIGNED AUTO_INCREMENT NOT NULL,
  team_id INTEGER UNSIGNED DEFAULT(NULL),
  full_name VARCHAR(100) NOT NULL,
  email VARCHAR(256) UNIQUE NOT NULL,
  password VARCHAR(20) NOT NULL,
  user_role VARCHAR(12) CHECK(
    user_role = 'judge'
    OR user_role = 'player'
  ),
  created_at DATETIME DEFAULT(CURRENT_TIMESTAMP) NOT NULL,
  PRIMARY KEY (user_id),
  FOREIGN KEY (team_id) REFERENCES teams(team_id)
);

CREATE TABLE games_setings (
  game_setings_id INTEGER UNSIGNED AUTO_INCREMENT NOT NULL,
  time_per_question TIME NOT NULL,
  count_players TINYINT(10) UNSIGNED CHECK(count_players > 1),
  count_questions TINYINT(20) UNSIGNED CHECK(count_questions > 1),
  tips_type VARCHAR(50) CHECK(tips_type IN ('show_the_probability_of_the_correct_answer','remove_some_wrong', 'give_text_hint','give extra time')),
  PRIMARY KEY (game_setings_id)
);

CREATE TABLE games_sessions (
  game_session_id INTEGER UNSIGNED AUTO_INCREMENT NOT NULL,
  team_id INTEGER UNSIGNED NOT NULL,
  judge_id INTEGER UNSIGNED NOT NULL,
  game_seting_id INTEGER UNSIGNED NOT NULL,
  score TINYINT(100) UNSIGNED DEFAULT(0) NOT NULL,
  created_at DATETIME DEFAULT(CURRENT_TIMESTAMP) NOT NULL,
  is_game_over TINYINT(1) DEFAULT(0) CHECK(
    is_game_over = 0
    OR is_game_over = 1
  ),
  PRIMARY KEY (game_session_id),
  FOREIGN KEY (team_id) REFERENCES teams(team_id),
  FOREIGN KEY (judge_id) REFERENCES users(user_id),
  FOREIGN KEY (game_seting_id) REFERENCES games_setings(game_setings_id)
);