package com.superwall.sdk.models.postback;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.y0;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
@SourceDebugExtension({"SMAP\nPostbackRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostbackRequest.kt\ncom/superwall/sdk/models/postback/PostbackRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n1#2:51\n774#3:52\n865#3,2:53\n*S KotlinDebug\n*F\n+ 1 PostbackRequest.kt\ncom/superwall/sdk/models/postback/PostbackRequest\n*L\n24#1:52\n24#1:53,2\n*E\n"})
public final class PostbackRequest {

    @Nullable
    private final Integer delay;

    @NotNull
    private final List<PostbackProductIdentifier> products;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new kotlinx.serialization.internal.f(PostbackProductIdentifier$$serializer.INSTANCE), null};

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<PostbackRequest> serializer() {
            return PostbackRequest$$serializer.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final PostbackRequest stub() {
            return new PostbackRequest(CollectionsKt.listOf(new PostbackProductIdentifier("123", "ios")), (Integer) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        private Companion() {
        }
    }

    public /* synthetic */ PostbackRequest(int i10, List list, Integer num, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, PostbackRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.products = list;
        if ((i10 & 2) == 0) {
            this.delay = null;
        } else {
            this.delay = num;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PostbackRequest copy$default(PostbackRequest postbackRequest, List list, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = postbackRequest.products;
        }
        if ((i10 & 2) != 0) {
            num = postbackRequest.delay;
        }
        return postbackRequest.copy(list, num);
    }

    @a0("delay")
    public static /* synthetic */ void getDelay$annotations() {
    }

    @a0("products")
    public static /* synthetic */ void getProducts$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(PostbackRequest postbackRequest, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], postbackRequest.products);
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 1) && postbackRequest.delay == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(serialDescriptor, 1, y0.f316055a, postbackRequest.delay);
    }

    @NotNull
    public final List<PostbackProductIdentifier> component1() {
        return this.products;
    }

    @Nullable
    public final Integer component2() {
        return this.delay;
    }

    @NotNull
    public final PostbackRequest copy(@NotNull List<PostbackProductIdentifier> products, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(products, "products");
        return new PostbackRequest(products, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostbackRequest)) {
            return false;
        }
        PostbackRequest postbackRequest = (PostbackRequest) obj;
        return Intrinsics.areEqual(this.products, postbackRequest.products) && Intrinsics.areEqual(this.delay, postbackRequest.delay);
    }

    @Nullable
    public final Integer getDelay() {
        return this.delay;
    }

    public final double getPostbackDelay() {
        Integer num = this.delay;
        return num != null ? ((double) num.intValue()) / ((double) 1000) : kotlin.random.f.f312895a.j(2.0d, 10.0d);
    }

    @NotNull
    public final List<PostbackProductIdentifier> getProducts() {
        return this.products;
    }

    @NotNull
    public final List<PostbackProductIdentifier> getProductsToPostBack() {
        List<PostbackProductIdentifier> list = this.products;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((PostbackProductIdentifier) obj).getIsiOS()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        int iHashCode = this.products.hashCode() * 31;
        Integer num = this.delay;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "PostbackRequest(products=" + this.products + ", delay=" + this.delay + ")";
    }

    public PostbackRequest(@NotNull List<PostbackProductIdentifier> products, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(products, "products");
        this.products = products;
        this.delay = num;
    }

    public /* synthetic */ PostbackRequest(List list, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? null : num);
    }
}
