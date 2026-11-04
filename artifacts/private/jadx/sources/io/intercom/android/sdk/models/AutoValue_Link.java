package io.intercom.android.sdk.models;

import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
final class AutoValue_Link extends Link {
    private final List<Block> blocks;
    private final Card card;
    private final long createdAt;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f293111id;
    private final ReactionReply reactionReply;
    private final long updatedAt;

    AutoValue_Link(String str, Card card, List<Block> list, ReactionReply reactionReply, long j10, long j11) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f293111id = str;
        if (card == null) {
            throw new NullPointerException("Null card");
        }
        this.card = card;
        if (list == null) {
            throw new NullPointerException("Null blocks");
        }
        this.blocks = list;
        if (reactionReply == null) {
            throw new NullPointerException("Null reactionReply");
        }
        this.reactionReply = reactionReply;
        this.createdAt = j10;
        this.updatedAt = j11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Link) {
            Link link = (Link) obj;
            if (this.f293111id.equals(link.getId()) && this.card.equals(link.getCard()) && this.blocks.equals(link.getBlocks()) && this.reactionReply.equals(link.getReactionReply()) && this.createdAt == link.getCreatedAt() && this.updatedAt == link.getUpdatedAt()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.Link
    public List<Block> getBlocks() {
        return this.blocks;
    }

    @Override // io.intercom.android.sdk.models.Link
    public Card getCard() {
        return this.card;
    }

    @Override // io.intercom.android.sdk.models.Link
    public long getCreatedAt() {
        return this.createdAt;
    }

    @Override // io.intercom.android.sdk.models.Link
    public String getId() {
        return this.f293111id;
    }

    @Override // io.intercom.android.sdk.models.Link
    public ReactionReply getReactionReply() {
        return this.reactionReply;
    }

    @Override // io.intercom.android.sdk.models.Link
    public long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f293111id.hashCode() ^ 1000003) * 1000003) ^ this.card.hashCode()) * 1000003) ^ this.blocks.hashCode()) * 1000003) ^ this.reactionReply.hashCode()) * 1000003;
        long j10 = this.createdAt;
        long j11 = this.updatedAt;
        return ((int) (j11 ^ (j11 >>> 32))) ^ ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "Link{id=" + this.f293111id + ", card=" + this.card + ", blocks=" + this.blocks + ", reactionReply=" + this.reactionReply + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
    }
}
