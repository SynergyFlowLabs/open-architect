package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class BotIntro {

    @c("parts")
    @NotNull
    private final List<List<Block.Builder>> blocks;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @c("id")
    @NotNull
    private final String f293113id;

    @c("operator")
    @NotNull
    private final Participant.Builder operator;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @f
    @NotNull
    public static final BotIntro NULL = new BotIntro(null, null, null, 7, null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        int i10 = 6 | 7;
    }

    public BotIntro() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BotIntro copy$default(BotIntro botIntro, String str, Participant.Builder builder, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = botIntro.f293113id;
        }
        if ((i10 & 2) != 0) {
            builder = botIntro.operator;
        }
        if ((i10 & 4) != 0) {
            list = botIntro.blocks;
        }
        return botIntro.copy(str, builder, list);
    }

    @NotNull
    public final String component1() {
        return this.f293113id;
    }

    @NotNull
    public final Participant.Builder component2() {
        return this.operator;
    }

    @NotNull
    public final List<List<Block.Builder>> component3() {
        return this.blocks;
    }

    @NotNull
    public final BotIntro copy(@NotNull String id2, @NotNull Participant.Builder operator, @NotNull List<? extends List<Block.Builder>> blocks) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(operator, "operator");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        return new BotIntro(id2, operator, blocks);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotIntro)) {
            return false;
        }
        BotIntro botIntro = (BotIntro) obj;
        return Intrinsics.areEqual(this.f293113id, botIntro.f293113id) && Intrinsics.areEqual(this.operator, botIntro.operator) && Intrinsics.areEqual(this.blocks, botIntro.blocks);
    }

    @NotNull
    public final List<List<Block.Builder>> getBlocks() {
        return this.blocks;
    }

    @NotNull
    public final Participant getBuiltParticipant() {
        Participant participantBuild = this.operator.build();
        Intrinsics.checkNotNullExpressionValue(participantBuild, "build(...)");
        return participantBuild;
    }

    @NotNull
    public final String getId() {
        return this.f293113id;
    }

    @NotNull
    public final Participant.Builder getOperator() {
        return this.operator;
    }

    public int hashCode() {
        return (((this.f293113id.hashCode() * 31) + this.operator.hashCode()) * 31) + this.blocks.hashCode();
    }

    @NotNull
    public String toString() {
        return "BotIntro(id=" + this.f293113id + ", operator=" + this.operator + ", blocks=" + this.blocks + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BotIntro(@NotNull String id2, @NotNull Participant.Builder operator, @NotNull List<? extends List<Block.Builder>> blocks) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(operator, "operator");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.f293113id = id2;
        this.operator = operator;
        this.blocks = blocks;
    }

    public /* synthetic */ BotIntro(String str, Participant.Builder builder, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? new Participant.Builder() : builder, (i10 & 4) != 0 ? CollectionsKt.emptyList() : list);
    }
}
