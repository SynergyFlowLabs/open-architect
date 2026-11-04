package com.sdk.growthbook.utils;

import java.util.Map;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class GBStickyAssignmentsDocument {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    private static final f0<KSerializer<Object>>[] f266487d = {null, null, g0.b(j0.PUBLICATION, new Function0() { // from class: com.sdk.growthbook.utils.l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GBStickyAssignmentsDocument.b();
        }
    })};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f266488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f266489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f266490c;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<GBStickyAssignmentsDocument> serializer() {
            return GBStickyAssignmentsDocument$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GBStickyAssignmentsDocument(int i10, String str, String str2, Map map, v2 v2Var) {
        if (7 != (i10 & 7)) {
            g2.b(i10, 7, GBStickyAssignmentsDocument$$serializer.INSTANCE.getDescriptor());
        }
        this.f266488a = str;
        this.f266489b = str2;
        this.f266490c = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        b3 b3Var = b3.f315897a;
        return new e1(b3Var, b3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GBStickyAssignmentsDocument h(GBStickyAssignmentsDocument gBStickyAssignmentsDocument, String str, String str2, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = gBStickyAssignmentsDocument.f266488a;
        }
        if ((i10 & 2) != 0) {
            str2 = gBStickyAssignmentsDocument.f266489b;
        }
        if ((i10 & 4) != 0) {
            map = gBStickyAssignmentsDocument.f266490c;
        }
        return gBStickyAssignmentsDocument.g(str, str2, map);
    }

    @oj.n
    public static final /* synthetic */ void l(GBStickyAssignmentsDocument gBStickyAssignmentsDocument, kotlinx.serialization.encoding.e eVar, SerialDescriptor serialDescriptor) {
        f0<KSerializer<Object>>[] f0VarArr = f266487d;
        eVar.encodeStringElement(serialDescriptor, 0, gBStickyAssignmentsDocument.f266488a);
        eVar.encodeStringElement(serialDescriptor, 1, gBStickyAssignmentsDocument.f266489b);
        eVar.encodeSerializableElement(serialDescriptor, 2, f0VarArr[2].getValue(), gBStickyAssignmentsDocument.f266490c);
    }

    @NotNull
    public final String d() {
        return this.f266488a;
    }

    @NotNull
    public final String e() {
        return this.f266489b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GBStickyAssignmentsDocument)) {
            return false;
        }
        GBStickyAssignmentsDocument gBStickyAssignmentsDocument = (GBStickyAssignmentsDocument) obj;
        return Intrinsics.areEqual(this.f266488a, gBStickyAssignmentsDocument.f266488a) && Intrinsics.areEqual(this.f266489b, gBStickyAssignmentsDocument.f266489b) && Intrinsics.areEqual(this.f266490c, gBStickyAssignmentsDocument.f266490c);
    }

    @NotNull
    public final Map<String, String> f() {
        return this.f266490c;
    }

    @NotNull
    public final GBStickyAssignmentsDocument g(@NotNull String attributeName, @NotNull String attributeValue, @NotNull Map<String, String> assignments) {
        Intrinsics.checkNotNullParameter(attributeName, "attributeName");
        Intrinsics.checkNotNullParameter(attributeValue, "attributeValue");
        Intrinsics.checkNotNullParameter(assignments, "assignments");
        return new GBStickyAssignmentsDocument(attributeName, attributeValue, assignments);
    }

    public int hashCode() {
        return (((this.f266488a.hashCode() * 31) + this.f266489b.hashCode()) * 31) + this.f266490c.hashCode();
    }

    @NotNull
    public final Map<String, String> i() {
        return this.f266490c;
    }

    @NotNull
    public final String j() {
        return this.f266488a;
    }

    @NotNull
    public final String k() {
        return this.f266489b;
    }

    @NotNull
    public String toString() {
        return "GBStickyAssignmentsDocument(attributeName=" + this.f266488a + ", attributeValue=" + this.f266489b + ", assignments=" + this.f266490c + ")";
    }

    public GBStickyAssignmentsDocument(@NotNull String attributeName, @NotNull String attributeValue, @NotNull Map<String, String> assignments) {
        Intrinsics.checkNotNullParameter(attributeName, "attributeName");
        Intrinsics.checkNotNullParameter(attributeValue, "attributeValue");
        Intrinsics.checkNotNullParameter(assignments, "assignments");
        this.f266488a = attributeName;
        this.f266489b = attributeValue;
        this.f266490c = assignments;
    }
}
