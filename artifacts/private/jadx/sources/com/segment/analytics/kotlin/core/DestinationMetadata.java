package com.segment.analytics.kotlin.core;

import java.util.List;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.v2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class DestinationMetadata {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private List<String> f266650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private List<String> f266651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private List<String> f266652c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<DestinationMetadata> serializer() {
            return DestinationMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public DestinationMetadata() {
        this((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DestinationMetadata e(DestinationMetadata destinationMetadata, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = destinationMetadata.f266650a;
        }
        if ((i10 & 2) != 0) {
            list2 = destinationMetadata.f266651b;
        }
        if ((i10 & 4) != 0) {
            list3 = destinationMetadata.f266652c;
        }
        return destinationMetadata.d(list, list2, list3);
    }

    @oj.n
    public static final void l(@NotNull DestinationMetadata self, @NotNull kotlinx.serialization.encoding.e output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.f266650a, CollectionsKt.emptyList())) {
            output.encodeNullableSerializableElement(serialDesc, 0, new kotlinx.serialization.internal.f(b3.f315897a), self.f266650a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.f266651b, CollectionsKt.emptyList())) {
            output.encodeNullableSerializableElement(serialDesc, 1, new kotlinx.serialization.internal.f(b3.f315897a), self.f266651b);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.f266652c, CollectionsKt.emptyList())) {
            output.encodeNullableSerializableElement(serialDesc, 2, new kotlinx.serialization.internal.f(b3.f315897a), self.f266652c);
        }
    }

    @Nullable
    public final List<String> a() {
        return this.f266650a;
    }

    @Nullable
    public final List<String> b() {
        return this.f266651b;
    }

    @Nullable
    public final List<String> c() {
        return this.f266652c;
    }

    @NotNull
    public final DestinationMetadata d(@Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3) {
        return new DestinationMetadata(list, list2, list3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DestinationMetadata)) {
            return false;
        }
        DestinationMetadata destinationMetadata = (DestinationMetadata) obj;
        return Intrinsics.areEqual(this.f266650a, destinationMetadata.f266650a) && Intrinsics.areEqual(this.f266651b, destinationMetadata.f266651b) && Intrinsics.areEqual(this.f266652c, destinationMetadata.f266652c);
    }

    @Nullable
    public final List<String> f() {
        return this.f266650a;
    }

    @Nullable
    public final List<String> g() {
        return this.f266652c;
    }

    @Nullable
    public final List<String> h() {
        return this.f266651b;
    }

    public int hashCode() {
        List<String> list = this.f266650a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.f266651b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f266652c;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final void i(@Nullable List<String> list) {
        this.f266650a = list;
    }

    public final void j(@Nullable List<String> list) {
        this.f266652c = list;
    }

    public final void k(@Nullable List<String> list) {
        this.f266651b = list;
    }

    @NotNull
    public String toString() {
        return "DestinationMetadata(bundled=" + this.f266650a + ", unbundled=" + this.f266651b + ", bundledIds=" + this.f266652c + ')';
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @b1(expression = "", imports = {}))
    public /* synthetic */ DestinationMetadata(int i10, List list, List list2, List list3, v2 v2Var) {
        this.f266650a = (i10 & 1) == 0 ? CollectionsKt.emptyList() : list;
        if ((i10 & 2) == 0) {
            this.f266651b = CollectionsKt.emptyList();
        } else {
            this.f266651b = list2;
        }
        if ((i10 & 4) == 0) {
            this.f266652c = CollectionsKt.emptyList();
        } else {
            this.f266652c = list3;
        }
    }

    public DestinationMetadata(@Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3) {
        this.f266650a = list;
        this.f266651b = list2;
        this.f266652c = list3;
    }

    public /* synthetic */ DestinationMetadata(List list, List list2, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.emptyList() : list, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list2, (i10 & 4) != 0 ? CollectionsKt.emptyList() : list3);
    }
}
