package io.intercom.android.sdk.models;

import androidx.annotation.p0;
import io.intercom.android.sdk.blocks.lib.models.Author;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.utilities.commons.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import u7.d;

/* JADX INFO: loaded from: classes13.dex */
@d
public abstract class Link {
    public static final String ARTICLE_TYPE = "educate.article";
    public static final String HELP_CENTER_TYPE = "educate.help_center";
    public static final String SUGGESTION_TYPE = "educate.suggestion";

    public static final class Builder {

        @p0
        List<Block.Builder> blocks;

        @p0
        Card.Builder card;
        long created_at;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @p0
        String f293118id;

        @p0
        ReactionReply.Builder reactions_reply;
        long updated_at;

        public Link build() {
            String string = this.f293118id;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            String str = string;
            ArrayList arrayList = new ArrayList(CollectionUtils.capacityFor(this.blocks));
            List<Block.Builder> list = this.blocks;
            if (list != null) {
                for (Block.Builder builder : list) {
                    if (builder != null) {
                        arrayList.add(builder.build());
                    }
                }
            }
            ReactionReply.Builder builder2 = this.reactions_reply;
            ReactionReply reactionReplyBuild = builder2 == null ? ReactionReply.NULL : builder2.build();
            Card.Builder builder3 = this.card;
            if (builder3 == null) {
                builder3 = new Card.Builder();
            }
            return new AutoValue_Link(str, builder3.build(), arrayList, reactionReplyBuild, this.created_at, this.updated_at);
        }
    }

    public Author getAuthor() {
        return getCard().getAuthor();
    }

    public abstract List<Block> getBlocks();

    public abstract Card getCard();

    public abstract long getCreatedAt();

    public String getDescription() {
        return getCard().getDescription();
    }

    public abstract String getId();

    public abstract ReactionReply getReactionReply();

    public String getText() {
        return getCard().getText();
    }

    public String getTitle() {
        return getCard().getTitle();
    }

    public String getType() {
        return getCard().getType();
    }

    public abstract long getUpdatedAt();
}
