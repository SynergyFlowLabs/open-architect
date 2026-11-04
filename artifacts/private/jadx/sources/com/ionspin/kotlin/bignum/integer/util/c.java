package com.ionspin.kotlin.bignum.integer.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.q1;
import kotlin.r1;
import kotlin.text.StringsKt;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.locationtech.jts.geom.l;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nVariousUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VariousUtil.kt\ncom/ionspin/kotlin/bignum/integer/util/VariousUtilKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n11065#2:38\n11400#2,3:39\n1855#3,2:42\n1855#3,2:45\n1#4:44\n*S KotlinDebug\n*F\n+ 1 VariousUtil.kt\ncom/ionspin/kotlin/bignum/integer/util/VariousUtilKt\n*L\n13#1:38\n13#1:39,3\n14#1:42,2\n19#1:45,2\n*E\n"})
public final class c {

    static final class a extends l0 implements Function1<String, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f131132a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String upperCase = it.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return upperCase;
        }
    }

    static final class b extends l0 implements Function1<String, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f131133a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String upperCase = it.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return upperCase;
        }
    }

    public static final void a(@NotNull q1[] q1VarArr, int i10) {
        Intrinsics.checkNotNullParameter(q1VarArr, "<this>");
        ArrayList arrayList = new ArrayList(q1VarArr.length);
        for (q1 q1Var : q1VarArr) {
            arrayList.add(StringsKt.U3(d0.b(q1Var.x0(), 16), 2, l.f338160j));
        }
        Iterator it = CollectionsKt.chunked(arrayList, i10).iterator();
        while (it.hasNext()) {
            int i11 = 7 | 0;
            System.out.println((Object) CollectionsKt.joinToString$default((List) it.next(), " ", null, null, 0, null, a.f131132a, 30, null));
        }
    }

    public static /* synthetic */ void b(q1[] q1VarArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 16;
        }
        a(q1VarArr, i10);
    }

    public static final void c(@NotNull byte[] hexColumsPrint, int i10) {
        Intrinsics.checkNotNullParameter(hexColumsPrint, "$this$hexColumsPrint");
        ArrayList arrayList = new ArrayList(r1.v(hexColumsPrint));
        int iV = r1.v(hexColumsPrint);
        for (int i11 = 0; i11 < iV; i11++) {
            arrayList.add(StringsKt.U3(d0.b(r1.t(hexColumsPrint, i11), 16), 2, l.f338160j));
        }
        Iterator it = CollectionsKt.chunked(arrayList, i10).iterator();
        while (it.hasNext()) {
            int i12 = 7 << 0;
            System.out.println((Object) CollectionsKt.joinToString$default((List) it.next(), " ", null, null, 0, null, b.f131133a, 30, null));
        }
    }

    public static /* synthetic */ void d(byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 16;
        }
        c(bArr, i10);
    }

    @NotNull
    public static final String e(char c10, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(c10);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public static final String f(char c10, long j10) {
        StringBuilder sb2 = new StringBuilder();
        for (long j11 = 0; j11 < j10; j11++) {
            sb2.append(c10);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
