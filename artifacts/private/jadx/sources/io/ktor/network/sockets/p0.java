package io.ktor.network.sockets;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final b f296304e = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<Object, Object> f296305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f296306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f296307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f296308d;

    public static final class a extends p0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f296309f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Map<Object, Object> customOptions) {
            super(customOptions, null);
            Intrinsics.checkNotNullParameter(customOptions, "customOptions");
            this.f296309f = 511;
        }

        @Override // io.ktor.network.sockets.p0
        @NotNull
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public a a() {
            a aVar = new a(new HashMap(c()));
            aVar.b(this);
            return aVar;
        }

        public final int m() {
            return this.f296309f;
        }

        public final void n(int i10) {
            this.f296309f = i10;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final p0 a() {
            return new c(new HashMap());
        }

        private b() {
        }
    }

    private static final class c extends p0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull Map<Object, Object> customOptions) {
            super(customOptions, null);
            Intrinsics.checkNotNullParameter(customOptions, "customOptions");
        }

        @Override // io.ktor.network.sockets.p0
        @NotNull
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public c a() {
            c cVar = new c(new HashMap(c()));
            cVar.b(this);
            return cVar;
        }
    }

    public static class d extends p0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f296310f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f296311g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull Map<Object, Object> customOptions) {
            super(customOptions, null);
            Intrinsics.checkNotNullParameter(customOptions, "customOptions");
            this.f296310f = -1;
            this.f296311g = -1;
        }

        @Override // io.ktor.network.sockets.p0
        protected void b(@NotNull p0 from) {
            Intrinsics.checkNotNullParameter(from, "from");
            super.b(from);
            if (from instanceof d) {
                d dVar = (d) from;
                this.f296310f = dVar.f296310f;
                this.f296311g = dVar.f296311g;
            }
        }

        @Override // io.ktor.network.sockets.p0
        @NotNull
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public d a() {
            d dVar = new d(new HashMap(c()));
            dVar.b(this);
            return dVar;
        }

        public final int m() {
            return this.f296311g;
        }

        public final int n() {
            return this.f296310f;
        }

        public final void o(int i10) {
            this.f296311g = i10;
        }

        public final void p(int i10) {
            this.f296310f = i10;
        }

        @NotNull
        public final e q() {
            e eVar = new e(new HashMap(c()));
            b(this);
            return eVar;
        }

        @NotNull
        public final f r() {
            f fVar = new f(new HashMap(c()));
            b(this);
            return fVar;
        }
    }

    public static final class e extends d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f296312h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f296313i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        private Boolean f296314j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f296315k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull Map<Object, Object> customOptions) {
            super(customOptions);
            Intrinsics.checkNotNullParameter(customOptions, "customOptions");
            int i10 = 7 ^ 1;
            this.f296312h = true;
            this.f296313i = -1;
            this.f296315k = Long.MAX_VALUE;
        }

        public final void A(long j10) {
            this.f296315k = j10;
        }

        @Override // io.ktor.network.sockets.p0.d, io.ktor.network.sockets.p0
        protected void b(@NotNull p0 from) {
            Intrinsics.checkNotNullParameter(from, "from");
            super.b(from);
            if (from instanceof e) {
                e eVar = (e) from;
                this.f296312h = eVar.f296312h;
                this.f296313i = eVar.f296313i;
                this.f296314j = eVar.f296314j;
            }
        }

        @Override // io.ktor.network.sockets.p0.d
        @NotNull
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public e a() {
            e eVar = new e(new HashMap(c()));
            eVar.b(this);
            return eVar;
        }

        @Nullable
        public final Boolean t() {
            return this.f296314j;
        }

        public final int u() {
            return this.f296313i;
        }

        public final boolean v() {
            return this.f296312h;
        }

        public final long w() {
            return this.f296315k;
        }

        public final void x(@Nullable Boolean bool) {
            this.f296314j = bool;
        }

        public final void y(int i10) {
            this.f296313i = i10;
        }

        public final void z(boolean z10) {
            this.f296312h = z10;
        }
    }

    public static final class f extends d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f296316h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@NotNull Map<Object, Object> customOptions) {
            super(customOptions);
            Intrinsics.checkNotNullParameter(customOptions, "customOptions");
        }

        @Override // io.ktor.network.sockets.p0.d, io.ktor.network.sockets.p0
        protected void b(@NotNull p0 from) {
            Intrinsics.checkNotNullParameter(from, "from");
            super.b(from);
            if (from instanceof f) {
                this.f296316h = ((f) from).f296316h;
            }
        }

        @Override // io.ktor.network.sockets.p0.d
        @NotNull
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public f a() {
            f fVar = new f(new HashMap(c()));
            fVar.b(this);
            return fVar;
        }

        public final boolean t() {
            return this.f296316h;
        }

        public final void u(boolean z10) {
            this.f296316h = z10;
        }
    }

    public /* synthetic */ p0(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    @NotNull
    public abstract p0 a();

    protected void b(@NotNull p0 from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.f296306b = from.f296306b;
        this.f296307c = from.f296307c;
        this.f296308d = from.f296308d;
    }

    @NotNull
    protected final Map<Object, Object> c() {
        return this.f296305a;
    }

    public final boolean d() {
        return this.f296307c;
    }

    public final boolean e() {
        return this.f296308d;
    }

    public final byte f() {
        return this.f296306b;
    }

    @NotNull
    public final d g() {
        d dVar = new d(new HashMap(this.f296305a));
        b(this);
        return dVar;
    }

    public final void h(boolean z10) {
        this.f296307c = z10;
    }

    public final void i(boolean z10) {
        this.f296308d = z10;
    }

    public final void j(byte b10) {
        this.f296306b = b10;
    }

    @NotNull
    public final a k() {
        a aVar = new a(new HashMap(this.f296305a));
        aVar.b(this);
        return aVar;
    }

    private p0(Map<Object, Object> map) {
        this.f296305a = map;
        this.f296306b = a1.f296207b.e();
    }
}
