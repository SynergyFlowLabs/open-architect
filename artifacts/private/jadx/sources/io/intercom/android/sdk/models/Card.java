package io.intercom.android.sdk.models;

import androidx.annotation.p0;
import io.intercom.android.sdk.blocks.lib.models.Author;
import io.intercom.android.sdk.utilities.NullSafety;
import u7.d;

/* JADX INFO: loaded from: classes13.dex */
@d
public abstract class Card {

    public static final class Builder {

        @p0
        String articleId;

        @p0
        Author.Builder author;

        @p0
        String description;

        @p0
        String linkType;

        @p0
        String text;

        @p0
        String title;

        @p0
        String type;

        public Card build() {
            Author.Builder builder = this.author;
            if (builder == null) {
                builder = new Author.Builder();
            }
            return Card.create(NullSafety.valueOrEmpty(this.type), NullSafety.valueOrEmpty(this.text), NullSafety.valueOrEmpty(this.title), NullSafety.valueOrEmpty(this.description), builder.build());
        }
    }

    public static Card create(String str, String str2, String str3, String str4, Author author) {
        return new AutoValue_Card(str, str2, str3, str4, author);
    }

    public abstract Author getAuthor();

    public abstract String getDescription();

    public abstract String getText();

    public abstract String getTitle();

    public abstract String getType();
}
