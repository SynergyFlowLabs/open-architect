package com.superwall.sdk.models.postback;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class SWProduct {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f267445id;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<SWProduct> serializer() {
            return SWProduct$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SWProduct(int i10, String str, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, SWProduct$$serializer.INSTANCE.getDescriptor());
        }
        this.f267445id = str;
    }

    public static /* synthetic */ SWProduct copy$default(SWProduct sWProduct, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sWProduct.f267445id;
        }
        return sWProduct.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.f267445id;
    }

    @NotNull
    public final SWProduct copy(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new SWProduct(id2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SWProduct) && Intrinsics.areEqual(this.f267445id, ((SWProduct) obj).f267445id);
    }

    @NotNull
    public final String getId() {
        return this.f267445id;
    }

    public int hashCode() {
        return this.f267445id.hashCode();
    }

    @NotNull
    public String toString() {
        return "SWProduct(id=" + this.f267445id + ")";
    }

    public SWProduct(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f267445id = id2;
    }
}
