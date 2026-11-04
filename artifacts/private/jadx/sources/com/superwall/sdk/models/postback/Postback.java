package com.superwall.sdk.models.postback;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class Postback {

    @NotNull
    private final List<PostbackProduct> products;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new kotlinx.serialization.internal.f(PostbackProduct$$serializer.INSTANCE)};

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<Postback> serializer() {
            return Postback$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Postback(int i10, List list, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, Postback$$serializer.INSTANCE.getDescriptor());
        }
        this.products = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Postback copy$default(Postback postback, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = postback.products;
        }
        return postback.copy(list);
    }

    @NotNull
    public final List<PostbackProduct> component1() {
        return this.products;
    }

    @NotNull
    public final Postback copy(@NotNull List<PostbackProduct> products) {
        Intrinsics.checkNotNullParameter(products, "products");
        return new Postback(products);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Postback) && Intrinsics.areEqual(this.products, ((Postback) obj).products);
    }

    @NotNull
    public final List<PostbackProduct> getProducts() {
        return this.products;
    }

    public int hashCode() {
        return this.products.hashCode();
    }

    @NotNull
    public String toString() {
        return "Postback(products=" + this.products + ")";
    }

    public Postback(@NotNull List<PostbackProduct> products) {
        Intrinsics.checkNotNullParameter(products, "products");
        this.products = products;
    }
}
