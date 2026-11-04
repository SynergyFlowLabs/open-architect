package com.planner5d.library.dgenerator.fragment.gallery;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements yc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f160171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f160172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f160173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Function1<Integer, Unit> f160174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f160175e;

    public enum a {
        Title(0),
        Image(1);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f160179e = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f160180a;

        a(int i10) {
            this.f160180a = i10;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f160179e;
        }

        public final int n() {
            return this.f160180a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(@NotNull a viewType, @NotNull String value, int i10, @Nullable Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f160171a = viewType;
        this.f160172b = value;
        this.f160173c = i10;
        this.f160174d = function1;
        this.f160175e = viewType.n();
    }

    @Nullable
    public final Function1<Integer, Unit> a() {
        return this.f160174d;
    }

    public final int b() {
        return this.f160175e;
    }

    public final int c() {
        return this.f160173c;
    }

    @NotNull
    public final String d() {
        return this.f160172b;
    }

    @NotNull
    public final a e() {
        return this.f160171a;
    }

    @Override // yc.b
    public boolean equals(@Nullable Object obj) {
        p pVar = obj instanceof p ? (p) obj : null;
        return pVar != null && this.f160175e == pVar.f160175e;
    }

    public int hashCode() {
        int iHashCode = ((this.f160171a.hashCode() * 31) + this.f160172b.hashCode()) * 31;
        Function1<Integer, Unit> function1 = this.f160174d;
        return ((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + this.f160175e;
    }

    @Override // yc.b
    public boolean n(@Nullable Object obj) {
        return Intrinsics.areEqual(this, obj);
    }
}
