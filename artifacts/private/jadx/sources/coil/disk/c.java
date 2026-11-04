package coil.disk;

import androidx.annotation.l1;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.k;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.l0;
import okio.m;
import okio.n;
import okio.r0;
import okio.v;
import okio.w;
import okio.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Okio.kt\nokio/Okio__OkioKt\n+ 4 FileSystem.kt\nokio/FileSystem\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,869:1\n1#2:870\n66#3:871\n52#3,4:873\n60#3,10:878\n56#3,3:888\n71#3,3:891\n52#3,4:904\n60#3,10:909\n56#3,18:919\n67#4:872\n68#4:877\n80#4:901\n165#4:902\n81#4:903\n82#4:908\n381#5,7:894\n37#6,2:937\n37#6,2:939\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache\n*L\n207#1:871\n207#1:873,4\n207#1:878,10\n207#1:888,3\n207#1:891,3\n320#1:904,4\n320#1:909,10\n320#1:919,18\n207#1:872\n207#1:877\n320#1:901\n320#1:902\n320#1:903\n320#1:908\n270#1:894,7\n585#1:937,2\n641#1:939,2\n*E\n"})
public final class c implements Closeable, Flushable {

    @NotNull
    private static final String H1 = "CLEAN";

    @NotNull
    public static final String X = "journal";

    @NotNull
    public static final String Y = "journal.tmp";

    @NotNull
    public static final String Z = "journal.bkp";

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private static final String f87245g3 = "REMOVE";

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    private static final String f87246h3 = "READ";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final String f87248p0 = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    public static final String f87249p1 = "1";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private static final String f87250p2 = "DIRTY";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final r0 f87252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f87253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f87254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f87255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final r0 f87256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final r0 f87257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final r0 f87258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap<String, C0816c> f87259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final s0 f87260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f87261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f87262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private m f87263l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f87264m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f87265n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f87266o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f87267s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f87268t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final e f87269v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final a f87251w = new a(null);

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    private static final Regex f87247i3 = new Regex("[a-z0-9_-]{1,120}");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @l1
        public static /* synthetic */ void a() {
        }

        @l1
        public static /* synthetic */ void b() {
        }

        @l1
        public static /* synthetic */ void c() {
        }

        @l1
        public static /* synthetic */ void d() {
        }

