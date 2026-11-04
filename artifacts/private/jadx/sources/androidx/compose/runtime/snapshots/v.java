package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.o2;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@o2
@SourceDebugExtension({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n+ 2 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,315:1\n274#1,7:355\n281#1,4:366\n288#1,8:371\n276#1:379\n274#1,7:380\n281#1,4:391\n288#1,8:396\n276#1:404\n274#1,7:405\n281#1,4:416\n288#1,8:421\n276#1:429\n274#1,7:430\n281#1,4:441\n288#1,8:446\n276#1:454\n274#1,7:455\n281#1,4:466\n288#1,8:471\n276#1:479\n280#1:480\n281#1,4:485\n288#1,8:490\n38#2:316\n34#2:317\n46#2:318\n34#2:319\n46#2:320\n34#2:321\n38#2:323\n34#2:324\n46#2:325\n34#2:326\n46#2:327\n34#2:328\n36#2,9:329\n34#2,7:338\n31#2:345\n36#2:346\n36#2:347\n143#2:348\n38#2:349\n34#2:350\n46#2:351\n34#2:352\n46#2:353\n34#2:354\n83#2,4:362\n36#2:370\n83#2,4:387\n36#2:395\n83#2,4:412\n36#2:420\n83#2,4:437\n36#2:445\n83#2,4:462\n36#2:470\n83#2,4:481\n36#2:489\n83#2,4:498\n36#2:502\n36#2:503\n68#2:504\n36#2:505\n36#2:506\n1#3:322\n1557#4:507\n1628#4,3:508\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n*L\n198#1:355,7\n198#1:366,4\n198#1:371,8\n198#1:379\n218#1:380,7\n218#1:391,4\n218#1:396,8\n218#1:404\n222#1:405,7\n222#1:416,4\n222#1:421,8\n222#1:429\n242#1:430,7\n242#1:441,4\n242#1:446,8\n242#1:454\n245#1:455,7\n245#1:466,4\n245#1:471,8\n245#1:479\n275#1:480\n275#1:485,4\n275#1:490,8\n55#1:316\n56#1:317\n57#1:318\n58#1:319\n59#1:320\n60#1:321\n67#1:323\n68#1:324\n69#1:325\n78#1:326\n79#1:327\n88#1:328\n96#1:329,9\n97#1:338,7\n99#1:345\n106#1:346\n117#1:347\n131#1:348\n147#1:349\n148#1:350\n149#1:351\n158#1:352\n159#1:353\n168#1:354\n198#1:362,4\n198#1:370\n218#1:387,4\n218#1:395\n222#1:412,4\n222#1:420\n242#1:437,4\n242#1:445\n245#1:462,4\n245#1:470\n275#1:481,4\n275#1:489\n280#1:498,4\n284#1:502\n291#1:503\n299#1:504\n300#1:505\n301#1:506\n306#1:507\n306#1:508,3\n*E\n"})
public final class v implements Iterable<Long>, qj.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f36598f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f36600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f36601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f36602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final long[] f36603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f36597e = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final v f36599g = new v(0, 0, 0, null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final v a() {
            return v.f36599g;
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", i = {0, 0, 1, 1, 2, 2}, l = {com.planner5d.library.engine.input.f.b.V1, 256, 263}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach$iv", "$this$sequence", FirebaseAnalytics.d.f120644b0, "$this$sequence", FirebaseAnalytics.d.f120644b0}, s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
    @SourceDebugExtension({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet$iterator$1\n+ 2 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n*L\n1#1,315:1\n83#2,4:316\n36#2:320\n36#2:321\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet$iterator$1\n*L\n252#1:316,4\n256#1:320\n263#1:321\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super Long>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f36605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f36606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f36607d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f36608e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = v.this.new b(dVar);
            bVar.f36608e = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:41:0x00fa  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007e -> B:19:0x0082). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a3 -> B:30:0x00c0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00bd -> B:30:0x00c0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00db -> B:43:0x00fc). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fa -> B:42:0x00fb). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 257
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.v.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.n<? super Long> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static {
        int i10 = 7 << 0;
    }

    private v(long j10, long j11, long j12, long[] jArr) {
        this.f36600a = j10;
        this.f36601b = j11;
        this.f36602c = j12;
        this.f36603d = jArr;
    }

    private final v t(v vVar, Function2<? super v, ? super Long, v> function2) {
        long[] jArr = this.f36603d;
        if (jArr != null) {
            for (long j10 : jArr) {
                vVar = function2.invoke(vVar, Long.valueOf(j10));
            }
        }
        if (this.f36601b != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if ((this.f36601b & (1 << i10)) != 0) {
                    vVar = function2.invoke(vVar, Long.valueOf(this.f36602c + ((long) i10)));
                }
            }
        }
        if (this.f36600a != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((this.f36600a & (1 << i11)) != 0) {
                    vVar = function2.invoke(vVar, Long.valueOf(this.f36602c + ((long) i11) + ((long) 64)));
                }
            }
        }
        return vVar;
    }

    @NotNull
    public final v A(@NotNull v vVar) {
        v vVar2 = f36599g;
        if (vVar == vVar2) {
            return this;
        }
        if (this == vVar2) {
            return vVar;
        }
        long j10 = vVar.f36602c;
        long j11 = this.f36602c;
        if (j10 == j11) {
            long[] jArr = vVar.f36603d;
            long[] jArr2 = this.f36603d;
            if (jArr == jArr2) {
                return new v(vVar.f36600a | this.f36600a, this.f36601b | vVar.f36601b, j11, jArr2);
            }
        }
        int i10 = 0;
        if (this.f36603d == null) {
            long[] jArr3 = this.f36603d;
            if (jArr3 != null) {
                for (long j12 : jArr3) {
                    vVar = vVar.B(j12);
                }
            }
            if (this.f36601b != 0) {
                for (int i11 = 0; i11 < 64; i11++) {
                    if ((this.f36601b & (1 << i11)) != 0) {
                        vVar = vVar.B(this.f36602c + ((long) i11));
                    }
                }
            }
            if (this.f36600a != 0) {
                while (i10 < 64) {
                    if ((this.f36600a & (1 << i10)) != 0) {
                        vVar = vVar.B(this.f36602c + ((long) i10) + ((long) 64));
                    }
                    i10++;
                }
            }
            return vVar;
        }
        long[] jArr4 = vVar.f36603d;
        if (jArr4 != null) {
            for (long j13 : jArr4) {
                this = this.B(j13);
            }
        }
        if (vVar.f36601b != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((vVar.f36601b & (1 << i12)) != 0) {
                    this = this.B(vVar.f36602c + ((long) i12));
                }
            }
        }
        if (vVar.f36600a != 0) {
            while (i10 < 64) {
                if ((vVar.f36600a & (1 << i10)) != 0) {
                    this = this.B(vVar.f36602c + ((long) i10) + ((long) 64));
                }
                i10++;
            }
        }
        return this;
    }

    @NotNull
    public final v B(long j10) {
        long j11;
        long j12;
        long[] jArrB;
        long j13 = j10 - this.f36602c;
        long j14 = 0;
        if (Intrinsics.compare(j13, j14) < 0 || Intrinsics.compare(j13, 64) >= 0) {
            long j15 = 64;
            if (Intrinsics.compare(j13, j15) < 0 || Intrinsics.compare(j13, 128) >= 0) {
                long j16 = 128;
                if (Intrinsics.compare(j13, j16) < 0) {
                    long[] jArr = this.f36603d;
                    if (jArr == null) {
                        return new v(this.f36600a, this.f36601b, this.f36602c, new long[]{j10});
                    }
                    int iA = w.a(jArr, j10);
                    if (iA < 0) {
                        return new v(this.f36600a, this.f36601b, this.f36602c, w.u(jArr, -(iA + 1), j10));
                    }
                } else if (!v(j10)) {
                    long j17 = this.f36600a;
                    long j18 = this.f36601b;
                    long j19 = this.f36602c;
                    long j20 = 1;
                    long j21 = ((j10 + j20) / j15) * j15;
                    if (Intrinsics.compare(j21, j14) < 0) {
                        j21 = (Long.MAX_VALUE - j16) + j20;
                    }
                    u uVar = null;
                    long j22 = j17;
                    while (true) {
                        if (Intrinsics.compare(j19, j21) >= 0) {
                            j11 = j18;
                            j12 = j19;
                            break;
                        }
                        if (j18 != 0) {
                            if (uVar == null) {
                                uVar = new u(this.f36603d);
                            }
                            int i10 = 0;
                            while (i10 < 64) {
                                long j23 = j18;
                                if ((j18 & (1 << i10)) != 0) {
                                    uVar.a(((long) i10) + j19);
                                }
                                i10++;
                                j18 = j23;
                            }
                        }
                        if (j22 == 0) {
                            j12 = j21;
                            j11 = 0;
                            break;
                        }
                        j19 += j15;
                        j18 = j22;
                        j22 = 0;
                    }
                    if (uVar == null || (jArrB = uVar.b()) == null) {
                        jArrB = this.f36603d;
                    }
                    return new v(j22, j11, j12, jArrB).B(j10);
                }
            } else {
                long j24 = 1 << (((int) j13) - 64);
                long j25 = this.f36600a;
                if ((j25 & j24) == 0) {
                    return new v(j25 | j24, this.f36601b, this.f36602c, this.f36603d);
                }
            }
        } else {
            long j26 = 1 << ((int) j13);
            long j27 = this.f36601b;
            if ((j27 & j26) == 0) {
                return new v(this.f36600a, j27 | j26, this.f36602c, this.f36603d);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Long> iterator() {
        return kotlin.sequences.o.b(new b(null)).iterator();
    }

    @NotNull
    public final v n(@NotNull v vVar) {
        v vVarB = f36599g;
        if (!Intrinsics.areEqual(vVar, vVarB) && !Intrinsics.areEqual(this, vVarB)) {
            long j10 = vVar.f36602c;
            long j11 = this.f36602c;
            if (j10 == j11) {
                long[] jArr = vVar.f36603d;
                long[] jArr2 = this.f36603d;
                if (jArr == jArr2) {
                    long j12 = this.f36600a;
                    long j13 = vVar.f36600a;
                    long j14 = j12 & j13;
                    long j15 = this.f36601b;
                    long j16 = vVar.f36601b;
                    long j17 = j15 & j16;
                    if (j14 != 0 || j17 != 0 || jArr2 != null) {
                        return new v(j12 & j13, j15 & j16, j11, jArr2);
                    }
                }
            }
            int i10 = 0;
            if (this.f36603d == null) {
                long[] jArr3 = this.f36603d;
                if (jArr3 != null) {
                    for (long j18 : jArr3) {
                        if (vVar.v(j18)) {
                            vVarB = vVarB.B(j18);
                        }
                    }
                }
                if (this.f36601b != 0) {
                    for (int i11 = 0; i11 < 64; i11++) {
                        if ((this.f36601b & (1 << i11)) != 0) {
                            long j19 = this.f36602c + ((long) i11);
                            if (vVar.v(j19)) {
                                vVarB = vVarB.B(j19);
                            }
                        }
                    }
                }
                if (this.f36600a != 0) {
                    while (i10 < 64) {
                        if ((this.f36600a & (1 << i10)) != 0) {
                            long j20 = this.f36602c + ((long) i10) + ((long) 64);
                            if (vVar.v(j20)) {
                                vVarB = vVarB.B(j20);
                            }
                        }
                        i10++;
                    }
                }
                return vVarB;
            }
            long[] jArr4 = vVar.f36603d;
            if (jArr4 != null) {
                for (long j21 : jArr4) {
                    if (v(j21)) {
                        vVarB = vVarB.B(j21);
                    }
                }
            }
            if (vVar.f36601b != 0) {
                for (int i12 = 0; i12 < 64; i12++) {
                    if ((vVar.f36601b & (1 << i12)) != 0) {
                        long j22 = vVar.f36602c + ((long) i12);
                        if (v(j22)) {
                            vVarB = vVarB.B(j22);
                        }
                    }
                }
            }
            if (vVar.f36600a != 0) {
                while (i10 < 64) {
                    if ((vVar.f36600a & (1 << i10)) != 0) {
                        long j23 = vVar.f36602c + ((long) i10) + ((long) 64);
                        if (v(j23)) {
                            vVarB = vVarB.B(j23);
                        }
                    }
                    i10++;
                }
            }
            return vVarB;
        }
        return vVarB;
    }

    @NotNull
    public final v p(@NotNull v vVar) {
        v vVar2 = f36599g;
        if (vVar == vVar2) {
            return this;
        }
        if (this == vVar2) {
            return vVar2;
        }
        long j10 = vVar.f36602c;
        long j11 = this.f36602c;
        if (j10 == j11) {
            long[] jArr = vVar.f36603d;
            long[] jArr2 = this.f36603d;
            if (jArr == jArr2) {
                return new v((~vVar.f36600a) & this.f36600a, this.f36601b & (~vVar.f36601b), j11, jArr2);
            }
        }
        long[] jArr3 = vVar.f36603d;
        if (jArr3 != null) {
            for (long j12 : jArr3) {
                this = this.s(j12);
            }
        }
        if (vVar.f36601b != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if ((vVar.f36601b & (1 << i10)) != 0) {
                    this = this.s(vVar.f36602c + ((long) i10));
                }
            }
        }
        if (vVar.f36600a != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((vVar.f36600a & (1 << i11)) != 0) {
                    this = this.s(vVar.f36602c + ((long) i11) + ((long) 64));
                }
            }
        }
        return this;
    }

    @NotNull
    public final v s(long j10) {
        long[] jArr;
        int iA;
        long j11 = j10 - this.f36602c;
        long j12 = 0;
        if (Intrinsics.compare(j11, j12) >= 0 && Intrinsics.compare(j11, 64) < 0) {
            long j13 = 1 << ((int) j11);
            long j14 = this.f36601b;
            if ((j14 & j13) != 0) {
                return new v(this.f36600a, j14 & (~j13), this.f36602c, this.f36603d);
            }
        } else if (Intrinsics.compare(j11, 64) >= 0 && Intrinsics.compare(j11, 128) < 0) {
            long j15 = 1 << (((int) j11) - 64);
            long j16 = this.f36600a;
            if ((j16 & j15) != 0) {
                return new v(j16 & (~j15), this.f36601b, this.f36602c, this.f36603d);
            }
        } else if (Intrinsics.compare(j11, j12) < 0 && (jArr = this.f36603d) != null && (iA = w.a(jArr, j10)) >= 0) {
            return new v(this.f36600a, this.f36601b, this.f36602c, w.v(jArr, iA));
        }
        return this;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(this, 10));
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        sb2.append(d.k(arrayList, null, null, null, 0, null, null, 63, null));
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    public final void u(@NotNull Function1<? super Long, Unit> function1) {
        long[] jArr = this.f36603d;
        if (jArr != null) {
            for (long j10 : jArr) {
                function1.invoke(Long.valueOf(j10));
            }
        }
        if (this.f36601b != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if ((this.f36601b & (1 << i10)) != 0) {
                    function1.invoke(Long.valueOf(this.f36602c + ((long) i10)));
                }
            }
        }
        if (this.f36600a != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((this.f36600a & (1 << i11)) != 0) {
                    function1.invoke(Long.valueOf(this.f36602c + ((long) i11) + ((long) 64)));
                }
            }
        }
    }

    public final boolean v(long j10) {
        long[] jArr;
        long j11 = j10 - this.f36602c;
        long j12 = 0;
        if (Intrinsics.compare(j11, j12) >= 0 && Intrinsics.compare(j11, 64) < 0) {
            return ((1 << ((int) j11)) & this.f36601b) != 0;
        }
        if (Intrinsics.compare(j11, 64) < 0 || Intrinsics.compare(j11, 128) >= 0) {
            return Intrinsics.compare(j11, j12) <= 0 && (jArr = this.f36603d) != null && w.a(jArr, j10) >= 0;
        }
        return ((1 << (((int) j11) - 64)) & this.f36600a) != 0;
    }

    public final long w(long j10) {
        long[] jArr = this.f36603d;
        if (jArr != null) {
            return jArr[0];
        }
        long j11 = this.f36601b;
        if (j11 != 0) {
            return this.f36602c + ((long) Long.numberOfTrailingZeros(j11));
        }
        long j12 = this.f36600a;
        return j12 != 0 ? this.f36602c + ((long) 64) + ((long) Long.numberOfTrailingZeros(j12)) : j10;
    }
}
