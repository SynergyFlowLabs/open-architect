CREATE TABLE IF NOT EXISTS blog_posts
(
	Id INTEGER AUTO_INCREMENT PRIMARY KEY,
	uid INTEGER,
	category_id INTEGER,
	title TEXT,
	image_uri TEXT,
	thumbnail_image_uri TEXT,
	announcement TEXT,
	content_uri TEXT,
	video_uri TEXT,
	public_uri TEXT,
	created_at TEXT
);

CREATE INDEX IF NOT EXISTS index_blog_posts_uid ON blog_posts (uid);