        @l1
        public static /* synthetic */ void e() {
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$Editor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,869:1\n1#2:870\n*E\n"})
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final C0816c f87270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f87271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final boolean[] f87272c;

        public b(C0816c c0816c) {
            this.f87270a = c0816c;
            this.f87272c = new boolean[c.this.f87255d];
        }

        private final void d(boolean z10) {
            c cVar = c.this;
            synchronized (cVar) {
                try {
                    if (this.f87271b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (Intrinsics.areEqual(this.f87270a.b(), this)) {
                        cVar.x(this, z10);
                    }
                    this.f87271b = true;
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void a() {
            d(false);
        }

        public final void b() {
            d(true);
        }

        @Nullable
        public final d c() {
            d dVarI;
            c cVar = c.this;
            synchronized (cVar) {
                b();
                dVarI = cVar.I(this.f87270a.d());
            }
            return dVarI;
        }

        public final void e() {
            if (Intrinsics.areEqual(this.f87270a.b(), this)) {
                this.f87270a.m(true);
            }
        }

        @NotNull
        public final r0 f(int i10) {
            r0 r0Var;
            c cVar = c.this;
            synchronized (cVar) {
                if (this.f87271b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.f87272c[i10] = true;
                r0 r0Var2 = this.f87270a.c().get(i10);
                coil.util.e.a(cVar.f87269v, r0Var2);
                r0Var = r0Var2;
            }
            return r0Var;
        }

        @NotNull
        public final C0816c g() {
            return this.f87270a;
        }

        @NotNull
        public final boolean[] h() {
            return this.f87272c;
        }
    }

    /* JADX INFO: renamed from: coil.disk.c$c, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$Entry\n+ 2 Collections.kt\ncoil/util/-Collections\n*L\n1#1,869:1\n12#2,4:870\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$Entry\n*L\n841#1:870,4\n*E\n"})
    public final class C0816c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f87274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final long[] f87275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final ArrayList<r0> f87276c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final ArrayList<r0> f87277d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f87278e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f87279f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private b f87280g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f87281h;

        public C0816c(String str) {
            this.f87274a = str;
            this.f87275b = new long[c.this.f87255d];
            this.f87276c = new ArrayList<>(c.this.f87255d);
            this.f87277d = new ArrayList<>(c.this.f87255d);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int i10 = c.this.f87255d;
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(i11);
                this.f87276c.add(c.this.f87252a.D(sb2.toString()));
                sb2.append(".tmp");
                this.f87277d.add(c.this.f87252a.D(sb2.toString()));
                sb2.setLength(length);
            }
        }

        @NotNull
        public final ArrayList<r0> a() {
            return this.f87276c;
        }

        @Nullable
        public final b b() {
            return this.f87280g;
        }

        @NotNull
        public final ArrayList<r0> c() {
            return this.f87277d;
        }

        @NotNull
        public final String d() {
            return this.f87274a;
        }

        @NotNull
        public final long[] e() {
            return this.f87275b;
        }

        public final int f() {
            return this.f87281h;
        }

        public final boolean g() {
            return this.f87278e;
        }

        public final boolean h() {
            return this.f87279f;
        }

        public final void i(@Nullable b bVar) {
            this.f87280g = bVar;
        }

        public final void j(@NotNull List<String> list) throws IOException {
            if (list.size() != c.this.f87255d) {
                throw new IOException("unexpected journal line: " + list);
            }
            try {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f87275b[i10] = Long.parseLong(list.get(i10));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        public final void k(int i10) {
            this.f87281h = i10;
        }

        public final void l(boolean z10) {
            this.f87278e = z10;
        }

        public final void m(boolean z10) {
            this.f87279f = z10;
        }

        @Nullable
        public final d n() {
            if (this.f87278e && this.f87280g == null && !this.f87279f) {
                ArrayList<r0> arrayList = this.f87276c;
                c cVar = c.this;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (!cVar.f87269v.w(arrayList.get(i10))) {
                        try {
                            cVar.k0(this);
                        } catch (IOException unused) {
                        }
                        return null;
                    }
                }
                this.f87281h++;
                return c.this.new d(this);
            }
            return null;
        }

        public final void o(@NotNull m mVar) throws IOException {
            for (long j10 : this.f87275b) {
                mVar.writeByte(32).h5(j10);
            }
        }
    }

    @SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$Snapshot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,869:1\n1#2:870\n*E\n"})
    public final class d implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final C0816c f87283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f87284b;

        public d(C0816c c0816c) {
            this.f87283a = c0816c;
        }

        @Nullable
        public final b a() {
            b bVarE;
            c cVar = c.this;
            synchronized (cVar) {
                close();
                bVarE = cVar.E(this.f87283a.d());
            }
            return bVarE;
        }

        @NotNull
        public final r0 b(int i10) {
            if (this.f87284b) {
                throw new IllegalStateException("snapshot is closed");
            }
            return this.f87283a.a().get(i10);
        }

        @NotNull
        public final C0816c c() {
            return this.f87283a;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f87284b) {
                return;
            }
            this.f87284b = true;
            c cVar = c.this;
            synchronized (cVar) {
                try {
                    C0816c c0816c = this.f87283a;
                    c0816c.k(c0816c.f() - 1);
                    if (this.f87283a.f() == 0 && this.f87283a.h()) {
                        cVar.k0(this.f87283a);
                    }
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$fileSystem$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,869:1\n1#2:870\n*E\n"})
    public static final class e extends w {
        e(v vVar) {
            super(vVar);
        }

        @Override // okio.w, okio.v
        public z0 K(r0 r0Var, boolean z10) throws IOException {
            r0 r0VarX = r0Var.x();
            if (r0VarX != null) {
                j(r0VarX);
            }
            return super.K(r0Var, z10);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f87286a;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f87286a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            c cVar = c.this;
            synchronized (cVar) {
                if (!cVar.f87265n || cVar.f87266o) {
                    return Unit.f312394a;
                }
                try {
                    cVar.r0();
                } catch (IOException unused) {
                    cVar.f87267s = true;
                }
                try {
                    if (cVar.R()) {
                        cVar.x0();
                    }
                } catch (IOException unused2) {
                    cVar.f87268t = true;
                    cVar.f87263l = l0.d(l0.c());
                }
                return Unit.f312394a;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public c(@NotNull v vVar, @NotNull r0 r0Var, @NotNull n0 n0Var, long j10, int i10, int i11) {
        this.f87252a = r0Var;
        this.f87253b = j10;
        this.f87254c = i10;
        this.f87255d = i11;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f87256e = r0Var.D(X);
        this.f87257f = r0Var.D(Y);
        this.f87258g = r0Var.D(Z);
        int i12 = 5 >> 0;
        this.f87259h = new LinkedHashMap<>(0, 0.75f, true);
        this.f87260i = t0.a(q3.c(null, 1, null).plus(n0Var.T(1)));
        this.f87269v = new e(vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R() {
        return this.f87262k >= 2000;
    }

    private final void T() {
        k.f(this.f87260i, null, null, new f(null), 3, null);
    }

    private final m X() {
        return l0.d(new coil.disk.d(this.f87269v.d(this.f87256e), new Function1() { // from class: coil.disk.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.Y(this.f87244a, (IOException) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(c cVar, IOException iOException) {
        cVar.f87264m = true;
        return Unit.f312394a;
    }

    private final void d0() throws IOException {
        Iterator<C0816c> it = this.f87259h.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            C0816c next = it.next();
            int i10 = 0;
            if (next.b() == null) {
                int i11 = this.f87255d;
                while (i10 < i11) {
                    j10 += next.e()[i10];
                    i10++;
                }
            } else {
                next.i(null);
                int i12 = this.f87255d;
                while (i10 < i12) {
                    this.f87269v.q(next.a().get(i10));
                    this.f87269v.q(next.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.f87261j = j10;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e1  */
    private final void f0() throws Throwable {
        n nVarE = l0.e(this.f87269v.M(this.f87256e));
        try {
            String strLb = nVarE.lb();
            String strLb2 = nVarE.lb();
            String strLb3 = nVarE.lb();
            String strLb4 = nVarE.lb();
            String strLb5 = nVarE.lb();
            if (!Intrinsics.areEqual(f87248p0, strLb) || !Intrinsics.areEqual("1", strLb2) || !Intrinsics.areEqual(String.valueOf(this.f87254c), strLb3) || !Intrinsics.areEqual(String.valueOf(this.f87255d), strLb4) || strLb5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strLb + ", " + strLb2 + ", " + strLb3 + ", " + strLb4 + ", " + strLb5 + AbstractJsonLexerKt.END_LIST);
            }
            int i10 = 0;
            while (true) {
                try {
                    g0(nVarE.lb());
                    i10++;
                } catch (EOFException unused) {
                    this.f87262k = i10 - this.f87259h.size();
                    if (nVarE.y1()) {
                        this.f87263l = X();
                    } else {
                        x0();
                    }
                    Unit unit = Unit.f312394a;
                    if (nVarE != null) {
                        try {
                            nVarE.close();
                        } catch (Throwable th2) {
                            th = th2;
                            if (th != null) {
                                throw th;
                            }
                        }
                    }
                    th = null;
                    if (th != null) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (nVarE != null) {
                try {
                    nVarE.close();
                } catch (Throwable th4) {
                    p.a(th, th4);
                }
            }
            if (th != null) {
                throw th;
            }
        }
    }

    private final void g0(String str) throws IOException {
        String strSubstring;
        int iQ3 = StringsKt.q3(str, ' ', 0, false, 6, null);
        if (iQ3 == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iQ3 + 1;
        int iQ4 = StringsKt.q3(str, ' ', i10, false, 4, null);
        if (iQ4 == -1) {
            strSubstring = str.substring(i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (iQ3 == 6 && StringsKt.u2(str, f87245g3, false, 2, null)) {
                this.f87259h.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iQ4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        LinkedHashMap<String, C0816c> linkedHashMap = this.f87259h;
        C0816c c0816c = linkedHashMap.get(strSubstring);
        if (c0816c == null) {
            c0816c = new C0816c(strSubstring);
            linkedHashMap.put(strSubstring, c0816c);
        }
        C0816c c0816c2 = c0816c;
        if (iQ4 != -1 && iQ3 == 5 && StringsKt.u2(str, H1, false, 2, null)) {
            String strSubstring2 = str.substring(iQ4 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            List<String> listT4 = StringsKt.T4(strSubstring2, new char[]{' '}, false, 0, 6, null);
            c0816c2.l(true);
            c0816c2.i(null);
            c0816c2.j(listT4);
            return;
        }
        if (iQ4 == -1 && iQ3 == 5 && StringsKt.u2(str, f87250p2, false, 2, null)) {
            c0816c2.i(new b(c0816c2));
            return;
        }
        if (iQ4 == -1 && iQ3 == 4 && StringsKt.u2(str, f87246h3, false, 2, null)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k0(C0816c c0816c) throws IOException {
        m mVar;
        if (c0816c.f() > 0 && (mVar = this.f87263l) != null) {
            mVar.pa(f87250p2);
            mVar.writeByte(32);
            mVar.pa(c0816c.d());
            mVar.writeByte(10);
            mVar.flush();
        }
        if (c0816c.f() > 0 || c0816c.b() != null) {
            c0816c.m(true);
            return true;
        }
        int i10 = this.f87255d;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f87269v.q(c0816c.a().get(i11));
            this.f87261j -= c0816c.e()[i11];
            c0816c.e()[i11] = 0;
        }
        this.f87262k++;
        m mVar2 = this.f87263l;
        if (mVar2 != null) {
            mVar2.pa(f87245g3);
            mVar2.writeByte(32);
            mVar2.pa(c0816c.d());
            mVar2.writeByte(10);
        }
        this.f87259h.remove(c0816c.d());
        if (R()) {
            T();
        }
        return true;
    }

    private final boolean o0() throws IOException {
        for (C0816c c0816c : this.f87259h.values()) {
            if (!c0816c.h()) {
                k0(c0816c);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0() {
        while (this.f87261j > this.f87253b) {
            if (!o0()) {
                return;
            }
        }
        this.f87267s = false;
    }

    private final void t() {
        if (this.f87266o) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private final void w0(String str) {
        if (f87247i3.k(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void x(b bVar, boolean z10) {
        try {
            C0816c c0816cG = bVar.g();
            if (!Intrinsics.areEqual(c0816cG.b(), bVar)) {
                throw new IllegalStateException("Check failed.");
            }
            int i10 = 0;
            if (!z10 || c0816cG.h()) {
                int i11 = this.f87255d;
                while (i10 < i11) {
                    this.f87269v.q(c0816cG.c().get(i10));
                    i10++;
                }
            } else {
                int i12 = this.f87255d;
                for (int i13 = 0; i13 < i12; i13++) {
                    if (bVar.h()[i13] && !this.f87269v.w(c0816cG.c().get(i13))) {
                        bVar.a();
                        return;
                    }
                }
                int i14 = this.f87255d;
                while (i10 < i14) {
                    r0 r0Var = c0816cG.c().get(i10);
                    r0 r0Var2 = c0816cG.a().get(i10);
                    if (this.f87269v.w(r0Var)) {
                        this.f87269v.g(r0Var, r0Var2);
                    } else {
                        coil.util.e.a(this.f87269v, c0816cG.a().get(i10));
                    }
                    long j10 = c0816cG.e()[i10];
                    Long lH = this.f87269v.D(r0Var2).h();
                    long jLongValue = lH != null ? lH.longValue() : 0L;
                    c0816cG.e()[i10] = jLongValue;
                    this.f87261j = (this.f87261j - j10) + jLongValue;
                    i10++;
                }
            }
            c0816cG.i(null);
            if (c0816cG.h()) {
                k0(c0816cG);
                return;
            }
            this.f87262k++;
            m mVar = this.f87263l;
            Intrinsics.checkNotNull(mVar);
            if (z10 || c0816cG.g()) {
                c0816cG.l(true);
                mVar.pa(H1);
                mVar.writeByte(32);
                mVar.pa(c0816cG.d());
                c0816cG.o(mVar);
                mVar.writeByte(10);
            } else {
                this.f87259h.remove(c0816cG.d());
                mVar.pa(f87245g3);
                mVar.writeByte(32);
                mVar.pa(c0816cG.d());
                mVar.writeByte(10);
            }
            mVar.flush();
            if (this.f87261j > this.f87253b || R()) {
                T();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void x0() {
        Throwable th2;
        try {
            m mVar = this.f87263l;
            if (mVar != null) {
                mVar.close();
            }
            m mVarD = l0.d(this.f87269v.K(this.f87257f, false));
            try {
                mVarD.pa(f87248p0).writeByte(10);
                mVarD.pa("1").writeByte(10);
                mVarD.h5(this.f87254c).writeByte(10);
                mVarD.h5(this.f87255d).writeByte(10);
                mVarD.writeByte(10);
                for (C0816c c0816c : this.f87259h.values()) {
                    if (c0816c.b() != null) {
                        mVarD.pa(f87250p2);
                        mVarD.writeByte(32);
                        mVarD.pa(c0816c.d());
                        mVarD.writeByte(10);
                    } else {
                        mVarD.pa(H1);
                        mVarD.writeByte(32);
                        mVarD.pa(c0816c.d());
                        c0816c.o(mVarD);
                        mVarD.writeByte(10);
                    }
                }
                Unit unit = Unit.f312394a;
                if (mVarD != null) {
                    try {
                        mVarD.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                th2 = null;
            } catch (Throwable th4) {
                if (mVarD != null) {
                    try {
                        mVarD.close();
                    } catch (Throwable th5) {
                        p.a(th4, th5);
                    }
                }
                th2 = th4;
            }
            if (th2 != null) {
                throw th2;
            }
            if (this.f87269v.w(this.f87256e)) {
                this.f87269v.g(this.f87256e, this.f87258g);
                this.f87269v.g(this.f87257f, this.f87256e);
                this.f87269v.q(this.f87258g);
            } else {
                this.f87269v.g(this.f87257f, this.f87256e);
            }
            this.f87263l = X();
            this.f87262k = 0;
            this.f87264m = false;
            this.f87268t = false;
        } catch (Throwable th6) {
            throw th6;
        }
    }

    private final void y() throws IOException {
        close();
        coil.util.e.b(this.f87269v, this.f87252a);
    }

    @Nullable
    public final synchronized b E(@NotNull String str) {
        try {
            t();
            w0(str);
            N();
            C0816c c0816c = this.f87259h.get(str);
            if ((c0816c != null ? c0816c.b() : null) != null) {
                return null;
            }
            if (c0816c != null && c0816c.f() != 0) {
                return null;
            }
            if (!this.f87267s && !this.f87268t) {
                m mVar = this.f87263l;
                Intrinsics.checkNotNull(mVar);
                mVar.pa(f87250p2);
                mVar.writeByte(32);
                mVar.pa(str);
                mVar.writeByte(10);
                mVar.flush();
                if (this.f87264m) {
                    return null;
                }
                if (c0816c == null) {
                    c0816c = new C0816c(str);
                    this.f87259h.put(str, c0816c);
                }
                b bVar = new b(c0816c);
                c0816c.i(bVar);
                return bVar;
            }
            T();
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void H() {
        try {
            N();
            for (C0816c c0816c : (C0816c[]) this.f87259h.values().toArray(new C0816c[0])) {
                k0(c0816c);
            }
            this.f87267s = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Nullable
    public final synchronized d I(@NotNull String str) {
        d dVarN;
        t();
        w0(str);
        N();
        C0816c c0816c = this.f87259h.get(str);
        if (c0816c != null && (dVarN = c0816c.n()) != null) {
            this.f87262k++;
            m mVar = this.f87263l;
            Intrinsics.checkNotNull(mVar);
            mVar.pa(f87246h3);
            mVar.writeByte(32);
            mVar.pa(str);
            mVar.writeByte(10);
            if (R()) {
                T();
            }
            return dVarN;
        }
        return null;
    }

    public final synchronized void N() {
        try {
            if (this.f87265n) {
                return;
            }
            this.f87269v.q(this.f87257f);
            if (this.f87269v.w(this.f87258g)) {
                if (this.f87269v.w(this.f87256e)) {
                    this.f87269v.q(this.f87258g);
                } else {
                    this.f87269v.g(this.f87258g, this.f87256e);
                }
            }
            if (this.f87269v.w(this.f87256e)) {
                try {
                    f0();
                    d0();
                    this.f87265n = true;
                    return;
                } catch (IOException unused) {
                    try {
                        y();
                        this.f87266o = false;
                        x0();
                        this.f87265n = true;
                    } catch (Throwable th2) {
                        this.f87266o = false;
                        throw th2;
                    }
                }
            }
            x0();
            this.f87265n = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f87265n && !this.f87266o) {
                for (C0816c c0816c : (C0816c[]) this.f87259h.values().toArray(new C0816c[0])) {
                    b bVarB = c0816c.b();
                    if (bVarB != null) {
                        bVarB.e();
                    }
                }
                r0();
                t0.f(this.f87260i, null, 1, null);
                m mVar = this.f87263l;
                Intrinsics.checkNotNull(mVar);
                mVar.close();
                this.f87263l = null;
                this.f87266o = true;
                return;
            }
            this.f87266o = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        try {
            if (this.f87265n) {
                t();
                r0();
                m mVar = this.f87263l;
                Intrinsics.checkNotNull(mVar);
                mVar.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean j0(@NotNull String str) {
        try {
            t();
            w0(str);
            N();
            C0816c c0816c = this.f87259h.get(str);
            if (c0816c == null) {
                return false;
            }
            boolean zK0 = k0(c0816c);
            if (zK0 && this.f87261j <= this.f87253b) {
                this.f87267s = false;
            }
            return zK0;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long size() {
        N();
        return this.f87261j;
    }
}
