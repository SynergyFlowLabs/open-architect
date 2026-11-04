package okio.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.e2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.l0;
import kotlin.p;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import okio.h1;
import okio.r0;
import okio.t;
import okio.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nZipFiles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n+ 2 Okio.kt\nokio/Okio__OkioKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,503:1\n52#2,4:504\n52#2,4:508\n52#2,22:512\n60#2,10:534\n56#2,3:544\n71#2,3:547\n52#2,22:550\n60#2,10:572\n56#2,3:582\n71#2,3:585\n1045#3:588\n*S KotlinDebug\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n*L\n66#1:504,4\n101#1:508,4\n109#1:512,22\n101#1:534,10\n101#1:544,3\n101#1:547,3\n125#1:550,22\n66#1:572,10\n66#1:582,3\n66#1:585,3\n155#1:588\n*E\n"})
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f334983a = 67324752;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f334984b = 33639248;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f334985c = 101010256;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f334986d = 117853008;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f334987e = 101075792;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f334988f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f334989g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f334990h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f334991i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f334992j = 4294967295L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f334993k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f334994l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f334995m = 21589;

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ZipFiles.kt\nokio/internal/ZipFilesKt\n*L\n1#1,328:1\n155#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l(((l) t10).b(), ((l) t11).b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class b extends l0 implements Function1<l, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f334996a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull l it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    static final class c extends l0 implements Function2<Integer, Long, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.a f334997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f334998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i1.g f334999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ okio.n f335000d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i1.g f335001e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i1.g f335002f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ i1.h<Long> f335003g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ i1.h<Long> f335004h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ i1.h<Long> f335005i;

        static final class a extends l0 implements Function2<Integer, Long, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i1.h<Long> f335006a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ okio.n f335007b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i1.h<Long> f335008c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ i1.h<Long> f335009d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i1.h<Long> hVar, okio.n nVar, i1.h<Long> hVar2, i1.h<Long> hVar3) {
                super(2);
                this.f335006a = hVar;
                this.f335007b = nVar;
                this.f335008c = hVar2;
                this.f335009d = hVar3;
            }

            /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.Long] */
            /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Long] */
            /* JADX WARN: Type inference failed for: r5v7, types: [T, java.lang.Long] */
            public final void c(int i10, long j10) throws IOException {
                if (i10 == 1) {
                    i1.h<Long> hVar = this.f335006a;
                    if (hVar.f312751a != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (j10 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    hVar.f312751a = Long.valueOf(this.f335007b.M4());
                    this.f335008c.f312751a = Long.valueOf(this.f335007b.M4());
                    this.f335009d.f312751a = Long.valueOf(this.f335007b.M4());
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Long l10) throws IOException {
                c(num.intValue(), l10.longValue());
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i1.a aVar, long j10, i1.g gVar, okio.n nVar, i1.g gVar2, i1.g gVar3, i1.h<Long> hVar, i1.h<Long> hVar2, i1.h<Long> hVar3) {
            super(2);
            this.f334997a = aVar;
            this.f334998b = j10;
            this.f334999c = gVar;
            this.f335000d = nVar;
            this.f335001e = gVar2;
            this.f335002f = gVar3;
            this.f335003g = hVar;
            this.f335004h = hVar2;
            this.f335005i = hVar3;
        }

        public final void c(int i10, long j10) throws IOException {
            if (i10 != 1) {
                if (i10 != 10) {
                    return;
                }
                if (j10 < 4) {
                    throw new IOException("bad zip: NTFS extra too short");
                }
                this.f335000d.skip(4L);
                okio.n nVar = this.f335000d;
                m.j(nVar, (int) (j10 - 4), new a(this.f335003g, nVar, this.f335004h, this.f335005i));
                return;
            }
            i1.a aVar = this.f334997a;
            if (aVar.f312744a) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            aVar.f312744a = true;
            if (j10 < this.f334998b) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            i1.g gVar = this.f334999c;
            long jM4 = gVar.f312750a;
            if (jM4 == 4294967295L) {
                jM4 = this.f335000d.M4();
            }
            gVar.f312750a = jM4;
            i1.g gVar2 = this.f335001e;
            gVar2.f312750a = gVar2.f312750a == 4294967295L ? this.f335000d.M4() : 0L;
            i1.g gVar3 = this.f335002f;
            gVar3.f312750a = gVar3.f312750a == 4294967295L ? this.f335000d.M4() : 0L;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Long l10) throws IOException {
            c(num.intValue(), l10.longValue());
            return Unit.f312394a;
        }
    }

    static final class d extends l0 implements Function2<Integer, Long, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ okio.n f335010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1.h<Integer> f335011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i1.h<Integer> f335012c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i1.h<Integer> f335013d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(okio.n nVar, i1.h<Integer> hVar, i1.h<Integer> hVar2, i1.h<Integer> hVar3) {
            super(2);
            this.f335010a = nVar;
            this.f335011b = hVar;
            this.f335012c = hVar2;
            this.f335013d = hVar3;
        }

        /* JADX WARN: Type inference failed for: r10v5, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r11v9, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r12v4, types: [T, java.lang.Integer] */
        public final void c(int i10, long j10) throws IOException {
            if (i10 == m.f334995m) {
                if (j10 < 1) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                byte b10 = this.f335010a.readByte();
                boolean z10 = (b10 & 1) == 1;
                boolean z11 = (b10 & 2) == 2;
                boolean z12 = (b10 & 4) == 4;
                okio.n nVar = this.f335010a;
                long j11 = z10 ? 5L : 1L;
                if (z11) {
                    j11 += 4;
                }
                if (z12) {
                    j11 += 4;
                }
                if (j10 < j11) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                if (z10) {
                    this.f335011b.f312751a = Integer.valueOf(nVar.fe());
                }
                if (z11) {
                    this.f335012c.f312751a = Integer.valueOf(this.f335010a.fe());
                }
                if (z12) {
                    this.f335013d.f312751a = Integer.valueOf(this.f335010a.fe());
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Long l10) throws IOException {
            c(num.intValue(), l10.longValue());
            return Unit.f312394a;
        }
    }

    private static final Map<r0, l> b(List<l> list) {
        r0 r0VarH = r0.a.h(r0.f335070b, "/", false, 1, null);
        Map<r0, l> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(r0VarH, new l(r0VarH, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        for (l lVar : CollectionsKt.sortedWith(list, new a())) {
            if (mapMutableMapOf.put(lVar.b(), lVar) == null) {
                while (true) {
                    r0 r0VarX = lVar.b().x();
                    if (r0VarX == null) {
                        break;
                    }
                    l lVar2 = mapMutableMapOf.get(r0VarX);
                    if (lVar2 != null) {
                        lVar2.c().add(lVar.b());
                        break;
                    }
                    l lVar3 = new l(r0VarX, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                    mapMutableMapOf.put(r0VarX, lVar3);
                    lVar3.c().add(lVar.b());
                    lVar = lVar3;
                }
            }
        }
        return mapMutableMapOf;
    }

    @Nullable
    public static final Long c(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        return Long.valueOf(o.a(((i10 >> 9) & 127) + 1980, (i10 >> 5) & 15, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1));
    }

    public static final long d(long j10) {
        return (j10 / ((long) 10000)) - 11644473600000L;
    }

    private static final String e(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0x");
        String string = Integer.toString(i10, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }

    @NotNull
    public static final h1 f(@NotNull r0 zipPath, @NotNull v fileSystem, @NotNull Function1<? super l, Boolean> predicate) throws IOException {
        Throwable th2;
        Throwable th3;
        Throwable th4;
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        t tVarF = fileSystem.F(zipPath);
        try {
            long size = tVarF.size() - ((long) 22);
            if (size < 0) {
                throw new IOException("not a zip: size=" + tVarF.size());
            }
            long jMax = Math.max(size - PlaybackStateCompat.f9653i3, 0L);
            do {
                okio.n nVarE = okio.l0.e(tVarF.Y(size));
                try {
                    if (nVarE.fe() == f334985c) {
                        i iVarI = i(nVarE);
                        String strU5 = nVarE.u5(iVarI.b());
                        nVarE.close();
                        long j10 = size - ((long) 20);
                        Throwable th5 = null;
                        if (j10 > 0) {
                            okio.n nVarE2 = okio.l0.e(tVarF.Y(j10));
                            try {
                                if (nVarE2.fe() == f334986d) {
                                    int iFe = nVarE2.fe();
                                    long jM4 = nVarE2.M4();
                                    if (nVarE2.fe() != 1 || iFe != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    okio.n nVarE3 = okio.l0.e(tVarF.Y(jM4));
                                    try {
                                        int iFe2 = nVarE3.fe();
                                        if (iFe2 != f334987e) {
                                            throw new IOException("bad zip: expected " + e(f334987e) + " but was " + e(iFe2));
                                        }
                                        iVarI = m(nVarE3, iVarI);
                                        Unit unit = Unit.f312394a;
                                        if (nVarE3 != null) {
                                            try {
                                                nVarE3.close();
                                            } catch (Throwable th6) {
                                                th4 = th6;
                                            }
                                        }
                                        th4 = null;
                                        if (th4 != null) {
                                            throw th4;
                                        }
                                    } catch (Throwable th7) {
                                        if (nVarE3 != null) {
                                            try {
                                                nVarE3.close();
                                            } catch (Throwable th8) {
                                                try {
                                                    p.a(th7, th8);
                                                } catch (Throwable th9) {
                                                    th2 = th9;
                                                    iVarI = iVarI;
                                                    if (nVarE2 != null) {
                                                        try {
                                                            nVarE2.close();
                                                        } catch (Throwable th10) {
                                                            p.a(th2, th10);
                                                        }
                                                    }
                                                    th3 = th2;
                                                }
                                            }
                                        }
                                        th4 = th7;
                                        iVarI = iVarI;
                                    }
                                }
                                Unit unit2 = Unit.f312394a;
                                if (nVarE2 != null) {
                                    try {
                                        nVarE2.close();
                                    } catch (Throwable th11) {
                                        th3 = th11;
                                    }
                                }
                                th3 = null;
                            } catch (Throwable th12) {
                                th2 = th12;
                            }
                            if (th3 != null) {
                                throw th3;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        okio.n nVarE4 = okio.l0.e(tVarF.Y(iVarI.a()));
                        try {
                            long jC = iVarI.c();
                            for (long j11 = 0; j11 < jC; j11++) {
                                l lVarH = h(nVarE4);
                                if (lVarH.s() >= iVarI.a()) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (predicate.invoke(lVarH).booleanValue()) {
                                    arrayList.add(lVarH);
                                }
                            }
                            Unit unit3 = Unit.f312394a;
                            if (nVarE4 != null) {
                                try {
                                    nVarE4.close();
                                } catch (Throwable th13) {
                                    th5 = th13;
                                }
                            }
                        } catch (Throwable th14) {
                            if (nVarE4 != null) {
                                try {
                                    nVarE4.close();
                                } catch (Throwable th15) {
                                    p.a(th14, th15);
                                }
                            }
                            th5 = th14;
                        }
                        if (th5 != null) {
                            throw th5;
                        }
                        h1 h1Var = new h1(zipPath, fileSystem, b(arrayList), strU5);
                        if (tVarF != null) {
                            try {
                                tVarF.close();
                            } catch (Throwable unused) {
                            }
                        }
                        return h1Var;
                    }
                    nVarE.close();
                    size--;
                } catch (Throwable th16) {
                    nVarE.close();
                    throw th16;
                }
            } while (size >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } catch (Throwable th17) {
            if (tVarF == null) {
                throw th17;
            }
            try {
                tVarF.close();
                throw th17;
            } catch (Throwable th18) {
                p.a(th17, th18);
                throw th17;
            }
        }
    }

    public static /* synthetic */ h1 g(r0 r0Var, v vVar, Function1 function1, int i10, Object obj) throws IOException {
        if ((i10 & 4) != 0) {
            function1 = b.f334996a;
        }
        return f(r0Var, vVar, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final l h(@NotNull okio.n nVar) throws IOException {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        int iFe = nVar.fe();
        if (iFe != f334984b) {
            throw new IOException("bad zip: expected " + e(f334984b) + " but was " + e(iFe));
        }
        nVar.skip(4L);
        short sB4 = nVar.B4();
        int i10 = sB4 & e2.f312492d;
        if ((sB4 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + e(i10));
        }
        int iB4 = nVar.B4() & e2.f312492d;
        int iB5 = nVar.B4() & e2.f312492d;
        int iB6 = nVar.B4() & e2.f312492d;
        long jFe = ((long) nVar.fe()) & 4294967295L;
        i1.g gVar = new i1.g();
        gVar.f312750a = ((long) nVar.fe()) & 4294967295L;
        i1.g gVar2 = new i1.g();
        gVar2.f312750a = ((long) nVar.fe()) & 4294967295L;
        int iB7 = nVar.B4() & e2.f312492d;
        int iB8 = nVar.B4() & e2.f312492d;
        int iB9 = nVar.B4() & e2.f312492d;
        nVar.skip(8L);
        i1.g gVar3 = new i1.g();
        gVar3.f312750a = ((long) nVar.fe()) & 4294967295L;
        String strU5 = nVar.u5(iB7);
        if (StringsKt.U2(strU5, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j10 = gVar2.f312750a == 4294967295L ? 8 : 0L;
        if (gVar.f312750a == 4294967295L) {
            j10 += (long) 8;
        }
        if (gVar3.f312750a == 4294967295L) {
            j10 += (long) 8;
        }
        long j11 = j10;
        i1.h hVar = new i1.h();
        i1.h hVar2 = new i1.h();
        i1.h hVar3 = new i1.h();
        i1.a aVar = new i1.a();
        j(nVar, iB8, new c(aVar, j11, gVar2, nVar, gVar, gVar3, hVar, hVar2, hVar3));
        if (j11 <= 0 || aVar.f312744a) {
            return new l(r0.a.h(r0.f335070b, "/", false, 1, null).D(strU5), StringsKt.M1(strU5, "/", false, 2, null), nVar.u5(iB9), jFe, gVar.f312750a, gVar2.f312750a, iB4, gVar3.f312750a, iB6, iB5, (Long) hVar.f312751a, (Long) hVar2.f312751a, (Long) hVar3.f312751a, null, null, null, 57344, null);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    private static final i i(okio.n nVar) throws IOException {
        int iB4 = nVar.B4() & e2.f312492d;
        int iB5 = nVar.B4() & e2.f312492d;
        long jB4 = nVar.B4() & e2.f312492d;
        if (jB4 != (nVar.B4() & e2.f312492d) || iB4 != 0 || iB5 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        nVar.skip(4L);
        return new i(jB4, 4294967295L & ((long) nVar.fe()), nVar.B4() & e2.f312492d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(okio.n nVar, int i10, Function2<? super Integer, ? super Long, Unit> function2) throws IOException {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iB4 = nVar.B4() & e2.f312492d;
            long jB4 = ((long) nVar.B4()) & okhttp3.internal.ws.g.f334653t;
            long j11 = j10 - ((long) 4);
            if (j11 < jB4) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            nVar.q1(jB4);
            long size = nVar.n().size();
            function2.invoke(Integer.valueOf(iB4), Long.valueOf(jB4));
            long size2 = (nVar.n().size() + jB4) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + iB4);
            }
            if (size2 > 0) {
                nVar.n().skip(size2);
            }
            j10 = j11 - jB4;
        }
    }

    @NotNull
    public static final l k(@NotNull okio.n nVar, @NotNull l centralDirectoryZipEntry) throws IOException {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(centralDirectoryZipEntry, "centralDirectoryZipEntry");
        l lVarL = l(nVar, centralDirectoryZipEntry);
        Intrinsics.checkNotNull(lVarL);
        return lVarL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final l l(okio.n nVar, l lVar) throws IOException {
        int iFe = nVar.fe();
        if (iFe != f334983a) {
            throw new IOException("bad zip: expected " + e(f334983a) + " but was " + e(iFe));
        }
        nVar.skip(2L);
        short sB4 = nVar.B4();
        int i10 = sB4 & e2.f312492d;
        if ((sB4 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + e(i10));
        }
        nVar.skip(18L);
        long jB4 = ((long) nVar.B4()) & okhttp3.internal.ws.g.f334653t;
        int iB4 = nVar.B4() & e2.f312492d;
        nVar.skip(jB4);
        if (lVar == null) {
            nVar.skip(iB4);
            return null;
        }
        i1.h hVar = new i1.h();
        i1.h hVar2 = new i1.h();
        i1.h hVar3 = new i1.h();
        j(nVar, iB4, new d(nVar, hVar, hVar2, hVar3));
        return lVar.a((Integer) hVar.f312751a, (Integer) hVar2.f312751a, (Integer) hVar3.f312751a);
    }

    private static final i m(okio.n nVar, i iVar) throws IOException {
        nVar.skip(12L);
        int iFe = nVar.fe();
        int iFe2 = nVar.fe();
        long jM4 = nVar.M4();
        if (jM4 != nVar.M4() || iFe != 0 || iFe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        nVar.skip(8L);
        return new i(jM4, nVar.M4(), iVar.b());
    }

    public static final void n(@NotNull okio.n nVar) throws IOException {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        l(nVar, null);
    }
}
