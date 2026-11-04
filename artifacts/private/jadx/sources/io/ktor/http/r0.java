package io.ktor.http;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpHeaderValueParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpHeaderValueParser.kt\nio/ktor/http/HeaderValue\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,243:1\n295#2,2:244\n1#3:246\n*S KotlinDebug\n*F\n+ 1 HttpHeaderValueParser.kt\nio/ktor/http/HeaderValue\n*L\n46#1:244,2\n*E\n"})
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f296083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<s0> f296084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f296085c;

    public r0(@NotNull String value, @NotNull List<s0> params) {
        Double d10;
        Object next;
        String strH;
        Double dL0;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f296083a = value;
        this.f296084b = params;
        Iterator<T> it = params.iterator();
        do {
            d10 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((s0) next).g(), "q"));
        s0 s0Var = (s0) next;
        double dDoubleValue = 1.0d;
        if (s0Var != null && (strH = s0Var.h()) != null && (dL0 = StringsKt.L0(strH)) != null) {
            double dDoubleValue2 = dL0.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                d10 = dL0;
            }
            if (d10 != null) {
                dDoubleValue = d10.doubleValue();
            }
        }
        this.f296085c = dDoubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ r0 d(r0 r0Var, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = r0Var.f296083a;
        }
        if ((i10 & 2) != 0) {
            list = r0Var.f296084b;
        }
        return r0Var.c(str, list);
    }

    @NotNull
    public final String a() {
        return this.f296083a;
    }

    @NotNull
    public final List<s0> b() {
        return this.f296084b;
    }

    @NotNull
    public final r0 c(@NotNull String value, @NotNull List<s0> params) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(params, "params");
        return new r0(value, params);
    }

    @NotNull
    public final List<s0> e() {
        return this.f296084b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.areEqual(this.f296083a, r0Var.f296083a) && Intrinsics.areEqual(this.f296084b, r0Var.f296084b);
    }

    public final double f() {
        return this.f296085c;
    }

    @NotNull
    public final String g() {
        return this.f296083a;
    }

    public int hashCode() {
        return (this.f296083a.hashCode() * 31) + this.f296084b.hashCode();
    }

    @NotNull
    public String toString() {
        return "HeaderValue(value=" + this.f296083a + ", params=" + this.f296084b + ')';
    }

    public /* synthetic */ r0(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list);
    }
}
