package androidx.compose.material3;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 10 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 11 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 12 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 13 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 14 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 15 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 16 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,3223:1\n1#2:3224\n1282#3,6:3225\n1282#3,6:3231\n1282#3,6:3238\n1282#3,6:3244\n1282#3,6:3252\n1282#3,6:3258\n1282#3,6:3264\n1282#3,6:3270\n1282#3,6:3276\n1282#3,6:3282\n1282#3,6:3288\n1282#3,6:3294\n1282#3,6:3300\n1282#3,6:3306\n1282#3,6:3312\n1282#3,6:3318\n1282#3,6:3324\n1282#3,6:3330\n1282#3,6:3336\n60#4:3237\n60#4:3250\n60#4:3251\n61#5:3342\n57#5:3345\n57#5:3353\n57#5:3364\n61#5:3371\n57#5:3385\n57#5:3413\n57#5:3420\n61#5:3423\n61#5:3429\n57#5:3461\n57#5:3472\n61#5:3479\n61#5:3486\n57#5:3502\n57#5:3527\n61#5:3530\n57#5:3536\n61#5:3539\n57#5:3552\n57#5:3621\n61#5:3624\n61#5:3627\n70#6:3343\n60#6:3346\n70#6:3349\n60#6:3352\n60#6:3354\n53#6,3:3357\n53#6,3:3361\n60#6:3365\n53#6,3:3368\n70#6:3372\n53#6,3:3375\n60#6:3379\n53#6,3:3382\n60#6:3386\n70#6:3389\n53#6,3:3391\n70#6:3395\n53#6,3:3398\n53#6,3:3402\n53#6,3:3406\n53#6,3:3410\n60#6:3414\n53#6,3:3417\n60#6:3421\n70#6:3424\n53#6,3:3426\n70#6:3430\n53#6,3:3433\n60#6:3437\n53#6,3:3440\n70#6:3444\n53#6,3:3447\n70#6:3451\n53#6,3:3454\n53#6,3:3458\n60#6:3462\n53#6,3:3465\n53#6,3:3469\n60#6:3473\n53#6,3:3476\n70#6:3480\n53#6,3:3483\n70#6:3487\n53#6,3:3490\n60#6:3496\n53#6,3:3499\n60#6:3503\n70#6:3506\n53#6,3:3508\n70#6:3512\n53#6,3:3515\n53#6,3:3520\n53#6,3:3524\n60#6:3528\n70#6:3531\n53#6,3:3533\n60#6:3537\n70#6:3540\n53#6,3:3542\n70#6:3546\n53#6,3:3549\n60#6:3553\n70#6:3556\n53#6,3:3558\n60#6:3562\n60#6:3565\n70#6:3568\n53#6,3:3571\n60#6:3575\n60#6:3578\n70#6:3581\n53#6,3:3584\n60#6:3610\n70#6:3613\n53#6,3:3615\n60#6:3622\n70#6:3625\n70#6:3628\n22#7:3344\n22#7:3350\n22#7:3355\n22#7:3366\n22#7:3373\n22#7:3380\n22#7:3387\n22#7:3396\n22#7:3415\n22#7:3422\n22#7:3431\n22#7:3438\n22#7:3445\n22#7:3452\n22#7:3463\n22#7:3474\n22#7:3481\n22#7:3488\n22#7:3497\n22#7:3504\n22#7:3513\n22#7:3529\n22#7:3538\n22#7:3547\n22#7:3554\n22#7:3563\n22#7:3566\n22#7:3569\n22#7:3576\n22#7:3579\n22#7:3582\n22#7:3611\n22#7:3623\n22#7:3626\n22#7:3629\n113#8:3347\n69#9:3348\n65#9:3351\n65#9:3378\n69#9:3388\n69#9:3394\n65#9:3436\n69#9:3443\n69#9:3450\n65#9:3495\n69#9:3505\n69#9:3511\n69#9:3545\n69#9:3555\n65#9:3561\n65#9:3564\n69#9:3567\n65#9:3574\n65#9:3577\n69#9:3580\n65#9:3609\n69#9:3612\n30#10:3356\n30#10:3360\n30#10:3381\n30#10:3390\n30#10:3397\n30#10:3401\n30#10:3405\n30#10:3409\n30#10:3439\n30#10:3446\n30#10:3453\n30#10:3457\n30#10:3464\n30#10:3468\n30#10:3498\n30#10:3507\n30#10:3514\n30#10:3548\n30#10:3557\n30#10:3570\n30#10:3583\n30#10:3614\n33#11:3367\n33#11:3374\n33#11:3416\n33#11:3425\n33#11:3432\n33#11:3475\n33#11:3482\n33#11:3489\n33#11:3532\n33#11:3541\n13524#12,2:3493\n13526#12:3518\n10673#12:3587\n10923#12,3:3588\n10926#12,3:3598\n33#13:3519\n33#13:3523\n381#14,7:3591\n216#15:3601\n217#15:3620\n150#16,3:3602\n34#16,4:3605\n39#16:3618\n153#16:3619\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults\n*L\n1214#1:3225,6\n1215#1:3231,6\n1267#1:3238,6\n1268#1:3244,6\n1324#1:3252,6\n1435#1:3258,6\n1442#1:3264,6\n1491#1:3270,6\n1498#1:3276,6\n1545#1:3282,6\n1552#1:3288,6\n1602#1:3294,6\n1623#1:3300,6\n1723#1:3306,6\n1730#1:3312,6\n1774#1:3318,6\n1781#1:3324,6\n1818#1:3330,6\n1829#1:3336,6\n1230#1:3237\n1284#1:3250\n1286#1:3251\n1885#1:3342\n1885#1:3345\n1942#1:3353\n1948#1:3364\n1950#1:3371\n1964#1:3385\n1997#1:3413\n1999#1:3420\n1999#1:3423\n2001#1:3429\n2051#1:3461\n2058#1:3472\n2060#1:3479\n2062#1:3486\n2102#1:3502\n2127#1:3527\n2127#1:3530\n2135#1:3536\n2135#1:3539\n1327#1:3552\n1627#1:3621\n1629#1:3624\n1832#1:3627\n1885#1:3343\n1885#1:3346\n1922#1:3349\n1922#1:3352\n1942#1:3354\n1942#1:3357,3\n1944#1:3361,3\n1948#1:3365\n1948#1:3368,3\n1950#1:3372\n1950#1:3375,3\n1962#1:3379\n1962#1:3382,3\n1964#1:3386\n1964#1:3389\n1964#1:3391,3\n1966#1:3395\n1966#1:3398,3\n1989#1:3402,3\n1991#1:3406,3\n1993#1:3410,3\n1997#1:3414\n1997#1:3417,3\n1999#1:3421\n1999#1:3424\n1999#1:3426,3\n2001#1:3430\n2001#1:3433,3\n2013#1:3437\n2013#1:3440,3\n2015#1:3444\n2015#1:3447,3\n2017#1:3451\n2017#1:3454,3\n2049#1:3458,3\n2051#1:3462\n2051#1:3465,3\n2053#1:3469,3\n2058#1:3473\n2058#1:3476,3\n2060#1:3480\n2060#1:3483,3\n2062#1:3487\n2062#1:3490,3\n2100#1:3496\n2100#1:3499,3\n2102#1:3503\n2102#1:3506\n2102#1:3508,3\n2104#1:3512\n2104#1:3515,3\n2122#1:3520,3\n2123#1:3524,3\n2127#1:3528\n2127#1:3531\n2127#1:3533,3\n2135#1:3537\n2135#1:3540\n2135#1:3542,3\n1326#1:3546\n1326#1:3549,3\n1327#1:3553\n1327#1:3556\n1327#1:3558,3\n1335#1:3562\n1336#1:3565\n1337#1:3568\n1334#1:3571,3\n1342#1:3575\n1343#1:3578\n1344#1:3581\n1341#1:3584,3\n1361#1:3610\n1361#1:3613\n1361#1:3615,3\n1627#1:3622\n1629#1:3625\n1832#1:3628\n1885#1:3344\n1922#1:3350\n1942#1:3355\n1948#1:3366\n1950#1:3373\n1962#1:3380\n1964#1:3387\n1966#1:3396\n1997#1:3415\n1999#1:3422\n2001#1:3431\n2013#1:3438\n2015#1:3445\n2017#1:3452\n2051#1:3463\n2058#1:3474\n2060#1:3481\n2062#1:3488\n2100#1:3497\n2102#1:3504\n2104#1:3513\n2127#1:3529\n2135#1:3538\n1326#1:3547\n1327#1:3554\n1335#1:3563\n1336#1:3566\n1337#1:3569\n1342#1:3576\n1343#1:3579\n1344#1:3582\n1361#1:3611\n1627#1:3623\n1629#1:3626\n1832#1:3629\n1913#1:3347\n1922#1:3348\n1922#1:3351\n1962#1:3378\n1964#1:3388\n1966#1:3394\n2013#1:3436\n2015#1:3443\n2017#1:3450\n2100#1:3495\n2102#1:3505\n2104#1:3511\n1326#1:3545\n1327#1:3555\n1335#1:3561\n1336#1:3564\n1337#1:3567\n1342#1:3574\n1343#1:3577\n1344#1:3580\n1361#1:3609\n1361#1:3612\n1942#1:3356\n1944#1:3360\n1962#1:3381\n1964#1:3390\n1966#1:3397\n1989#1:3401\n1991#1:3405\n1993#1:3409\n2013#1:3439\n2015#1:3446\n2017#1:3453\n2049#1:3457\n2051#1:3464\n2053#1:3468\n2100#1:3498\n2102#1:3507\n2104#1:3514\n1326#1:3548\n1327#1:3557\n1334#1:3570\n1341#1:3583\n1361#1:3614\n1948#1:3367\n1950#1:3374\n1997#1:3416\n1999#1:3425\n2001#1:3432\n2058#1:3475\n2060#1:3482\n2062#1:3489\n2127#1:3532\n2135#1:3541\n2080#1:3493,2\n2080#1:3518\n1355#1:3587\n1355#1:3588,3\n1355#1:3598,3\n2122#1:3519\n2123#1:3523\n1355#1:3591,7\n1359#1:3601\n1359#1:3620\n1361#1:3602,3\n1361#1:3605,4\n1361#1:3618\n1361#1:3619\n*E\n"})
public final class kz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final kz f30140a = new kz();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f30141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f30142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.graphics.k2 f30143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f30144e = 0;

    static final class a implements pj.n<androidx.compose.ui.graphics.drawscope.f, n0.g, androidx.compose.ui.graphics.q0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30145a = new a();

        a() {
        }

        public final void c(androidx.compose.ui.graphics.drawscope.f fVar, long j10, long j11) {
            kz kzVar = kz.f30140a;
            kzVar.k0(fVar, j10, kzVar.p0(), j11);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.drawscope.f fVar, n0.g gVar, androidx.compose.ui.graphics.q0 q0Var) {
            c(fVar, gVar.B(), q0Var.M());
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SliderDefaults$Thumb$1$1", f = "Slider.kt", i = {}, l = {1216}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f30147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.g> f30148c;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.g> f30149a;

            a(SnapshotStateList<androidx.compose.foundation.interaction.g> snapshotStateList) {
                this.f30149a = snapshotStateList;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                if (gVar instanceof androidx.compose.foundation.interaction.l.b) {
                    this.f30149a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.c) {
                    this.f30149a.remove(((androidx.compose.foundation.interaction.l.c) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.a) {
                    this.f30149a.remove(((androidx.compose.foundation.interaction.l.a) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.b) {
                    this.f30149a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.c) {
                    this.f30149a.remove(((androidx.compose.foundation.interaction.a.c) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.C0087a) {
                    this.f30149a.remove(((androidx.compose.foundation.interaction.a.C0087a) gVar).a());
                }
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.foundation.interaction.j jVar, SnapshotStateList<androidx.compose.foundation.interaction.g> snapshotStateList, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f30147b = jVar;
            this.f30148c = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f30147b, this.f30148c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f30146a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.g> iVarC = this.f30147b.c();
                a aVar = new a(this.f30148c);
                this.f30146a = 1;
                if (iVarC.collect(aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SliderDefaults$Thumb$3$1", f = "Slider.kt", i = {}, l = {1269}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f30151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.g> f30152c;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<androidx.compose.foundation.interaction.g> f30153a;

            a(SnapshotStateList<androidx.compose.foundation.interaction.g> snapshotStateList) {
                this.f30153a = snapshotStateList;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                if (gVar instanceof androidx.compose.foundation.interaction.l.b) {
                    this.f30153a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.c) {
                    this.f30153a.remove(((androidx.compose.foundation.interaction.l.c) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.l.a) {
                    this.f30153a.remove(((androidx.compose.foundation.interaction.l.a) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.b) {
                    this.f30153a.add(gVar);
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.c) {
                    this.f30153a.remove(((androidx.compose.foundation.interaction.a.c) gVar).a());
                } else if (gVar instanceof androidx.compose.foundation.interaction.a.C0087a) {
                    this.f30153a.remove(((androidx.compose.foundation.interaction.a.C0087a) gVar).a());
                }
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.foundation.interaction.j jVar, SnapshotStateList<androidx.compose.foundation.interaction.g> snapshotStateList, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f30151b = jVar;
            this.f30152c = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f30151b, this.f30152c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f30150a;
            int i11 = 0 >> 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.g> iVarC = this.f30151b.c();
                a aVar = new a(this.f30152c);
                this.f30150a = 1;
                if (iVarC.collect(aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class d implements pj.n<androidx.compose.ui.graphics.drawscope.f, n0.g, androidx.compose.ui.graphics.q0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f30154a = new d();

        d() {
        }

        public final void c(androidx.compose.ui.graphics.drawscope.f fVar, long j10, long j11) {
            kz kzVar = kz.f30140a;
            kzVar.k0(fVar, j10, kzVar.p0(), j11);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.drawscope.f fVar, n0.g gVar, androidx.compose.ui.graphics.q0 q0Var) {
            c(fVar, gVar.B(), q0Var.M());
            return Unit.f312394a;
        }
    }

    static final class e implements pj.n<androidx.compose.ui.graphics.drawscope.f, n0.g, androidx.compose.ui.graphics.q0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f30155a = new e();

        e() {
        }

        public final void c(androidx.compose.ui.graphics.drawscope.f fVar, long j10, long j11) {
            kz kzVar = kz.f30140a;
            kzVar.k0(fVar, j10, kzVar.p0(), j11);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.drawscope.f fVar, n0.g gVar, androidx.compose.ui.graphics.q0 q0Var) {
            c(fVar, gVar.B(), q0Var.M());
            return Unit.f312394a;
        }
    }

    static final class f implements pj.n<androidx.compose.ui.graphics.drawscope.f, n0.g, androidx.compose.ui.graphics.q0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f30156a = new f();

        f() {
        }

        public final void c(androidx.compose.ui.graphics.drawscope.f fVar, long j10, long j11) {
            kz kzVar = kz.f30140a;
            kzVar.k0(fVar, j10, kzVar.p0(), j11);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.drawscope.f fVar, n0.g gVar, androidx.compose.ui.graphics.q0 q0Var) {
            c(fVar, gVar.B(), q0Var.M());
            return Unit.f312394a;
        }
    }

    static final class g implements pj.n<androidx.compose.ui.graphics.drawscope.f, n0.g, androidx.compose.ui.graphics.q0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f30157a = new g();

        g() {
        }

        public final void c(androidx.compose.ui.graphics.drawscope.f fVar, long j10, long j11) {
            kz kzVar = kz.f30140a;
            kzVar.k0(fVar, j10, kzVar.p0(), j11);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.drawscope.f fVar, n0.g gVar, androidx.compose.ui.graphics.q0 q0Var) {
            c(fVar, gVar.B(), q0Var.M());
            return Unit.f312394a;
        }
    }

    static {
        d0.m2 m2Var = d0.m2.f268479a;
        f30141b = m2Var.T();
        f30142c = m2Var.T();
        f30143d = androidx.compose.ui.graphics.u.a();
    }

    private kz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(kz kzVar, t00 t00Var, androidx.compose.ui.a0 a0Var, boolean z10, ky kyVar, Function2 function2, pj.n nVar, float f10, float f11, float f12, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        kzVar.y(t00Var, a0Var, z10, kyVar, function2, nVar, f10, f11, f12, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(kz kzVar, androidx.compose.foundation.interaction.j jVar, androidx.compose.ui.a0 a0Var, ky kyVar, boolean z10, long j10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        kzVar.B(jVar, a0Var, kyVar, z10, j10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(kz kzVar, androidx.compose.foundation.interaction.j jVar, t00 t00Var, androidx.compose.ui.a0 a0Var, ky kyVar, boolean z10, long j10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        kzVar.C(jVar, t00Var, a0Var, kyVar, z10, j10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(long j10, o00 o00Var, long j11, long j12, long j13, androidx.compose.ui.graphics.drawscope.f fVar) {
        boolean z10 = fVar.getLayoutDirection() == androidx.compose.ui.unit.w.Rtl;
        long jG = n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.Y() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a));
        long jG2 = n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.Y() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.d() >> 32)))) << 32));
        long j14 = jG;
        long j15 = z10 ? jG2 : j14;
        if (!z10) {
            j14 = jG2;
        }
        float fS7 = fVar.S7(f30142c);
        float fS8 = fVar.S7(j00.o0());
        androidx.compose.ui.graphics.u3.a aVar = androidx.compose.ui.graphics.u3.f38256b;
        androidx.compose.ui.graphics.drawscope.f.j2(fVar, j10, j15, j14, fS8, aVar.b(), null, 0.0f, null, 0, 480, null);
        int i10 = (int) (j15 >> 32);
        int i11 = (int) (j14 >> 32);
        long j16 = j15;
        long j17 = j14;
        androidx.compose.ui.graphics.drawscope.f.j2(fVar, j11, n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i10) + ((Float.intBitsToFloat(i11) - Float.intBitsToFloat(i10)) * o00Var.a().u().floatValue()))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.Y() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a)), n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i10) + ((Float.intBitsToFloat(i11) - Float.intBitsToFloat(i10)) * o00Var.a().i().floatValue()))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.Y() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a)), fS8, aVar.b(), null, 0.0f, null, 0, 480, null);
        float[] fArrB = o00Var.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = fArrB.length;
        for (int i12 = 0; i12 < length; i12++) {
            float f10 = fArrB[i12];
            Boolean boolValueOf = Boolean.valueOf(f10 > o00Var.a().i().floatValue() || f10 < o00Var.a().u().floatValue());
            Object arrayList = linkedHashMap.get(boolValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(boolValueOf, arrayList);
            }
            ((List) arrayList).add(Float.valueOf(f10));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
            List list = (List) entry.getValue();
            boolean z11 = zBooleanValue;
            ArrayList arrayList2 = new ArrayList(list.size());
            int i13 = 0;
            for (int size = list.size(); i13 < size; size = size) {
                arrayList2.add(n0.g.d(n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.Y() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n0.h.h(j16, j17, ((Number) list.get(i13)).floatValue()) >> 32)))) << 32))));
                i13++;
                z11 = z11;
            }
            j16 = j16;
            j17 = j17;
            androidx.compose.ui.graphics.drawscope.f.K3(fVar, arrayList2, androidx.compose.ui.graphics.z2.f38718b.b(), z11 ? j12 : j13, fS7, androidx.compose.ui.graphics.u3.f38256b.b(), null, 0.0f, null, 0, 480, null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(kz kzVar, o00 o00Var, androidx.compose.ui.a0 a0Var, ky kyVar, boolean z10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        kzVar.G(o00Var, a0Var, kyVar, z10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(kz kzVar, t00 t00Var, androidx.compose.ui.a0 a0Var, ky kyVar, boolean z10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        kzVar.H(t00Var, a0Var, kyVar, z10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(kz kzVar, bt btVar, androidx.compose.ui.a0 a0Var, ky kyVar, boolean z10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        kzVar.F(btVar, a0Var, kyVar, z10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private final void Q(final t00 t00Var, final float f10, final androidx.compose.ui.a0 a0Var, final boolean z10, final ky kyVar, final Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function2, final pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar, final float f11, final float f12, final boolean z11, final boolean z12, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        int i13;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.ui.a0 a0VarI;
        androidx.compose.ui.a0 a0Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(133396521);
        if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(t00Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c0VarR.I(f10) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= c0VarR.D(a0Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c0VarR.G(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c0VarR.D(kyVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c0VarR.k0(function2) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= c0VarR.k0(nVar) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= c0VarR.I(f11) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c0VarR.I(f12) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= c0VarR.G(z11) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (c0VarR.G(z12) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if (c0VarR.h(((i12 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true, i12 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(133396521, i12, i13, "androidx.compose.material3.SliderDefaults.TrackImpl (Slider.kt:1587)");
            }
            int i14 = i12;
            final long jO = kyVar.o(z10, false);
            final long jO2 = kyVar.o(z10, true);
            final long jN = kyVar.n(z10, false);
            int i15 = i13;
            final long jN2 = kyVar.n(z10, true);
            if (t00Var.n() == androidx.compose.foundation.gestures.q3.Vertical) {
                a0VarI = androidx.compose.foundation.layout.i6.d(androidx.compose.foundation.layout.i6.B(a0Var, j00.o0()), 0.0f, 1, null);
                if (t00Var.q()) {
                    a0VarI = androidx.compose.ui.draw.v.b(a0VarI, 1.0f, -1.0f);
                }
            } else {
                a0VarI = androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var, 0.0f, 1, null), j00.o0());
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            int i16 = i14 & com.planner5d.library.engine.input.f.b.B;
            boolean zK0 = (i16 == 32) | c0VarR.k0(t00Var);
            Object objI0 = c0VarR.i0();
            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new pj.n() { // from class: androidx.compose.material3.wy
                    @Override // pj.n
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return kz.S(f10, t00Var, (androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.z0) obj2, (androidx.compose.ui.unit.b) obj3);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarB2 = a0VarI.B2(androidx.compose.ui.layout.q0.a(aVar, (pj.n) objI0));
            boolean zK1 = (i16 == 32) | c0VarR.k0(t00Var) | c0VarR.L(jO) | c0VarR.L(jO2) | c0VarR.L(jN) | c0VarR.L(jN2) | ((i14 & 29360128) == 8388608) | ((i14 & 234881024) == 67108864) | ((i14 & 458752) == 131072) | ((i14 & 3670016) == 1048576) | ((i14 & 1879048192) == 536870912) | ((i15 & 14) == 4);
            Object objI1 = c0VarR.i0();
            if (zK1 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                a0Var2 = a0VarB2;
                Function1 function1 = new Function1() { // from class: androidx.compose.material3.yy
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return kz.U(f10, t00Var, jO, jO2, jN, jN2, f11, f12, function2, nVar, z11, z12, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0Var2 = c0VarR;
                c0Var2.Y(function1);
                objI1 = function1;
            } else {
                a0Var2 = a0VarB2;
                c0Var2 = c0VarR;
            }
            androidx.compose.foundation.f1.e(a0Var2, (Function1) objI1, c0Var2, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.zy
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return kz.V(this.f35265a, t00Var, f10, a0Var, z10, kyVar, function2, nVar, f11, f12, z11, z12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private final void R(final bt btVar, final float f10, final androidx.compose.ui.a0 a0Var, final boolean z10, final ky kyVar, final Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function2, final pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar, final float f11, final float f12, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.c0 c0Var3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1719396904);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(btVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.I(f10) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.D(a0Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.G(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.D(kyVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.k0(function2) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0VarR.k0(nVar) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c0VarR.I(f11) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i11 |= c0VarR.I(f12) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if (c0VarR.h((i11 & 38347923) != 38347922, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1719396904, i11, -1, "androidx.compose.material3.SliderDefaults.TrackImpl (Slider.kt:1811)");
            }
            final long jO = kyVar.o(z10, false);
            int i12 = i11;
            final long jO2 = kyVar.o(z10, true);
            final long jN = kyVar.n(z10, false);
            final long jN2 = kyVar.n(z10, true);
            androidx.compose.ui.a0 a0VarI = androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var, 0.0f, 1, null), j00.o0());
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = new pj.n() { // from class: androidx.compose.material3.gz
                    @Override // pj.n
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return kz.W((androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.z0) obj2, (androidx.compose.ui.unit.b) obj3);
                    }
                };
                c0Var3 = c0VarR;
                c0Var3.Y(objI0);
            } else {
                c0Var3 = c0VarR;
            }
            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.layout.q0.a(a0VarI, (pj.n) objI0);
            boolean zK0 = ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) | c0Var3.k0(btVar) | c0Var3.L(jO) | c0Var3.L(jO2) | c0Var3.L(jN) | c0Var3.L(jN2) | ((i12 & 29360128) == 8388608) | ((i12 & 234881024) == 67108864) | ((i12 & 458752) == 131072) | ((i12 & 3670016) == 1048576);
            Object objI1 = c0Var3.i0();
            if (zK0 || objI1 == aVar.a()) {
                c0Var2 = c0Var3;
                Function1 function1 = new Function1() { // from class: androidx.compose.material3.hz
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return kz.Y(f10, btVar, jO, jO2, jN, jN2, f11, f12, function2, nVar, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0Var2.Y(function1);
                objI1 = function1;
            } else {
                c0Var2 = c0Var3;
            }
            androidx.compose.foundation.f1.e(a0VarA, (Function1) objI1, c0Var2, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.iz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return kz.Z(this.f29403a, btVar, f10, a0Var, z10, kyVar, function2, nVar, f11, f12, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 S(float f10, t00 t00Var, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
        int iG6;
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(bVar.x());
        if (androidx.compose.ui.unit.h.x(f10, androidx.compose.ui.unit.h.f42689b.e())) {
            iG6 = t00Var.n() == androidx.compose.foundation.gestures.q3.Vertical ? i2VarP0.h1() / 2 : i2VarP0.c1() / 2;
        } else {
            iG6 = c1Var.g6(f10);
        }
        return c1Var.S6(i2VarP0.h1(), i2VarP0.c1(), MapsKt.mapOf(TuplesKt.to(j00.m0(), Integer.valueOf(iG6))), new Function1() { // from class: androidx.compose.material3.vy
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kz.T(i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, 0, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(float f10, t00 t00Var, long j10, long j11, long j12, long j13, float f11, float f12, Function2 function2, pj.n nVar, boolean z10, boolean z11, androidx.compose.ui.graphics.drawscope.f fVar) {
        float fS7;
        if (androidx.compose.ui.unit.h.x(f10, androidx.compose.ui.unit.h.f42689b.e())) {
            fS7 = (t00Var.n() == androidx.compose.foundation.gestures.q3.Vertical ? Float.intBitsToFloat((int) (fVar.d() >> 32)) : Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a))) / 2;
        } else {
            fS7 = fVar.S7(f10);
        }
        f30140a.l0(fVar, t00Var.u(), 0.0f, t00Var.j(), j10, j11, j12, j13, fVar.D3(0), fVar.D3(0), fVar.D3(t00Var.t()), fVar.D3(t00Var.s()), f11, f12, fVar.F3(fS7), function2, nVar, false, z10, t00Var.n(), z11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(kz kzVar, t00 t00Var, float f10, androidx.compose.ui.a0 a0Var, boolean z10, ky kyVar, Function2 function2, pj.n nVar, float f11, float f12, boolean z11, boolean z12, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        kzVar.Q(t00Var, f10, a0Var, z10, kyVar, function2, nVar, f11, f12, z11, z12, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 W(androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(bVar.x());
        return c1Var.S6(i2VarP0.h1(), i2VarP0.c1(), MapsKt.mapOf(TuplesKt.to(j00.m0(), Integer.valueOf(i2VarP0.c1() / 2))), new Function1() { // from class: androidx.compose.material3.oy
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kz.X(i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, 0, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(float f10, bt btVar, long j10, long j11, long j12, long j13, float f11, float f12, Function2 function2, pj.n nVar, androidx.compose.ui.graphics.drawscope.f fVar) {
        m0(f30140a, fVar, btVar.w(), btVar.h(), btVar.g(), j10, j11, j12, j13, fVar.F3(btVar.u()), fVar.F3(btVar.t()), fVar.F3(btVar.k()), fVar.F3(btVar.j()), f11, f12, fVar.F3(androidx.compose.ui.unit.h.x(f10, androidx.compose.ui.unit.h.f42689b.e()) ? Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a)) / 2 : fVar.S7(f10)), function2, nVar, true, false, null, false, 917504, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(kz kzVar, bt btVar, float f10, androidx.compose.ui.a0 a0Var, boolean z10, ky kyVar, Function2 function2, pj.n nVar, float f11, float f12, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        kzVar.R(btVar, f10, a0Var, z10, kyVar, function2, nVar, f11, f12, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(ky kyVar, boolean z10, androidx.compose.ui.graphics.drawscope.f fVar, n0.g gVar) {
        kz kzVar = f30140a;
        long jO = kyVar.o(z10, true);
        kzVar.k0(fVar, gVar.B(), f30141b, jO);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(kz kzVar, t00 t00Var, androidx.compose.ui.a0 a0Var, boolean z10, ky kyVar, Function2 function2, pj.n nVar, float f10, float f11, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        kzVar.N(t00Var, a0Var, z10, kyVar, function2, nVar, f10, f11, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(ky kyVar, boolean z10, androidx.compose.ui.graphics.drawscope.f fVar, n0.g gVar) {
        kz kzVar = f30140a;
        long jO = kyVar.o(z10, true);
        kzVar.k0(fVar, gVar.B(), f30141b, jO);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0(kz kzVar, bt btVar, androidx.compose.ui.a0 a0Var, boolean z10, ky kyVar, Function2 function2, pj.n nVar, float f10, float f11, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        kzVar.M(btVar, a0Var, z10, kyVar, function2, nVar, f10, f11, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0(ky kyVar, boolean z10, androidx.compose.ui.graphics.drawscope.f fVar, n0.g gVar) {
        kz kzVar = f30140a;
        long jO = kyVar.o(z10, true);
        kzVar.k0(fVar, gVar.B(), f30141b, jO);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(kz kzVar, t00 t00Var, float f10, androidx.compose.ui.a0 a0Var, boolean z10, ky kyVar, Function2 function2, pj.n nVar, float f11, float f12, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        kzVar.P(t00Var, f10, a0Var, z10, kyVar, function2, nVar, f11, f12, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0(ky kyVar, boolean z10, androidx.compose.ui.graphics.drawscope.f fVar, n0.g gVar) {
        kz kzVar = f30140a;
        long jO = kyVar.o(z10, true);
        kzVar.k0(fVar, gVar.B(), f30141b, jO);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(kz kzVar, bt btVar, float f10, androidx.compose.ui.a0 a0Var, boolean z10, ky kyVar, Function2 function2, pj.n nVar, float f11, float f12, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        kzVar.O(btVar, f10, a0Var, z10, kyVar, function2, nVar, f11, f12, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0276  */
    /* JADX WARN: Code duplicated, block: B:184:0x0423  */
    /* JADX WARN: Code duplicated, block: B:213:0x052b  */
    /* JADX WARN: Code duplicated, block: B:72:0x012e  */
    private final void l0(androidx.compose.ui.graphics.drawscope.f fVar, float[] fArr, float f10, float f11, long j10, long j11, long j12, long j13, float f12, float f13, float f14, float f15, float f16, float f17, float f18, Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function2, pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar, boolean z10, boolean z11, androidx.compose.foundation.gestures.q3 q3Var, boolean z12) {
        float f19;
        float f20;
        boolean z13;
        long jG;
        long jF;
        float f21;
        float f22;
        long jG2;
        float f23;
        float f24;
        float f25;
        kotlin.ranges.f<Float> fVar2;
        kotlin.ranges.f<Float> fVar3;
        long jG3;
        long jG4;
        long jF2;
        long jG5;
        long jF3;
        long jG6;
        float fS7;
        float fS8;
        float fS9;
        boolean z14 = q3Var == androidx.compose.foundation.gestures.q3.Vertical;
        boolean z15 = fVar.getLayoutDirection() == androidx.compose.ui.unit.w.Rtl;
        boolean z16 = z15 && !z14;
        float fS10 = fVar.S7(f18);
        long jD = fVar.d();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (z14 ? jD & com.rabbitmq.client.k0.f265952a : jD >> 32));
        boolean z17 = Intrinsics.areEqual(f10, ArraysKt.firstOrNull(fArr)) || Intrinsics.areEqual(f10, ArraysKt.lastOrNull(fArr));
        float f26 = ((fArr.length == 0) || (Intrinsics.areEqual(f11, ArraysKt.firstOrNull(fArr)) || Intrinsics.areEqual(f11, ArraysKt.lastOrNull(fArr)))) ? 0.0f + ((fIntBitsToFloat - 0.0f) * f11) : (((fIntBitsToFloat - 0.0f) - (2 * fS10)) * f11) + 0.0f + fS10;
        float f27 = ((fArr.length == 0) || z17) ? 0.0f + ((fIntBitsToFloat - 0.0f) * f10) : (((fIntBitsToFloat - 0.0f) - (2 * fS10)) * f10) + 0.0f + fS10;
        float fS11 = fVar.S7(f17);
        if (androidx.compose.ui.unit.h.q(f16, androidx.compose.ui.unit.h.r(0)) > 0) {
            if (z14) {
                float f28 = 2;
                fS7 = (fVar.S7(f13) / f28) + fVar.S7(f16);
                fS8 = fVar.S7(f15) / f28;
                fS9 = fVar.S7(f16);
            } else {
                float f29 = 2;
                fS7 = (fVar.S7(f12) / f29) + fVar.S7(f16);
                fS8 = fVar.S7(f14) / f29;
                fS9 = fVar.S7(f16);
            }
            f19 = fS7;
            f20 = fS8 + fS9;
        } else {
            f19 = 0.0f;
            f20 = 0.0f;
        }
        long jY = fVar.Y();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (z14 ? jY & com.rabbitmq.client.k0.f265952a : jY >> 32));
        float f30 = f19 + 0.0f;
        if (z11) {
            if (!(fArr.length == 0)) {
                f30 += fS10;
            }
        } else {
            f30 += fS10;
        }
        float fMin = z12 ? Math.min(f26, fIntBitsToFloat2) : f27;
        if ((z12 || z10) && fMin > f30) {
            float f31 = z16 ? fS11 : fS10;
            float f32 = z16 ? fS10 : fS11;
            float f33 = fMin - f19;
            if (z16) {
                z13 = true;
                jG = n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.d() >> 32)) - f33)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
            } else {
                z13 = true;
                jG = n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
            }
            if (z14) {
                jF = n0.n.f((((long) Float.floatToRawIntBits(f33 - 0.0f)) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.d() >> 32)))) << 32));
            } else {
                jF = n0.n.f((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(f33 - 0.0f)) << 32));
            }
            f21 = fIntBitsToFloat2;
            f22 = f26;
            n0(fVar, q3Var, jG, jF, j10, f31, f32);
            if (z14) {
                jG2 = n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.Y() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fS10 + 0.0f)) & com.rabbitmq.client.k0.f265952a));
            } else if (z15) {
                jG2 = n0.g.g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (fVar.d() >> 32)) - 0.0f) - fS10)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.Y() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a));
            } else {
                jG2 = n0.g.g((((long) Float.floatToRawIntBits(fS10 + 0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.Y() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a));
            }
            if (function2 != null) {
                function2.invoke(fVar, n0.g.d(jG2));
                Unit unit = Unit.f312394a;
            }
        } else {
            f21 = fIntBitsToFloat2;
            f22 = f26;
            z13 = true;
        }
        float f34 = fIntBitsToFloat - f20;
        if (z11) {
            if (!(fArr.length == 0 ? z13 : false)) {
                f34 -= fS10;
            }
        } else {
            f34 -= fS10;
        }
        float fMax = z12 ? Math.max(f22, f21) : f22;
        if (fMax < f34) {
            float f35 = z16 ? fS10 : fS11;
            float f36 = z16 ? fS11 : fS10;
            float f37 = fMax + f20;
            float f38 = fIntBitsToFloat - f37;
            if (z14) {
                jG5 = n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f37)) & com.rabbitmq.client.k0.f265952a));
            } else if (z15) {
                jG5 = n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
            } else {
                jG5 = n0.g.g((((long) Float.floatToRawIntBits(f37)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
            }
            if (z14) {
                jF3 = n0.n.f((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(f38)) & com.rabbitmq.client.k0.f265952a));
            } else if (!z15 || z10) {
                jF3 = n0.n.f((((long) Float.floatToRawIntBits(f38)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a));
            } else {
                jF3 = n0.n.f((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.d() >> 32)) - f37)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a));
            }
            n0(fVar, q3Var, jG5, jF3, j10, f35, f36);
            if (z14) {
                jG6 = n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.Y() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat - fS10)) & com.rabbitmq.client.k0.f265952a));
            } else if (z15) {
                jG6 = n0.g.g((((long) Float.floatToRawIntBits(fS10)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.Y() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a));
            } else {
                jG6 = n0.g.g((((long) Float.floatToRawIntBits(fIntBitsToFloat - fS10)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.Y() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a));
            }
            if (function2 != null) {
                function2.invoke(fVar, n0.g.d(jG6));
                Unit unit2 = Unit.f312394a;
            }
        }
        if (z12) {
            f23 = fMin + (fMin < f21 ? f19 : 0.0f);
        } else {
            f23 = z10 ? f27 + f19 : 0.0f;
        }
        if (z12) {
            f24 = fMax - (fMax > f21 ? f20 : 0.0f);
        } else {
            f24 = f22 - f20;
        }
        float f39 = (z16 || z12 || z10) ? fS11 : fS10;
        float f40 = (!z16 || z12 || z10) ? fS11 : fS10;
        float f41 = (!z16 || z12 || z10) ? f24 - f23 : f24;
        if (z11) {
            if (fArr.length == 0 ? z13 : false) {
                f25 = 0.0f;
            } else {
                f25 = f39;
            }
        } else {
            f25 = f39;
        }
        if (f41 > f25) {
            if (z14) {
                jG4 = n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f23)) & com.rabbitmq.client.k0.f265952a));
            } else if (z15) {
                jG4 = n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.d() >> 32)) - f24)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
            } else {
                jG4 = n0.g.g((((long) Float.floatToRawIntBits(f23)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
            }
            long j14 = jG4;
            if (z14) {
                jF2 = n0.n.f((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(f41)) & com.rabbitmq.client.k0.f265952a));
            } else if (!z15 || z12 || z10) {
                jF2 = n0.n.f((((long) Float.floatToRawIntBits(f41)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a));
            } else {
                jF2 = n0.n.f((((long) Float.floatToRawIntBits(f24)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a));
            }
            n0(fVar, q3Var, j14, jF2, j11, f39, f40);
        }
        float f42 = 0.0f + fS10;
        float f43 = fIntBitsToFloat - fS10;
        kotlin.ranges.f<Float> fVarE = kotlin.ranges.r.e(f23, f24);
        kotlin.ranges.f<Float> fVarE2 = kotlin.ranges.r.e(f21 - f20, f21 + f20);
        kotlin.ranges.f<Float> fVarE3 = kotlin.ranges.r.e(f27 - f19, f27 + f19);
        kotlin.ranges.f<Float> fVarE4 = kotlin.ranges.r.e(f22 - f20, f22 + f20);
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i11 < length) {
            float f44 = fArr[i11];
            int i12 = i10 + 1;
            if (function2 == null || !(((z12 || z10) && i10 == 0) || i10 == fArr.length - 1)) {
                float fR = androidx.compose.ui.util.e.r(f42, f43, f44);
                if ((z12 && fVarE2.c(Float.valueOf(fR))) || ((z10 && fVarE3.c(Float.valueOf(fR))) || fVarE4.c(Float.valueOf(fR)))) {
                    fVar2 = fVarE2;
                    fVar3 = fVarE3;
                } else {
                    if (z14) {
                        fVar2 = fVarE2;
                        fVar3 = fVarE3;
                        jG3 = n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.Y() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fR)) & com.rabbitmq.client.k0.f265952a));
                    } else {
                        fVar2 = fVarE2;
                        fVar3 = fVarE3;
                        if (z15) {
                            jG3 = n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.d() >> 32)) - fR)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.Y() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a));
                        } else {
                            jG3 = n0.g.g((((long) Float.floatToRawIntBits(fR)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.Y() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a));
                        }
                    }
                    nVar.invoke(fVar, n0.g.d(jG3), androidx.compose.ui.graphics.q0.n(fVarE.c(Float.valueOf(fR)) ? j13 : j12));
                }
            } else {
                fVar2 = fVarE2;
                fVar3 = fVarE3;
            }
            i11++;
            fVarE2 = fVar2;
            fVarE3 = fVar3;
            i10 = i12;
        }
    }

    static /* synthetic */ void m0(kz kzVar, androidx.compose.ui.graphics.drawscope.f fVar, float[] fArr, float f10, float f11, long j10, long j11, long j12, long j13, float f12, float f13, float f14, float f15, float f16, float f17, float f18, Function2 function2, pj.n nVar, boolean z10, boolean z11, androidx.compose.foundation.gestures.q3 q3Var, boolean z12, int i10, Object obj) {
        kzVar.l0(fVar, fArr, f10, f11, j10, j11, j12, j13, f12, f13, f14, f15, f16, f17, f18, function2, nVar, z10, (i10 & 131072) != 0 ? false : z11, (i10 & 262144) != 0 ? androidx.compose.foundation.gestures.q3.Horizontal : q3Var, (i10 & 524288) != 0 ? false : z12);
    }

    private final void n0(androidx.compose.ui.graphics.drawscope.f fVar, androidx.compose.foundation.gestures.q3 q3Var, long j10, long j11, long j12, float f10, float f11) {
        n0.l lVarC;
        long jE = n0.a.e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a));
        long jE2 = n0.a.e((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f11)) & com.rabbitmq.client.k0.f265952a));
        if (q3Var == androidx.compose.foundation.gestures.q3.Vertical) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
            lVarC = n0.m.c(n0.k.c(j10, n0.n.f((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32))), jE, jE, jE2, jE2);
        } else {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 >> 32));
            lVarC = n0.m.c(n0.k.c(j10, n0.n.f((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32))), jE, jE2, jE2, jE);
        }
        androidx.compose.ui.graphics.k2 k2Var = f30143d;
        androidx.compose.ui.graphics.k2.S(k2Var, lVarC, null, 2, null);
        androidx.compose.ui.graphics.drawscope.f.K1(fVar, k2Var, j12, 0.0f, null, null, 0, 60, null);
        k2Var.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(ky kyVar, boolean z10, androidx.compose.ui.graphics.drawscope.f fVar, n0.g gVar) {
        kz kzVar = f30140a;
        long jO = kyVar.o(z10, true);
        kzVar.k0(fVar, gVar.B(), f30141b, jO);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0137  */
    /* JADX WARN: Code duplicated, block: B:103:0x0142  */
    /* JADX WARN: Code duplicated, block: B:105:0x0148  */
    /* JADX WARN: Code duplicated, block: B:108:0x015b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0171  */
    /* JADX WARN: Code duplicated, block: B:112:0x0198  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5 A[PHI: r4 r9 r10 r12
      0x00e5: PHI (r4v29 int) = (r4v19 int), (r4v17 int), (r4v30 int) binds: [B:89:0x0100, B:79:0x00e1, B:80:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r9v8 androidx.compose.ui.a0) = (r9v5 androidx.compose.ui.a0), (r9v2 androidx.compose.ui.a0), (r9v2 androidx.compose.ui.a0) binds: [B:89:0x0100, B:79:0x00e1, B:80:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r10v12 androidx.compose.material3.ky) = (r10v9 androidx.compose.material3.ky), (r10v6 androidx.compose.material3.ky), (r10v6 androidx.compose.material3.ky) binds: [B:89:0x0100, B:79:0x00e1, B:80:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r12v7 boolean) = (r12v4 boolean), (r12v2 boolean), (r12v2 boolean) binds: [B:89:0x0100, B:79:0x00e1, B:80:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x0111  */
    /* JADX WARN: Code duplicated, block: B:96:0x0128  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void B(@NotNull final androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.ui.a0 a0Var, @Nullable ky kyVar, boolean z10, long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        ky kyVar2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        long j11;
        int i16;
        int i17;
        boolean z12;
        final long j12;
        final ky kyVar3;
        final boolean z13;
        androidx.compose.runtime.s5 s5VarT;
        long j13;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        SnapshotStateList snapshotStateList;
        boolean z14;
        Object objI1;
        int i18;
        long jH;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-290277409);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(jVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    kyVar2 = kyVar;
                    int i20 = c0VarR.D(kyVar2) ? 256 : 128;
                    i12 |= i20;
                } else {
                    kyVar2 = kyVar;
                }
                i12 |= i20;
            } else {
                kyVar2 = kyVar;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        j11 = j10;
                        if (c0VarR.L(j11)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.D(this)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 74899) != 74898) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i19 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i11 & 4) != 0) {
                                ky kyVarI0 = i0(c0VarR, (i12 >> 15) & 14);
                                i12 &= -897;
                                kyVar2 = kyVarI0;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                j13 = j00.f29449d;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1212)");
                            }
                            objI0 = c0VarR.i0();
                            aVar = androidx.compose.runtime.c0.f35327a;
                            if (objI0 == aVar.a()) {
                                objI0 = androidx.compose.runtime.w6.g();
                                c0VarR.Y(objI0);
                            }
                            snapshotStateList = (SnapshotStateList) objI0;
                            int i21 = i12 & 14;
                            z14 = i21 == 4;
                            objI1 = c0VarR.i0();
                            if (z14 || objI1 == aVar.a()) {
                                objI1 = new b(jVar, snapshotStateList, null);
                                c0VarR.Y(objI1);
                            }
                            androidx.compose.runtime.b2.i(jVar, (Function2) objI1, c0VarR, i21);
                            if (snapshotStateList.isEmpty()) {
                                i18 = 2;
                                jH = j13;
                            } else {
                                i18 = 2;
                                jH = androidx.compose.ui.unit.l.h(j13, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.p(j13) / 2), 0.0f, 2, null);
                            }
                            androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.n2.b(androidx.compose.foundation.layout.i6.x(a0Var2, jH), jVar, false, i18, null), kyVar2.m(z11), cx.i(d0.m2.f268479a.z(), c0VarR, 6)), c0VarR, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            j12 = j13;
                        } else {
                            c0VarR.u();
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                            }
                        }
                        j13 = j11;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1212)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.w6.g();
                            c0VarR.Y(objI0);
                        }
                        snapshotStateList = (SnapshotStateList) objI0;
                        int i22 = i12 & 14;
                        if (i22 == 4) {
                        }
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new b(jVar, snapshotStateList, null);
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new b(jVar, snapshotStateList, null);
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.runtime.b2.i(jVar, (Function2) objI1, c0VarR, i22);
                        if (snapshotStateList.isEmpty()) {
                            i18 = 2;
                            jH = androidx.compose.ui.unit.l.h(j13, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.p(j13) / 2), 0.0f, 2, null);
                        } else {
                            i18 = 2;
                            jH = j13;
                        }
                        androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.n2.b(androidx.compose.foundation.layout.i6.x(a0Var2, jH), jVar, false, i18, null), kyVar2.m(z11), cx.i(d0.m2.f268479a.z(), c0VarR, 6)), c0VarR, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        j12 = j13;
                    } else {
                        c0VarR.u();
                        j12 = j11;
                    }
                    kyVar3 = kyVar2;
                    z13 = z11;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final androidx.compose.ui.a0 a0Var3 = a0Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.qy
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.D(this.f32358a, jVar, a0Var3, kyVar3, z13, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                j11 = j10;
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.D(this)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((i12 & 74899) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            ky kyVarI1 = i0(c0VarR, (i12 >> 15) & 14);
                            i12 &= -897;
                            kyVar2 = kyVarI1;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            j13 = j00.f29449d;
                        } else {
                            j13 = j11;
                        }
                    } else {
                        if (i19 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            ky kyVarI2 = i0(c0VarR, (i12 >> 15) & 14);
                            i12 &= -897;
                            kyVar2 = kyVarI2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            j13 = j00.f29449d;
                        } else {
                            j13 = j11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1212)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.w6.g();
                        c0VarR.Y(objI0);
                    }
                    snapshotStateList = (SnapshotStateList) objI0;
                    int i23 = i12 & 14;
                    if (i23 == 4) {
                    }
                    objI1 = c0VarR.i0();
                    if (z14) {
                        objI1 = new b(jVar, snapshotStateList, null);
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new b(jVar, snapshotStateList, null);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.runtime.b2.i(jVar, (Function2) objI1, c0VarR, i23);
                    if (snapshotStateList.isEmpty()) {
                        i18 = 2;
                        jH = androidx.compose.ui.unit.l.h(j13, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.p(j13) / 2), 0.0f, 2, null);
                    } else {
                        i18 = 2;
                        jH = j13;
                    }
                    androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.n2.b(androidx.compose.foundation.layout.i6.x(a0Var2, jH), jVar, false, i18, null), kyVar2.m(z11), cx.i(d0.m2.f268479a.z(), c0VarR, 6)), c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = j13;
                } else {
                    c0VarR.u();
                    j12 = j11;
                }
                kyVar3 = kyVar2;
                z13 = z11;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.a0 a0Var4 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.qy
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.D(this.f32358a, jVar, a0Var4, kyVar3, z13, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z11 = z10;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    j11 = j10;
                    if (c0VarR.L(j11)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.D(this)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((i12 & 74899) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            ky kyVarI3 = i0(c0VarR, (i12 >> 15) & 14);
                            i12 &= -897;
                            kyVar2 = kyVarI3;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            j13 = j00.f29449d;
                        } else {
                            j13 = j11;
                        }
                    } else {
                        if (i19 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            ky kyVarI4 = i0(c0VarR, (i12 >> 15) & 14);
                            i12 &= -897;
                            kyVar2 = kyVarI4;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            j13 = j00.f29449d;
                        } else {
                            j13 = j11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1212)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.w6.g();
                        c0VarR.Y(objI0);
                    }
                    snapshotStateList = (SnapshotStateList) objI0;
                    int i24 = i12 & 14;
                    if (i24 == 4) {
                    }
                    objI1 = c0VarR.i0();
                    if (z14) {
                        objI1 = new b(jVar, snapshotStateList, null);
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new b(jVar, snapshotStateList, null);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.runtime.b2.i(jVar, (Function2) objI1, c0VarR, i24);
                    if (snapshotStateList.isEmpty()) {
                        i18 = 2;
                        jH = androidx.compose.ui.unit.l.h(j13, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.p(j13) / 2), 0.0f, 2, null);
                    } else {
                        i18 = 2;
                        jH = j13;
                    }
                    androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.n2.b(androidx.compose.foundation.layout.i6.x(a0Var2, jH), jVar, false, i18, null), kyVar2.m(z11), cx.i(d0.m2.f268479a.z(), c0VarR, 6)), c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = j13;
                } else {
                    c0VarR.u();
                    j12 = j11;
                }
                kyVar3 = kyVar2;
                z13 = z11;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.a0 a0Var5 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.qy
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.D(this.f32358a, jVar, a0Var5, kyVar3, z13, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            j11 = j10;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.D(this)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((i12 & 74899) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        ky kyVarI5 = i0(c0VarR, (i12 >> 15) & 14);
                        i12 &= -897;
                        kyVar2 = kyVarI5;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        j13 = j00.f29449d;
                    } else {
                        j13 = j11;
                    }
                } else {
                    if (i19 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        ky kyVarI6 = i0(c0VarR, (i12 >> 15) & 14);
                        i12 &= -897;
                        kyVar2 = kyVarI6;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        j13 = j00.f29449d;
                    } else {
                        j13 = j11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1212)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.w6.g();
                    c0VarR.Y(objI0);
                }
                snapshotStateList = (SnapshotStateList) objI0;
                int i25 = i12 & 14;
                if (i25 == 4) {
                }
                objI1 = c0VarR.i0();
                if (z14) {
                    objI1 = new b(jVar, snapshotStateList, null);
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new b(jVar, snapshotStateList, null);
                    c0VarR.Y(objI1);
                }
                androidx.compose.runtime.b2.i(jVar, (Function2) objI1, c0VarR, i25);
                if (snapshotStateList.isEmpty()) {
                    i18 = 2;
                    jH = androidx.compose.ui.unit.l.h(j13, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.p(j13) / 2), 0.0f, 2, null);
                } else {
                    i18 = 2;
                    jH = j13;
                }
                androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.n2.b(androidx.compose.foundation.layout.i6.x(a0Var2, jH), jVar, false, i18, null), kyVar2.m(z11), cx.i(d0.m2.f268479a.z(), c0VarR, 6)), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j12 = j13;
            } else {
                c0VarR.u();
                j12 = j11;
            }
            kyVar3 = kyVar2;
            z13 = z11;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var6 = a0Var2;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.qy
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.D(this.f32358a, jVar, a0Var6, kyVar3, z13, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                kyVar2 = kyVar;
                if (c0VarR.D(kyVar2)) {
                }
                i12 |= i20;
            } else {
                kyVar2 = kyVar;
            }
            i12 |= i20;
        } else {
            kyVar2 = kyVar;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    j11 = j10;
                    if (c0VarR.L(j11)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.D(this)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((i12 & 74899) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            ky kyVarI7 = i0(c0VarR, (i12 >> 15) & 14);
                            i12 &= -897;
                            kyVar2 = kyVarI7;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            j13 = j00.f29449d;
                        } else {
                            j13 = j11;
                        }
                    } else {
                        if (i19 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i11 & 4) != 0) {
                            ky kyVarI8 = i0(c0VarR, (i12 >> 15) & 14);
                            i12 &= -897;
                            kyVar2 = kyVarI8;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            j13 = j00.f29449d;
                        } else {
                            j13 = j11;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1212)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.w6.g();
                        c0VarR.Y(objI0);
                    }
                    snapshotStateList = (SnapshotStateList) objI0;
                    int i26 = i12 & 14;
                    if (i26 == 4) {
                    }
                    objI1 = c0VarR.i0();
                    if (z14) {
                        objI1 = new b(jVar, snapshotStateList, null);
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new b(jVar, snapshotStateList, null);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.runtime.b2.i(jVar, (Function2) objI1, c0VarR, i26);
                    if (snapshotStateList.isEmpty()) {
                        i18 = 2;
                        jH = androidx.compose.ui.unit.l.h(j13, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.p(j13) / 2), 0.0f, 2, null);
                    } else {
                        i18 = 2;
                        jH = j13;
                    }
                    androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.n2.b(androidx.compose.foundation.layout.i6.x(a0Var2, jH), jVar, false, i18, null), kyVar2.m(z11), cx.i(d0.m2.f268479a.z(), c0VarR, 6)), c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    j12 = j13;
                } else {
                    c0VarR.u();
                    j12 = j11;
                }
                kyVar3 = kyVar2;
                z13 = z11;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.a0 a0Var7 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.qy
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.D(this.f32358a, jVar, a0Var7, kyVar3, z13, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            j11 = j10;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.D(this)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((i12 & 74899) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        ky kyVarI9 = i0(c0VarR, (i12 >> 15) & 14);
                        i12 &= -897;
                        kyVar2 = kyVarI9;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        j13 = j00.f29449d;
                    } else {
                        j13 = j11;
                    }
                } else {
                    if (i19 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        ky kyVarI10 = i0(c0VarR, (i12 >> 15) & 14);
                        i12 &= -897;
                        kyVar2 = kyVarI10;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        j13 = j00.f29449d;
                    } else {
                        j13 = j11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1212)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.w6.g();
                    c0VarR.Y(objI0);
                }
                snapshotStateList = (SnapshotStateList) objI0;
                int i27 = i12 & 14;
                if (i27 == 4) {
                }
                objI1 = c0VarR.i0();
                if (z14) {
                    objI1 = new b(jVar, snapshotStateList, null);
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new b(jVar, snapshotStateList, null);
                    c0VarR.Y(objI1);
                }
                androidx.compose.runtime.b2.i(jVar, (Function2) objI1, c0VarR, i27);
                if (snapshotStateList.isEmpty()) {
                    i18 = 2;
                    jH = androidx.compose.ui.unit.l.h(j13, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.p(j13) / 2), 0.0f, 2, null);
                } else {
                    i18 = 2;
                    jH = j13;
                }
                androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.n2.b(androidx.compose.foundation.layout.i6.x(a0Var2, jH), jVar, false, i18, null), kyVar2.m(z11), cx.i(d0.m2.f268479a.z(), c0VarR, 6)), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j12 = j13;
            } else {
                c0VarR.u();
                j12 = j11;
            }
            kyVar3 = kyVar2;
            z13 = z11;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var8 = a0Var2;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.qy
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.D(this.f32358a, jVar, a0Var8, kyVar3, z13, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z11 = z10;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                j11 = j10;
                if (c0VarR.L(j11)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.D(this)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((i12 & 74899) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        ky kyVarI11 = i0(c0VarR, (i12 >> 15) & 14);
                        i12 &= -897;
                        kyVar2 = kyVarI11;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        j13 = j00.f29449d;
                    } else {
                        j13 = j11;
                    }
                } else {
                    if (i19 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i11 & 4) != 0) {
                        ky kyVarI12 = i0(c0VarR, (i12 >> 15) & 14);
                        i12 &= -897;
                        kyVar2 = kyVarI12;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        j13 = j00.f29449d;
                    } else {
                        j13 = j11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1212)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.w6.g();
                    c0VarR.Y(objI0);
                }
                snapshotStateList = (SnapshotStateList) objI0;
                int i28 = i12 & 14;
                if (i28 == 4) {
                }
                objI1 = c0VarR.i0();
                if (z14) {
                    objI1 = new b(jVar, snapshotStateList, null);
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new b(jVar, snapshotStateList, null);
                    c0VarR.Y(objI1);
                }
                androidx.compose.runtime.b2.i(jVar, (Function2) objI1, c0VarR, i28);
                if (snapshotStateList.isEmpty()) {
                    i18 = 2;
                    jH = androidx.compose.ui.unit.l.h(j13, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.p(j13) / 2), 0.0f, 2, null);
                } else {
                    i18 = 2;
                    jH = j13;
                }
                androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.n2.b(androidx.compose.foundation.layout.i6.x(a0Var2, jH), jVar, false, i18, null), kyVar2.m(z11), cx.i(d0.m2.f268479a.z(), c0VarR, 6)), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j12 = j13;
            } else {
                c0VarR.u();
                j12 = j11;
            }
            kyVar3 = kyVar2;
            z13 = z11;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var9 = a0Var2;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.qy
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.D(this.f32358a, jVar, a0Var9, kyVar3, z13, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        j11 = j10;
        if ((i11 & 32) != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.D(this)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i12 |= i17;
        }
        if ((i12 & 74899) != 74898) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i11 & 4) != 0) {
                    ky kyVarI13 = i0(c0VarR, (i12 >> 15) & 14);
                    i12 &= -897;
                    kyVar2 = kyVarI13;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if (i15 != 0) {
                    j13 = j00.f29449d;
                } else {
                    j13 = j11;
                }
            } else {
                if (i19 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i11 & 4) != 0) {
                    ky kyVarI14 = i0(c0VarR, (i12 >> 15) & 14);
                    i12 &= -897;
                    kyVar2 = kyVarI14;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if (i15 != 0) {
                    j13 = j00.f29449d;
                } else {
                    j13 = j11;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1212)");
            }
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.w6.g();
                c0VarR.Y(objI0);
            }
            snapshotStateList = (SnapshotStateList) objI0;
            int i29 = i12 & 14;
            if (i29 == 4) {
            }
            objI1 = c0VarR.i0();
            if (z14) {
                objI1 = new b(jVar, snapshotStateList, null);
                c0VarR.Y(objI1);
            } else {
                objI1 = new b(jVar, snapshotStateList, null);
                c0VarR.Y(objI1);
            }
            androidx.compose.runtime.b2.i(jVar, (Function2) objI1, c0VarR, i29);
            if (snapshotStateList.isEmpty()) {
                i18 = 2;
                jH = androidx.compose.ui.unit.l.h(j13, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.p(j13) / 2), 0.0f, 2, null);
            } else {
                i18 = 2;
                jH = j13;
            }
            androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.n2.b(androidx.compose.foundation.layout.i6.x(a0Var2, jH), jVar, false, i18, null), kyVar2.m(z11), cx.i(d0.m2.f268479a.z(), c0VarR, 6)), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            j12 = j13;
        } else {
            c0VarR.u();
            j12 = j11;
        }
        kyVar3 = kyVar2;
        z13 = z11;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var10 = a0Var2;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.qy
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return kz.D(this.f32358a, jVar, a0Var10, kyVar3, z13, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0121  */
    /* JADX WARN: Code duplicated, block: B:106:0x0130  */
    /* JADX WARN: Code duplicated, block: B:109:0x0147  */
    /* JADX WARN: Code duplicated, block: B:113:0x0156  */
    /* JADX WARN: Code duplicated, block: B:116:0x0161  */
    /* JADX WARN: Code duplicated, block: B:118:0x0167  */
    /* JADX WARN: Code duplicated, block: B:121:0x017a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0182  */
    /* JADX WARN: Code duplicated, block: B:124:0x0198  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:128:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x010a  */
    /* JADX WARN: Code duplicated, block: B:97:0x010f  */
    /* JADX WARN: Code duplicated, block: B:98:0x011a  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void C(@NotNull final androidx.compose.foundation.interaction.j jVar, @NotNull final t00 t00Var, @Nullable androidx.compose.ui.a0 a0Var, @Nullable ky kyVar, boolean z10, long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        int i13;
        androidx.compose.ui.a0 a0Var2;
        int i14;
        ky kyVar2;
        int i15;
        boolean z11;
        int i16;
        int i17;
        long j11;
        int i18;
        int i19;
        boolean z12;
        final long j12;
        final androidx.compose.ui.a0 a0Var3;
        final ky kyVar3;
        final boolean z13;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        ky kyVarI0;
        long j13;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        SnapshotStateList snapshotStateList;
        boolean z14;
        Object objI1;
        int i20;
        long jH;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-889714565);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(jVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.k0(t00Var) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        kyVar2 = kyVar;
                        int i21 = c0VarR.D(kyVar2) ? 2048 : 1024;
                        i12 |= i21;
                    } else {
                        kyVar2 = kyVar;
                    }
                    i12 |= i21;
                } else {
                    kyVar2 = kyVar;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        z11 = z10;
                        if (c0VarR.G(z11)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 32;
                    if (i17 != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        j11 = j10;
                    } else {
                        j11 = j10;
                        if ((196608 & i10) == 0) {
                            if (c0VarR.L(j11)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.D(this)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                    if ((599187 & i12) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i13 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i11 & 8) != 0) {
                                kyVarI0 = i0(c0VarR, (i12 >> 18) & 14);
                                i12 &= -7169;
                            } else {
                                kyVarI0 = kyVar2;
                            }
                            if (i15 != 0) {
                                z11 = true;
                            }
                            if (i17 != 0) {
                                j11 = j00.f29449d;
                            }
                            j13 = j11;
                        } else {
                            c0VarR.u();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            j13 = j11;
                            a0Var4 = a0Var2;
                            kyVarI0 = kyVar2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-889714565, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1265)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.w6.g();
                            c0VarR.Y(objI0);
                        }
                        snapshotStateList = (SnapshotStateList) objI0;
                        int i22 = i12 & 14;
                        z14 = i22 == 4;
                        objI1 = c0VarR.i0();
                        if (z14 || objI1 == aVar.a()) {
                            objI1 = new c(jVar, snapshotStateList, null);
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.runtime.b2.i(jVar, (Function2) objI1, c0VarR, i22);
                        if (!snapshotStateList.isEmpty()) {
                            i20 = 2;
                            jH = j13;
                        } else if (t00Var.n() == androidx.compose.foundation.gestures.q3.Vertical) {
                            i20 = 2;
                            jH = androidx.compose.ui.unit.l.h(j13, 0.0f, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.m(j13) / 2), 1, null);
                        } else {
                            i20 = 2;
                            jH = androidx.compose.ui.unit.l.h(j13, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.p(j13) / 2), 0.0f, 2, null);
                        }
                        androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.n2.b(androidx.compose.foundation.layout.i6.x(a0Var4, jH), jVar, false, i20, null), kyVarI0.m(z11), cx.i(d0.m2.f268479a.z(), c0VarR, 6)), c0VarR, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        kyVar3 = kyVarI0;
                        j12 = j13;
                    } else {
                        c0VarR.u();
                        j12 = j11;
                        a0Var3 = a0Var2;
                        kyVar3 = kyVar2;
                    }
                    z13 = z11;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.py
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.E(this.f32019a, jVar, t00Var, a0Var3, kyVar3, z13, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                z11 = z10;
                i17 = i11 & 32;
                if (i17 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    j11 = j10;
                } else {
                    j11 = j10;
                    if ((196608 & i10) == 0) {
                        if (c0VarR.L(j11)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(this)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((599187 & i12) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 8) != 0) {
                            kyVarI0 = i0(c0VarR, (i12 >> 18) & 14);
                            i12 &= -7169;
                        } else {
                            kyVarI0 = kyVar2;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if (i17 != 0) {
                            j11 = j00.f29449d;
                        }
                        j13 = j11;
                    } else {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 8) != 0) {
                            kyVarI0 = i0(c0VarR, (i12 >> 18) & 14);
                            i12 &= -7169;
                        } else {
                            kyVarI0 = kyVar2;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if (i17 != 0) {
                            j11 = j00.f29449d;
                        }
                        j13 = j11;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-889714565, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1265)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.w6.g();
                        c0VarR.Y(objI0);
                    }
                    snapshotStateList = (SnapshotStateList) objI0;
                    int i23 = i12 & 14;
                    if (i23 == 4) {
                    }
                    objI1 = c0VarR.i0();
                    if (z14) {
                        objI1 = new c(jVar, snapshotStateList, null);
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new c(jVar, snapshotStateList, null);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.runtime.b2.i(jVar, (Function2) objI1, c0VarR, i23);
                    if (!snapshotStateList.isEmpty()) {
                        i20 = 2;
                        jH = j13;
                    } else if (t00Var.n() == androidx.compose.foundation.gestures.q3.Vertical) {
                        i20 = 2;
                        jH = androidx.compose.ui.unit.l.h(j13, 0.0f, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.m(j13) / 2), 1, null);
                    } else {
                        i20 = 2;
                        jH = androidx.compose.ui.unit.l.h(j13, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.p(j13) / 2), 0.0f, 2, null);
                    }
                    androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.n2.b(androidx.compose.foundation.layout.i6.x(a0Var4, jH), jVar, false, i20, null), kyVarI0.m(z11), cx.i(d0.m2.f268479a.z(), c0VarR, 6)), c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    kyVar3 = kyVarI0;
                    j12 = j13;
                } else {
                    c0VarR.u();
                    j12 = j11;
                    a0Var3 = a0Var2;
                    kyVar3 = kyVar2;
                }
                z13 = z11;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.py
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.E(this.f32019a, jVar, t00Var, a0Var3, kyVar3, z13, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            a0Var2 = a0Var;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    kyVar2 = kyVar;
                    if (c0VarR.D(kyVar2)) {
                    }
                    i12 |= i21;
                } else {
                    kyVar2 = kyVar;
                }
                i12 |= i21;
            } else {
                kyVar2 = kyVar;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    j11 = j10;
                } else {
                    j11 = j10;
                    if ((196608 & i10) == 0) {
                        if (c0VarR.L(j11)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(this)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((599187 & i12) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 8) != 0) {
                            kyVarI0 = i0(c0VarR, (i12 >> 18) & 14);
                            i12 &= -7169;
                        } else {
                            kyVarI0 = kyVar2;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if (i17 != 0) {
                            j11 = j00.f29449d;
                        }
                        j13 = j11;
                    } else {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 8) != 0) {
                            kyVarI0 = i0(c0VarR, (i12 >> 18) & 14);
                            i12 &= -7169;
                        } else {
                            kyVarI0 = kyVar2;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if (i17 != 0) {
                            j11 = j00.f29449d;
                        }
                        j13 = j11;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-889714565, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1265)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.w6.g();
                        c0VarR.Y(objI0);
                    }
                    snapshotStateList = (SnapshotStateList) objI0;
                    int i24 = i12 & 14;
                    if (i24 == 4) {
                    }
                    objI1 = c0VarR.i0();
                    if (z14) {
                        objI1 = new c(jVar, snapshotStateList, null);
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new c(jVar, snapshotStateList, null);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.runtime.b2.i(jVar, (Function2) objI1, c0VarR, i24);
                    if (!snapshotStateList.isEmpty()) {
                        i20 = 2;
                        jH = j13;
                    } else if (t00Var.n() == androidx.compose.foundation.gestures.q3.Vertical) {
                        i20 = 2;
                        jH = androidx.compose.ui.unit.l.h(j13, 0.0f, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.m(j13) / 2), 1, null);
                    } else {
                        i20 = 2;
                        jH = androidx.compose.ui.unit.l.h(j13, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.p(j13) / 2), 0.0f, 2, null);
                    }
                    androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.n2.b(androidx.compose.foundation.layout.i6.x(a0Var4, jH), jVar, false, i20, null), kyVarI0.m(z11), cx.i(d0.m2.f268479a.z(), c0VarR, 6)), c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    kyVar3 = kyVarI0;
                    j12 = j13;
                } else {
                    c0VarR.u();
                    j12 = j11;
                    a0Var3 = a0Var2;
                    kyVar3 = kyVar2;
                }
                z13 = z11;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.py
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.E(this.f32019a, jVar, t00Var, a0Var3, kyVar3, z13, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            z11 = z10;
            i17 = i11 & 32;
            if (i17 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                j11 = j10;
            } else {
                j11 = j10;
                if ((196608 & i10) == 0) {
                    if (c0VarR.L(j11)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.D(this)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
            if ((599187 & i12) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        kyVarI0 = i0(c0VarR, (i12 >> 18) & 14);
                        i12 &= -7169;
                    } else {
                        kyVarI0 = kyVar2;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        j11 = j00.f29449d;
                    }
                    j13 = j11;
                } else {
                    if (i13 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        kyVarI0 = i0(c0VarR, (i12 >> 18) & 14);
                        i12 &= -7169;
                    } else {
                        kyVarI0 = kyVar2;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        j11 = j00.f29449d;
                    }
                    j13 = j11;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-889714565, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1265)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.w6.g();
                    c0VarR.Y(objI0);
                }
                snapshotStateList = (SnapshotStateList) objI0;
                int i25 = i12 & 14;
                if (i25 == 4) {
                }
                objI1 = c0VarR.i0();
                if (z14) {
                    objI1 = new c(jVar, snapshotStateList, null);
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new c(jVar, snapshotStateList, null);
                    c0VarR.Y(objI1);
                }
                androidx.compose.runtime.b2.i(jVar, (Function2) objI1, c0VarR, i25);
                if (!snapshotStateList.isEmpty()) {
                    i20 = 2;
                    jH = j13;
                } else if (t00Var.n() == androidx.compose.foundation.gestures.q3.Vertical) {
                    i20 = 2;
                    jH = androidx.compose.ui.unit.l.h(j13, 0.0f, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.m(j13) / 2), 1, null);
                } else {
                    i20 = 2;
                    jH = androidx.compose.ui.unit.l.h(j13, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.p(j13) / 2), 0.0f, 2, null);
                }
                androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.n2.b(androidx.compose.foundation.layout.i6.x(a0Var4, jH), jVar, false, i20, null), kyVarI0.m(z11), cx.i(d0.m2.f268479a.z(), c0VarR, 6)), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                kyVar3 = kyVarI0;
                j12 = j13;
            } else {
                c0VarR.u();
                j12 = j11;
                a0Var3 = a0Var2;
                kyVar3 = kyVar2;
            }
            z13 = z11;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.py
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.E(this.f32019a, jVar, t00Var, a0Var3, kyVar3, z13, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    kyVar2 = kyVar;
                    if (c0VarR.D(kyVar2)) {
                    }
                    i12 |= i21;
                } else {
                    kyVar2 = kyVar;
                }
                i12 |= i21;
            } else {
                kyVar2 = kyVar;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    j11 = j10;
                } else {
                    j11 = j10;
                    if ((196608 & i10) == 0) {
                        if (c0VarR.L(j11)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(this)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((599187 & i12) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 8) != 0) {
                            kyVarI0 = i0(c0VarR, (i12 >> 18) & 14);
                            i12 &= -7169;
                        } else {
                            kyVarI0 = kyVar2;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if (i17 != 0) {
                            j11 = j00.f29449d;
                        }
                        j13 = j11;
                    } else {
                        if (i13 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 8) != 0) {
                            kyVarI0 = i0(c0VarR, (i12 >> 18) & 14);
                            i12 &= -7169;
                        } else {
                            kyVarI0 = kyVar2;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if (i17 != 0) {
                            j11 = j00.f29449d;
                        }
                        j13 = j11;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-889714565, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1265)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.w6.g();
                        c0VarR.Y(objI0);
                    }
                    snapshotStateList = (SnapshotStateList) objI0;
                    int i26 = i12 & 14;
                    if (i26 == 4) {
                    }
                    objI1 = c0VarR.i0();
                    if (z14) {
                        objI1 = new c(jVar, snapshotStateList, null);
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new c(jVar, snapshotStateList, null);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.runtime.b2.i(jVar, (Function2) objI1, c0VarR, i26);
                    if (!snapshotStateList.isEmpty()) {
                        i20 = 2;
                        jH = j13;
                    } else if (t00Var.n() == androidx.compose.foundation.gestures.q3.Vertical) {
                        i20 = 2;
                        jH = androidx.compose.ui.unit.l.h(j13, 0.0f, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.m(j13) / 2), 1, null);
                    } else {
                        i20 = 2;
                        jH = androidx.compose.ui.unit.l.h(j13, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.p(j13) / 2), 0.0f, 2, null);
                    }
                    androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.n2.b(androidx.compose.foundation.layout.i6.x(a0Var4, jH), jVar, false, i20, null), kyVarI0.m(z11), cx.i(d0.m2.f268479a.z(), c0VarR, 6)), c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    kyVar3 = kyVarI0;
                    j12 = j13;
                } else {
                    c0VarR.u();
                    j12 = j11;
                    a0Var3 = a0Var2;
                    kyVar3 = kyVar2;
                }
                z13 = z11;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.py
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.E(this.f32019a, jVar, t00Var, a0Var3, kyVar3, z13, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            z11 = z10;
            i17 = i11 & 32;
            if (i17 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                j11 = j10;
            } else {
                j11 = j10;
                if ((196608 & i10) == 0) {
                    if (c0VarR.L(j11)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.D(this)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
            if ((599187 & i12) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        kyVarI0 = i0(c0VarR, (i12 >> 18) & 14);
                        i12 &= -7169;
                    } else {
                        kyVarI0 = kyVar2;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        j11 = j00.f29449d;
                    }
                    j13 = j11;
                } else {
                    if (i13 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        kyVarI0 = i0(c0VarR, (i12 >> 18) & 14);
                        i12 &= -7169;
                    } else {
                        kyVarI0 = kyVar2;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        j11 = j00.f29449d;
                    }
                    j13 = j11;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-889714565, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1265)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.w6.g();
                    c0VarR.Y(objI0);
                }
                snapshotStateList = (SnapshotStateList) objI0;
                int i27 = i12 & 14;
                if (i27 == 4) {
                }
                objI1 = c0VarR.i0();
                if (z14) {
                    objI1 = new c(jVar, snapshotStateList, null);
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new c(jVar, snapshotStateList, null);
                    c0VarR.Y(objI1);
                }
                androidx.compose.runtime.b2.i(jVar, (Function2) objI1, c0VarR, i27);
                if (!snapshotStateList.isEmpty()) {
                    i20 = 2;
                    jH = j13;
                } else if (t00Var.n() == androidx.compose.foundation.gestures.q3.Vertical) {
                    i20 = 2;
                    jH = androidx.compose.ui.unit.l.h(j13, 0.0f, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.m(j13) / 2), 1, null);
                } else {
                    i20 = 2;
                    jH = androidx.compose.ui.unit.l.h(j13, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.p(j13) / 2), 0.0f, 2, null);
                }
                androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.n2.b(androidx.compose.foundation.layout.i6.x(a0Var4, jH), jVar, false, i20, null), kyVarI0.m(z11), cx.i(d0.m2.f268479a.z(), c0VarR, 6)), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                kyVar3 = kyVarI0;
                j12 = j13;
            } else {
                c0VarR.u();
                j12 = j11;
                a0Var3 = a0Var2;
                kyVar3 = kyVar2;
            }
            z13 = z11;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.py
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.E(this.f32019a, jVar, t00Var, a0Var3, kyVar3, z13, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                kyVar2 = kyVar;
                if (c0VarR.D(kyVar2)) {
                }
                i12 |= i21;
            } else {
                kyVar2 = kyVar;
            }
            i12 |= i21;
        } else {
            kyVar2 = kyVar;
        }
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                j11 = j10;
            } else {
                j11 = j10;
                if ((196608 & i10) == 0) {
                    if (c0VarR.L(j11)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.D(this)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
            if ((599187 & i12) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        kyVarI0 = i0(c0VarR, (i12 >> 18) & 14);
                        i12 &= -7169;
                    } else {
                        kyVarI0 = kyVar2;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        j11 = j00.f29449d;
                    }
                    j13 = j11;
                } else {
                    if (i13 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        kyVarI0 = i0(c0VarR, (i12 >> 18) & 14);
                        i12 &= -7169;
                    } else {
                        kyVarI0 = kyVar2;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        j11 = j00.f29449d;
                    }
                    j13 = j11;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-889714565, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1265)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.w6.g();
                    c0VarR.Y(objI0);
                }
                snapshotStateList = (SnapshotStateList) objI0;
                int i28 = i12 & 14;
                if (i28 == 4) {
                }
                objI1 = c0VarR.i0();
                if (z14) {
                    objI1 = new c(jVar, snapshotStateList, null);
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new c(jVar, snapshotStateList, null);
                    c0VarR.Y(objI1);
                }
                androidx.compose.runtime.b2.i(jVar, (Function2) objI1, c0VarR, i28);
                if (!snapshotStateList.isEmpty()) {
                    i20 = 2;
                    jH = j13;
                } else if (t00Var.n() == androidx.compose.foundation.gestures.q3.Vertical) {
                    i20 = 2;
                    jH = androidx.compose.ui.unit.l.h(j13, 0.0f, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.m(j13) / 2), 1, null);
                } else {
                    i20 = 2;
                    jH = androidx.compose.ui.unit.l.h(j13, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.p(j13) / 2), 0.0f, 2, null);
                }
                androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.n2.b(androidx.compose.foundation.layout.i6.x(a0Var4, jH), jVar, false, i20, null), kyVarI0.m(z11), cx.i(d0.m2.f268479a.z(), c0VarR, 6)), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                kyVar3 = kyVarI0;
                j12 = j13;
            } else {
                c0VarR.u();
                j12 = j11;
                a0Var3 = a0Var2;
                kyVar3 = kyVar2;
            }
            z13 = z11;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.py
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.E(this.f32019a, jVar, t00Var, a0Var3, kyVar3, z13, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        z11 = z10;
        i17 = i11 & 32;
        if (i17 != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
            j11 = j10;
        } else {
            j11 = j10;
            if ((196608 & i10) == 0) {
                if (c0VarR.L(j11)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
        }
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0VarR.D(this)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i12 |= i19;
        }
        if ((599187 & i12) != 599186) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 8) != 0) {
                    kyVarI0 = i0(c0VarR, (i12 >> 18) & 14);
                    i12 &= -7169;
                } else {
                    kyVarI0 = kyVar2;
                }
                if (i15 != 0) {
                    z11 = true;
                }
                if (i17 != 0) {
                    j11 = j00.f29449d;
                }
                j13 = j11;
            } else {
                if (i13 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 8) != 0) {
                    kyVarI0 = i0(c0VarR, (i12 >> 18) & 14);
                    i12 &= -7169;
                } else {
                    kyVarI0 = kyVar2;
                }
                if (i15 != 0) {
                    z11 = true;
                }
                if (i17 != 0) {
                    j11 = j00.f29449d;
                }
                j13 = j11;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-889714565, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1265)");
            }
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.w6.g();
                c0VarR.Y(objI0);
            }
            snapshotStateList = (SnapshotStateList) objI0;
            int i29 = i12 & 14;
            if (i29 == 4) {
            }
            objI1 = c0VarR.i0();
            if (z14) {
                objI1 = new c(jVar, snapshotStateList, null);
                c0VarR.Y(objI1);
            } else {
                objI1 = new c(jVar, snapshotStateList, null);
                c0VarR.Y(objI1);
            }
            androidx.compose.runtime.b2.i(jVar, (Function2) objI1, c0VarR, i29);
            if (!snapshotStateList.isEmpty()) {
                i20 = 2;
                jH = j13;
            } else if (t00Var.n() == androidx.compose.foundation.gestures.q3.Vertical) {
                i20 = 2;
                jH = androidx.compose.ui.unit.l.h(j13, 0.0f, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.m(j13) / 2), 1, null);
            } else {
                i20 = 2;
                jH = androidx.compose.ui.unit.l.h(j13, androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.l.p(j13) / 2), 0.0f, 2, null);
            }
            androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.v.c(androidx.compose.foundation.n2.b(androidx.compose.foundation.layout.i6.x(a0Var4, jH), jVar, false, i20, null), kyVarI0.m(z11), cx.i(d0.m2.f268479a.z(), c0VarR, 6)), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            kyVar3 = kyVarI0;
            j12 = j13;
        } else {
            c0VarR.u();
            j12 = j11;
            a0Var3 = a0Var2;
            kyVar3 = kyVar2;
        }
        z13 = z11;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.py
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return kz.E(this.f32019a, jVar, t00Var, a0Var3, kyVar3, z13, j12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0042  */
    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x0068  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:48:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0081  */
    /* JADX WARN: Code duplicated, block: B:53:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x0096  */
    /* JADX WARN: Code duplicated, block: B:62:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc A[PHI: r4 r5 r6
      0x00bc: PHI (r4v8 androidx.compose.ui.a0) = (r4v4 androidx.compose.ui.a0), (r4v11 androidx.compose.ui.a0) binds: [B:80:0x00d7, B:70:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r5v15 androidx.compose.material3.ky) = (r5v8 androidx.compose.material3.ky), (r5v17 androidx.compose.material3.ky) binds: [B:80:0x00d7, B:70:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r6v14 int) = (r6v9 int), (r6v16 int) binds: [B:80:0x00d7, B:70:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:87:0x011c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0122  */
    /* JADX WARN: Code duplicated, block: B:92:0x012e  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use the overload that takes `drawStopIndicator`, `drawTick`, `thumbTrackGapSize` and `trackInsideCornerSize`, see `LegacyRangeSliderSample` on how to restore the previous behavior", replaceWith = @kotlin.b1(expression = "Track(rangeSliderState, modifier, colors, enabled, drawStopIndicator, drawTick, thumbTrackGapSize, trackInsideCornerSize)", imports = {}))
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final /* synthetic */ void F(final bt btVar, androidx.compose.ui.a0 a0Var, ky kyVar, boolean z10, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        ky kyVar2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        boolean z12;
        final androidx.compose.ui.a0 a0Var3;
        final ky kyVar3;
        final boolean z13;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        ky kyVarI0;
        int i16;
        boolean z14;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1617869097);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(btVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    kyVar2 = kyVar;
                    int i18 = c0VarR.D(kyVar2) ? 256 : 128;
                    i12 |= i18;
                } else {
                    kyVar2 = kyVar;
                }
                i12 |= i18;
            } else {
                kyVar2 = kyVar;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c0VarR.D(this)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                if ((i12 & 9363) != 9362) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            kyVarI0 = i0(c0VarR, (i12 >> 12) & 14);
                            i12 &= -897;
                        } else {
                            kyVarI0 = kyVar2;
                        }
                        i16 = i12;
                        if (i13 != 0) {
                            z14 = true;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1617869097, i16, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1688)");
                        }
                        androidx.compose.ui.a0 a0Var5 = a0Var4;
                        kyVar3 = kyVarI0;
                        M(btVar, a0Var5, z14, kyVar3, null, null, j00.f29451f, j00.f29452g, c0VarR, (i16 & 14) | 14155776 | (i16 & com.planner5d.library.engine.input.f.b.B) | ((i16 >> 3) & 896) | ((i16 << 3) & 7168) | ((i16 << 12) & 234881024), 48);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z13 = z14;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        a0Var4 = a0Var2;
                        kyVarI0 = kyVar2;
                        i16 = i12;
                    }
                    z14 = z11;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1617869097, i16, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1688)");
                    }
                    androidx.compose.ui.a0 a0Var6 = a0Var4;
                    kyVar3 = kyVarI0;
                    M(btVar, a0Var6, z14, kyVar3, null, null, j00.f29451f, j00.f29452g, c0VarR, (i16 & 14) | 14155776 | (i16 & com.planner5d.library.engine.input.f.b.B) | ((i16 >> 3) & 896) | ((i16 << 3) & 7168) | ((i16 << 12) & 234881024), 48);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z13 = z14;
                    a0Var3 = a0Var6;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    kyVar3 = kyVar2;
                    z13 = z11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.xy
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.L(this.f34592a, btVar, a0Var3, kyVar3, z13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z11 = z10;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.D(this)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((i12 & 9363) != 9362) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        kyVarI0 = i0(c0VarR, (i12 >> 12) & 14);
                        i12 &= -897;
                    } else {
                        kyVarI0 = kyVar2;
                    }
                    i16 = i12;
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        kyVarI0 = i0(c0VarR, (i12 >> 12) & 14);
                        i12 &= -897;
                    } else {
                        kyVarI0 = kyVar2;
                    }
                    i16 = i12;
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1617869097, i16, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1688)");
                }
                androidx.compose.ui.a0 a0Var7 = a0Var4;
                kyVar3 = kyVarI0;
                M(btVar, a0Var7, z14, kyVar3, null, null, j00.f29451f, j00.f29452g, c0VarR, (i16 & 14) | 14155776 | (i16 & com.planner5d.library.engine.input.f.b.B) | ((i16 >> 3) & 896) | ((i16 << 3) & 7168) | ((i16 << 12) & 234881024), 48);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z13 = z14;
                a0Var3 = a0Var7;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                kyVar3 = kyVar2;
                z13 = z11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.xy
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.L(this.f34592a, btVar, a0Var3, kyVar3, z13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                kyVar2 = kyVar;
                if (c0VarR.D(kyVar2)) {
                }
                i12 |= i18;
            } else {
                kyVar2 = kyVar;
            }
            i12 |= i18;
        } else {
            kyVar2 = kyVar;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.D(this)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((i12 & 9363) != 9362) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        kyVarI0 = i0(c0VarR, (i12 >> 12) & 14);
                        i12 &= -897;
                    } else {
                        kyVarI0 = kyVar2;
                    }
                    i16 = i12;
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        kyVarI0 = i0(c0VarR, (i12 >> 12) & 14);
                        i12 &= -897;
                    } else {
                        kyVarI0 = kyVar2;
                    }
                    i16 = i12;
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1617869097, i16, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1688)");
                }
                androidx.compose.ui.a0 a0Var8 = a0Var4;
                kyVar3 = kyVarI0;
                M(btVar, a0Var8, z14, kyVar3, null, null, j00.f29451f, j00.f29452g, c0VarR, (i16 & 14) | 14155776 | (i16 & com.planner5d.library.engine.input.f.b.B) | ((i16 >> 3) & 896) | ((i16 << 3) & 7168) | ((i16 << 12) & 234881024), 48);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z13 = z14;
                a0Var3 = a0Var8;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                kyVar3 = kyVar2;
                z13 = z11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.xy
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.L(this.f34592a, btVar, a0Var3, kyVar3, z13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z11 = z10;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            if (c0VarR.D(this)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i12 |= i15;
        }
        if ((i12 & 9363) != 9362) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    kyVarI0 = i0(c0VarR, (i12 >> 12) & 14);
                    i12 &= -897;
                } else {
                    kyVarI0 = kyVar2;
                }
                i16 = i12;
                if (i13 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
            } else {
                if (i17 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    kyVarI0 = i0(c0VarR, (i12 >> 12) & 14);
                    i12 &= -897;
                } else {
                    kyVarI0 = kyVar2;
                }
                i16 = i12;
                if (i13 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1617869097, i16, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1688)");
            }
            androidx.compose.ui.a0 a0Var9 = a0Var4;
            kyVar3 = kyVarI0;
            M(btVar, a0Var9, z14, kyVar3, null, null, j00.f29451f, j00.f29452g, c0VarR, (i16 & 14) | 14155776 | (i16 & com.planner5d.library.engine.input.f.b.B) | ((i16 >> 3) & 896) | ((i16 << 3) & 7168) | ((i16 << 12) & 234881024), 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            z13 = z14;
            a0Var3 = a0Var9;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            kyVar3 = kyVar2;
            z13 = z11;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.xy
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return kz.L(this.f34592a, btVar, a0Var3, kyVar3, z13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0174  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf A[PHI: r3 r5 r8
      0x00bf: PHI (r3v25 androidx.compose.material3.ky) = (r3v21 androidx.compose.material3.ky), (r3v27 androidx.compose.material3.ky) binds: [B:79:0x00db, B:70:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r5v8 androidx.compose.ui.a0) = (r5v4 androidx.compose.ui.a0), (r5v11 androidx.compose.ui.a0) binds: [B:79:0x00db, B:70:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r8v13 int) = (r8v9 int), (r8v14 int) binds: [B:79:0x00db, B:70:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x0120  */
    /* JADX WARN: Code duplicated, block: B:87:0x0122  */
    /* JADX WARN: Code duplicated, block: B:90:0x013a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0142  */
    /* JADX WARN: Code duplicated, block: B:97:0x015f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0166  */
    @androidx.compose.runtime.o
    @kotlin.l(message = "Use version that supports slider state")
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void G(@NotNull final o00 o00Var, @Nullable androidx.compose.ui.a0 a0Var, @Nullable ky kyVar, boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        final o00 o00Var2;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        ky kyVar2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        boolean z12;
        final androidx.compose.ui.a0 a0Var3;
        final ky kyVar3;
        final boolean z13;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        int i16;
        ky kyVar4;
        boolean z14;
        int i17;
        final long jO;
        final long jO2;
        final long jN;
        final long jN2;
        boolean z15;
        boolean zL;
        Object objI0;
        boolean z16;
        int i18;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1546713545);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            o00Var2 = o00Var;
        } else {
            o00Var2 = o00Var;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.D(o00Var2) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    kyVar2 = kyVar;
                    int i20 = c0VarR.D(kyVar2) ? 256 : 128;
                    i12 |= i20;
                } else {
                    kyVar2 = kyVar;
                }
                i12 |= i20;
            } else {
                kyVar2 = kyVar;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c0VarR.D(this)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                if ((i12 & 9363) != 9362) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            ky kyVarI0 = i0(c0VarR, (i12 >> 12) & 14);
                            i12 &= -897;
                            kyVar2 = kyVarI0;
                        }
                        ky kyVar5 = kyVar2;
                        i16 = i12;
                        kyVar4 = kyVar5;
                        if (i13 != 0) {
                            z14 = true;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1546713545, i16, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1318)");
                        }
                        i17 = i16;
                        jO = kyVar4.o(z14, false);
                        jO2 = kyVar4.o(z14, true);
                        jN = kyVar4.n(z14, false);
                        jN2 = kyVar4.n(z14, true);
                        ky kyVar6 = kyVar4;
                        a0Var3 = a0Var4;
                        androidx.compose.ui.a0 a0VarI = androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var3, 0.0f, 1, null), j00.o0());
                        boolean zL2 = c0VarR.L(jO);
                        if ((i17 & 14) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zL = zL2 | z15 | c0VarR.L(jO2) | c0VarR.L(jN) | c0VarR.L(jN2);
                        objI0 = c0VarR.i0();
                        if (!zL || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            z16 = z14;
                            i18 = 0;
                            Function1 function1 = new Function1() { // from class: androidx.compose.material3.jz
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return kz.I(jO, o00Var2, jO2, jN, jN2, (androidx.compose.ui.graphics.drawscope.f) obj);
                                }
                            };
                            c0VarR.Y(function1);
                            objI0 = function1;
                        } else {
                            z16 = z14;
                            i18 = 0;
                        }
                        androidx.compose.foundation.f1.e(a0VarI, (Function1) objI0, c0VarR, i18);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        kyVar3 = kyVar6;
                        z13 = z16;
                    } else {
                        c0VarR.u();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        ky kyVar7 = kyVar2;
                        i16 = i12;
                        kyVar4 = kyVar7;
                        a0Var4 = a0Var2;
                    }
                    z14 = z11;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1546713545, i16, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1318)");
                    }
                    i17 = i16;
                    jO = kyVar4.o(z14, false);
                    jO2 = kyVar4.o(z14, true);
                    jN = kyVar4.n(z14, false);
                    jN2 = kyVar4.n(z14, true);
                    ky kyVar8 = kyVar4;
                    a0Var3 = a0Var4;
                    androidx.compose.ui.a0 a0VarI2 = androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var3, 0.0f, 1, null), j00.o0());
                    boolean zL3 = c0VarR.L(jO);
                    if ((i17 & 14) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zL = zL3 | z15 | c0VarR.L(jO2) | c0VarR.L(jN) | c0VarR.L(jN2);
                    objI0 = c0VarR.i0();
                    if (zL) {
                        z16 = z14;
                        i18 = 0;
                        Function1 function2 = new Function1() { // from class: androidx.compose.material3.jz
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return kz.I(jO, o00Var2, jO2, jN, jN2, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(function2);
                        objI0 = function2;
                    } else {
                        z16 = z14;
                        i18 = 0;
                        Function1 function3 = new Function1() { // from class: androidx.compose.material3.jz
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return kz.I(jO, o00Var2, jO2, jN, jN2, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(function3);
                        objI0 = function3;
                    }
                    androidx.compose.foundation.f1.e(a0VarI2, (Function1) objI0, c0VarR, i18);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    kyVar3 = kyVar8;
                    z13 = z16;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    kyVar3 = kyVar2;
                    z13 = z11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ny
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.J(this.f31198a, o00Var, a0Var3, kyVar3, z13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z11 = z10;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.D(this)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((i12 & 9363) != 9362) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        ky kyVarI1 = i0(c0VarR, (i12 >> 12) & 14);
                        i12 &= -897;
                        kyVar2 = kyVarI1;
                    }
                    ky kyVar9 = kyVar2;
                    i16 = i12;
                    kyVar4 = kyVar9;
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                } else {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        ky kyVarI2 = i0(c0VarR, (i12 >> 12) & 14);
                        i12 &= -897;
                        kyVar2 = kyVarI2;
                    }
                    ky kyVar10 = kyVar2;
                    i16 = i12;
                    kyVar4 = kyVar10;
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1546713545, i16, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1318)");
                }
                i17 = i16;
                jO = kyVar4.o(z14, false);
                jO2 = kyVar4.o(z14, true);
                jN = kyVar4.n(z14, false);
                jN2 = kyVar4.n(z14, true);
                ky kyVar11 = kyVar4;
                a0Var3 = a0Var4;
                androidx.compose.ui.a0 a0VarI3 = androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var3, 0.0f, 1, null), j00.o0());
                boolean zL4 = c0VarR.L(jO);
                if ((i17 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zL = zL4 | z15 | c0VarR.L(jO2) | c0VarR.L(jN) | c0VarR.L(jN2);
                objI0 = c0VarR.i0();
                if (zL) {
                    z16 = z14;
                    i18 = 0;
                    Function1 function4 = new Function1() { // from class: androidx.compose.material3.jz
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return kz.I(jO, o00Var2, jO2, jN, jN2, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(function4);
                    objI0 = function4;
                } else {
                    z16 = z14;
                    i18 = 0;
                    Function1 function5 = new Function1() { // from class: androidx.compose.material3.jz
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return kz.I(jO, o00Var2, jO2, jN, jN2, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(function5);
                    objI0 = function5;
                }
                androidx.compose.foundation.f1.e(a0VarI3, (Function1) objI0, c0VarR, i18);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                kyVar3 = kyVar11;
                z13 = z16;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                kyVar3 = kyVar2;
                z13 = z11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ny
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.J(this.f31198a, o00Var, a0Var3, kyVar3, z13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                kyVar2 = kyVar;
                if (c0VarR.D(kyVar2)) {
                }
                i12 |= i20;
            } else {
                kyVar2 = kyVar;
            }
            i12 |= i20;
        } else {
            kyVar2 = kyVar;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.D(this)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((i12 & 9363) != 9362) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        ky kyVarI3 = i0(c0VarR, (i12 >> 12) & 14);
                        i12 &= -897;
                        kyVar2 = kyVarI3;
                    }
                    ky kyVar12 = kyVar2;
                    i16 = i12;
                    kyVar4 = kyVar12;
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                } else {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        ky kyVarI4 = i0(c0VarR, (i12 >> 12) & 14);
                        i12 &= -897;
                        kyVar2 = kyVarI4;
                    }
                    ky kyVar13 = kyVar2;
                    i16 = i12;
                    kyVar4 = kyVar13;
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1546713545, i16, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1318)");
                }
                i17 = i16;
                jO = kyVar4.o(z14, false);
                jO2 = kyVar4.o(z14, true);
                jN = kyVar4.n(z14, false);
                jN2 = kyVar4.n(z14, true);
                ky kyVar14 = kyVar4;
                a0Var3 = a0Var4;
                androidx.compose.ui.a0 a0VarI4 = androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var3, 0.0f, 1, null), j00.o0());
                boolean zL5 = c0VarR.L(jO);
                if ((i17 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zL = zL5 | z15 | c0VarR.L(jO2) | c0VarR.L(jN) | c0VarR.L(jN2);
                objI0 = c0VarR.i0();
                if (zL) {
                    z16 = z14;
                    i18 = 0;
                    Function1 function6 = new Function1() { // from class: androidx.compose.material3.jz
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return kz.I(jO, o00Var2, jO2, jN, jN2, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(function6);
                    objI0 = function6;
                } else {
                    z16 = z14;
                    i18 = 0;
                    Function1 function7 = new Function1() { // from class: androidx.compose.material3.jz
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return kz.I(jO, o00Var2, jO2, jN, jN2, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(function7);
                    objI0 = function7;
                }
                androidx.compose.foundation.f1.e(a0VarI4, (Function1) objI0, c0VarR, i18);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                kyVar3 = kyVar14;
                z13 = z16;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                kyVar3 = kyVar2;
                z13 = z11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ny
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.J(this.f31198a, o00Var, a0Var3, kyVar3, z13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z11 = z10;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            if (c0VarR.D(this)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i12 |= i15;
        }
        if ((i12 & 9363) != 9362) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    ky kyVarI5 = i0(c0VarR, (i12 >> 12) & 14);
                    i12 &= -897;
                    kyVar2 = kyVarI5;
                }
                ky kyVar15 = kyVar2;
                i16 = i12;
                kyVar4 = kyVar15;
                if (i13 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
            } else {
                if (i19 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    ky kyVarI6 = i0(c0VarR, (i12 >> 12) & 14);
                    i12 &= -897;
                    kyVar2 = kyVarI6;
                }
                ky kyVar16 = kyVar2;
                i16 = i12;
                kyVar4 = kyVar16;
                if (i13 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1546713545, i16, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1318)");
            }
            i17 = i16;
            jO = kyVar4.o(z14, false);
            jO2 = kyVar4.o(z14, true);
            jN = kyVar4.n(z14, false);
            jN2 = kyVar4.n(z14, true);
            ky kyVar17 = kyVar4;
            a0Var3 = a0Var4;
            androidx.compose.ui.a0 a0VarI5 = androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var3, 0.0f, 1, null), j00.o0());
            boolean zL6 = c0VarR.L(jO);
            if ((i17 & 14) == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            zL = zL6 | z15 | c0VarR.L(jO2) | c0VarR.L(jN) | c0VarR.L(jN2);
            objI0 = c0VarR.i0();
            if (zL) {
                z16 = z14;
                i18 = 0;
                Function1 function8 = new Function1() { // from class: androidx.compose.material3.jz
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return kz.I(jO, o00Var2, jO2, jN, jN2, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(function8);
                objI0 = function8;
            } else {
                z16 = z14;
                i18 = 0;
                Function1 function9 = new Function1() { // from class: androidx.compose.material3.jz
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return kz.I(jO, o00Var2, jO2, jN, jN2, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(function9);
                objI0 = function9;
            }
            androidx.compose.foundation.f1.e(a0VarI5, (Function1) objI0, c0VarR, i18);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            kyVar3 = kyVar17;
            z13 = z16;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            kyVar3 = kyVar2;
            z13 = z11;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ny
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return kz.J(this.f31198a, o00Var, a0Var3, kyVar3, z13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc A[PHI: r4 r5 r6
      0x00bc: PHI (r4v8 androidx.compose.ui.a0) = (r4v4 androidx.compose.ui.a0), (r4v10 androidx.compose.ui.a0) binds: [B:80:0x00d5, B:70:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r5v15 androidx.compose.material3.ky) = (r5v8 androidx.compose.material3.ky), (r5v16 androidx.compose.material3.ky) binds: [B:80:0x00d5, B:70:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r6v13 int) = (r6v8 int), (r6v15 int) binds: [B:80:0x00d5, B:70:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:87:0x011c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0122  */
    /* JADX WARN: Code duplicated, block: B:92:0x012f  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use the overload that takes `drawStopIndicator`, `drawTick`, `thumbTrackGapSize` and `trackInsideCornerSize`, see `LegacySliderSample` on how to restore the previous behavior", replaceWith = @kotlin.b1(expression = "Track(sliderState, modifier, enabled, colors, drawStopIndicator, drawTick, thumbTrackGapSize, trackInsideCornerSize)", imports = {}))
    @af
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.o
    public final /* synthetic */ void H(final t00 t00Var, androidx.compose.ui.a0 a0Var, ky kyVar, boolean z10, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        ky kyVar2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        boolean z12;
        final androidx.compose.ui.a0 a0Var3;
        final ky kyVar3;
        final boolean z13;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        ky kyVarI0;
        int i16;
        boolean z14;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(593554206);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(t00Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    kyVar2 = kyVar;
                    int i18 = c0VarR.D(kyVar2) ? 256 : 128;
                    i12 |= i18;
                } else {
                    kyVar2 = kyVar;
                }
                i12 |= i18;
            } else {
                kyVar2 = kyVar;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c0VarR.D(this)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                if ((i12 & 9363) != 9362) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            kyVarI0 = i0(c0VarR, (i12 >> 12) & 14);
                            i12 &= -897;
                        } else {
                            kyVarI0 = kyVar2;
                        }
                        i16 = i12;
                        if (i13 != 0) {
                            z14 = true;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(593554206, i16, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1400)");
                        }
                        androidx.compose.ui.a0 a0Var5 = a0Var4;
                        kyVar3 = kyVarI0;
                        N(t00Var, a0Var5, z14, kyVar3, null, null, j00.f29451f, j00.f29452g, c0VarR, (i16 & 14) | 14155776 | (i16 & com.planner5d.library.engine.input.f.b.B) | ((i16 >> 3) & 896) | ((i16 << 3) & 7168) | ((i16 << 12) & 234881024), 48);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z13 = z14;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        a0Var4 = a0Var2;
                        kyVarI0 = kyVar2;
                        i16 = i12;
                    }
                    z14 = z11;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(593554206, i16, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1400)");
                    }
                    androidx.compose.ui.a0 a0Var6 = a0Var4;
                    kyVar3 = kyVarI0;
                    N(t00Var, a0Var6, z14, kyVar3, null, null, j00.f29451f, j00.f29452g, c0VarR, (i16 & 14) | 14155776 | (i16 & com.planner5d.library.engine.input.f.b.B) | ((i16 >> 3) & 896) | ((i16 << 3) & 7168) | ((i16 << 12) & 234881024), 48);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z13 = z14;
                    a0Var3 = a0Var6;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    kyVar3 = kyVar2;
                    z13 = z11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.my
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.K(this.f30840a, t00Var, a0Var3, kyVar3, z13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z11 = z10;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.D(this)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((i12 & 9363) != 9362) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        kyVarI0 = i0(c0VarR, (i12 >> 12) & 14);
                        i12 &= -897;
                    } else {
                        kyVarI0 = kyVar2;
                    }
                    i16 = i12;
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        kyVarI0 = i0(c0VarR, (i12 >> 12) & 14);
                        i12 &= -897;
                    } else {
                        kyVarI0 = kyVar2;
                    }
                    i16 = i12;
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(593554206, i16, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1400)");
                }
                androidx.compose.ui.a0 a0Var7 = a0Var4;
                kyVar3 = kyVarI0;
                N(t00Var, a0Var7, z14, kyVar3, null, null, j00.f29451f, j00.f29452g, c0VarR, (i16 & 14) | 14155776 | (i16 & com.planner5d.library.engine.input.f.b.B) | ((i16 >> 3) & 896) | ((i16 << 3) & 7168) | ((i16 << 12) & 234881024), 48);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z13 = z14;
                a0Var3 = a0Var7;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                kyVar3 = kyVar2;
                z13 = z11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.my
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.K(this.f30840a, t00Var, a0Var3, kyVar3, z13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                kyVar2 = kyVar;
                if (c0VarR.D(kyVar2)) {
                }
                i12 |= i18;
            } else {
                kyVar2 = kyVar;
            }
            i12 |= i18;
        } else {
            kyVar2 = kyVar;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.D(this)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((i12 & 9363) != 9362) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        kyVarI0 = i0(c0VarR, (i12 >> 12) & 14);
                        i12 &= -897;
                    } else {
                        kyVarI0 = kyVar2;
                    }
                    i16 = i12;
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        kyVarI0 = i0(c0VarR, (i12 >> 12) & 14);
                        i12 &= -897;
                    } else {
                        kyVarI0 = kyVar2;
                    }
                    i16 = i12;
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(593554206, i16, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1400)");
                }
                androidx.compose.ui.a0 a0Var8 = a0Var4;
                kyVar3 = kyVarI0;
                N(t00Var, a0Var8, z14, kyVar3, null, null, j00.f29451f, j00.f29452g, c0VarR, (i16 & 14) | 14155776 | (i16 & com.planner5d.library.engine.input.f.b.B) | ((i16 >> 3) & 896) | ((i16 << 3) & 7168) | ((i16 << 12) & 234881024), 48);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z13 = z14;
                a0Var3 = a0Var8;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                kyVar3 = kyVar2;
                z13 = z11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.my
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.K(this.f30840a, t00Var, a0Var3, kyVar3, z13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z11 = z10;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            if (c0VarR.D(this)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i12 |= i15;
        }
        if ((i12 & 9363) != 9362) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    kyVarI0 = i0(c0VarR, (i12 >> 12) & 14);
                    i12 &= -897;
                } else {
                    kyVarI0 = kyVar2;
                }
                i16 = i12;
                if (i13 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
            } else {
                if (i17 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    kyVarI0 = i0(c0VarR, (i12 >> 12) & 14);
                    i12 &= -897;
                } else {
                    kyVarI0 = kyVar2;
                }
                i16 = i12;
                if (i13 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(593554206, i16, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1400)");
            }
            androidx.compose.ui.a0 a0Var9 = a0Var4;
            kyVar3 = kyVarI0;
            N(t00Var, a0Var9, z14, kyVar3, null, null, j00.f29451f, j00.f29452g, c0VarR, (i16 & 14) | 14155776 | (i16 & com.planner5d.library.engine.input.f.b.B) | ((i16 >> 3) & 896) | ((i16 << 3) & 7168) | ((i16 << 12) & 234881024), 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            z13 = z14;
            a0Var3 = a0Var9;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            kyVar3 = kyVar2;
            z13 = z11;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.my
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return kz.K(this.f30840a, t00Var, a0Var3, kyVar3, z13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0124  */
    /* JADX WARN: Code duplicated, block: B:103:0x012e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0138  */
    /* JADX WARN: Code duplicated, block: B:115:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x015e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0163  */
    /* JADX WARN: Code duplicated, block: B:121:0x016b  */
    /* JADX WARN: Code duplicated, block: B:124:0x017a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0182  */
    /* JADX WARN: Code duplicated, block: B:128:0x0188  */
    /* JADX WARN: Code duplicated, block: B:134:0x0199  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:142:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:150:0x01db  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:154:0x0201  */
    /* JADX WARN: Code duplicated, block: B:157:0x0240  */
    /* JADX WARN: Code duplicated, block: B:158:0x0244  */
    /* JADX WARN: Code duplicated, block: B:161:0x0257  */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x0101  */
    /* JADX WARN: Code duplicated, block: B:90:0x0104  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x010e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0111  */
    /* JADX WARN: Code duplicated, block: B:99:0x0121  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void M(@NotNull final bt btVar, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable ky kyVar, @Nullable Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function2, @Nullable pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar, float f10, float f11, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        final boolean z11;
        int i14;
        final ky kyVar2;
        Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function3;
        int i15;
        int i16;
        int i17;
        float f12;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z12;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final ky kyVar3;
        final Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function4;
        final float f13;
        final float f14;
        final pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar2;
        androidx.compose.runtime.s5 s5VarT;
        pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar3;
        int i22;
        Object objI0;
        boolean z14;
        Object objI1;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-541824132);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(btVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i23 = i11 & 2;
        if (i23 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        kyVar2 = kyVar;
                        int i24 = c0VarR.D(kyVar2) ? 2048 : 1024;
                        i12 |= i24;
                    } else {
                        kyVar2 = kyVar;
                    }
                    i12 |= i24;
                } else {
                    kyVar2 = kyVar;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        function3 = function2;
                        int i25 = c0VarR.k0(function3) ? 16384 : 8192;
                        i12 |= i25;
                    } else {
                        function3 = function2;
                    }
                    i12 |= i25;
                } else {
                    function3 = function2;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    f12 = f10;
                } else {
                    f12 = f10;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.I(f12)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f11)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i11 & 256) != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(this)) {
                        i21 = 67108864;
                    } else {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i21;
                }
                if ((38347923 & i12) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            ky kyVarI0 = i0(c0VarR, (i12 >> 24) & 14);
                            i12 &= -7169;
                            kyVar2 = kyVarI0;
                        }
                        if ((i11 & 16) != 0) {
                            z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                            objI1 = c0VarR.i0();
                            if (z14 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ty
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.c0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-57345) & i12;
                        }
                        if (i15 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = d.f30154a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i17 != 0) {
                            f12 = j00.f29451f;
                        }
                        if (i19 != 0) {
                            z13 = z11;
                            function4 = function3;
                            f14 = f12;
                            nVar2 = nVar3;
                            i22 = i12;
                            a0Var3 = a0Var2;
                            kyVar3 = kyVar2;
                            f13 = j00.f29452g;
                        } else {
                            z13 = z11;
                            function4 = function3;
                            f14 = f12;
                            nVar2 = nVar3;
                            i22 = i12;
                            a0Var3 = a0Var2;
                            kyVar3 = kyVar2;
                            f13 = f11;
                        }
                    } else {
                        c0VarR.u();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        i22 = i12;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        function4 = function3;
                        f13 = f11;
                        f14 = f12;
                        nVar2 = nVar;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-541824132, i22, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1734)");
                    }
                    int i26 = (i22 & 14) | 48;
                    int i27 = i22 << 3;
                    R(btVar, androidx.compose.ui.unit.h.f42689b.e(), a0Var3, z13, kyVar3, function4, nVar2, f14, f13, c0VarR, i26 | (i27 & 896) | (i27 & 7168) | (57344 & i27) | (458752 & i27) | (3670016 & i27) | (29360128 & i27) | (234881024 & i27) | (i27 & 1879048192));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    function4 = function3;
                    f13 = f11;
                    f14 = f12;
                    nVar2 = nVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.uy
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.d0(this.f33804a, btVar, a0Var3, z13, kyVar3, function4, nVar2, f14, f13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    kyVar2 = kyVar;
                    if (c0VarR.D(kyVar2)) {
                    }
                    i12 |= i24;
                } else {
                    kyVar2 = kyVar;
                }
                i12 |= i24;
            } else {
                kyVar2 = kyVar;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                    }
                    i12 |= i25;
                } else {
                    function3 = function2;
                }
                i12 |= i25;
            } else {
                function3 = function2;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                f12 = f10;
            } else {
                f12 = f10;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.I(f12)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f11)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i11 & 256) != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.D(this)) {
                    i21 = 67108864;
                } else {
                    i21 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i21;
            }
            if ((38347923 & i12) != 38347922) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        ky kyVarI1 = i0(c0VarR, (i12 >> 24) & 14);
                        i12 &= -7169;
                        kyVar2 = kyVarI1;
                    }
                    if ((i11 & 16) != 0) {
                        z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ty
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.c0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ty
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.c0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-57345) & i12;
                    }
                    if (i15 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = d.f30154a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i17 != 0) {
                        f12 = j00.f29451f;
                    }
                    if (i19 != 0) {
                        z13 = z11;
                        function4 = function3;
                        f14 = f12;
                        nVar2 = nVar3;
                        i22 = i12;
                        a0Var3 = a0Var2;
                        kyVar3 = kyVar2;
                        f13 = j00.f29452g;
                    } else {
                        z13 = z11;
                        function4 = function3;
                        f14 = f12;
                        nVar2 = nVar3;
                        i22 = i12;
                        a0Var3 = a0Var2;
                        kyVar3 = kyVar2;
                        f13 = f11;
                    }
                } else {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        ky kyVarI2 = i0(c0VarR, (i12 >> 24) & 14);
                        i12 &= -7169;
                        kyVar2 = kyVarI2;
                    }
                    if ((i11 & 16) != 0) {
                        z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ty
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.c0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ty
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.c0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-57345) & i12;
                    }
                    if (i15 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = d.f30154a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i17 != 0) {
                        f12 = j00.f29451f;
                    }
                    if (i19 != 0) {
                        z13 = z11;
                        function4 = function3;
                        f14 = f12;
                        nVar2 = nVar3;
                        i22 = i12;
                        a0Var3 = a0Var2;
                        kyVar3 = kyVar2;
                        f13 = j00.f29452g;
                    } else {
                        z13 = z11;
                        function4 = function3;
                        f14 = f12;
                        nVar2 = nVar3;
                        i22 = i12;
                        a0Var3 = a0Var2;
                        kyVar3 = kyVar2;
                        f13 = f11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-541824132, i22, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1734)");
                }
                int i28 = (i22 & 14) | 48;
                int i29 = i22 << 3;
                R(btVar, androidx.compose.ui.unit.h.f42689b.e(), a0Var3, z13, kyVar3, function4, nVar2, f14, f13, c0VarR, i28 | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (3670016 & i29) | (29360128 & i29) | (234881024 & i29) | (i29 & 1879048192));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z13 = z11;
                kyVar3 = kyVar2;
                function4 = function3;
                f13 = f11;
                f14 = f12;
                nVar2 = nVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.uy
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.d0(this.f33804a, btVar, a0Var3, z13, kyVar3, function4, nVar2, f14, f13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    kyVar2 = kyVar;
                    if (c0VarR.D(kyVar2)) {
                    }
                    i12 |= i24;
                } else {
                    kyVar2 = kyVar;
                }
                i12 |= i24;
            } else {
                kyVar2 = kyVar;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                    }
                    i12 |= i25;
                } else {
                    function3 = function2;
                }
                i12 |= i25;
            } else {
                function3 = function2;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                f12 = f10;
            } else {
                f12 = f10;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.I(f12)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f11)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i11 & 256) != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.D(this)) {
                    i21 = 67108864;
                } else {
                    i21 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i21;
            }
            if ((38347923 & i12) != 38347922) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        ky kyVarI3 = i0(c0VarR, (i12 >> 24) & 14);
                        i12 &= -7169;
                        kyVar2 = kyVarI3;
                    }
                    if ((i11 & 16) != 0) {
                        z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ty
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.c0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ty
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.c0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-57345) & i12;
                    }
                    if (i15 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = d.f30154a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i17 != 0) {
                        f12 = j00.f29451f;
                    }
                    if (i19 != 0) {
                        z13 = z11;
                        function4 = function3;
                        f14 = f12;
                        nVar2 = nVar3;
                        i22 = i12;
                        a0Var3 = a0Var2;
                        kyVar3 = kyVar2;
                        f13 = j00.f29452g;
                    } else {
                        z13 = z11;
                        function4 = function3;
                        f14 = f12;
                        nVar2 = nVar3;
                        i22 = i12;
                        a0Var3 = a0Var2;
                        kyVar3 = kyVar2;
                        f13 = f11;
                    }
                } else {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        ky kyVarI4 = i0(c0VarR, (i12 >> 24) & 14);
                        i12 &= -7169;
                        kyVar2 = kyVarI4;
                    }
                    if ((i11 & 16) != 0) {
                        z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ty
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.c0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ty
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.c0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-57345) & i12;
                    }
                    if (i15 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = d.f30154a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i17 != 0) {
                        f12 = j00.f29451f;
                    }
                    if (i19 != 0) {
                        z13 = z11;
                        function4 = function3;
                        f14 = f12;
                        nVar2 = nVar3;
                        i22 = i12;
                        a0Var3 = a0Var2;
                        kyVar3 = kyVar2;
                        f13 = j00.f29452g;
                    } else {
                        z13 = z11;
                        function4 = function3;
                        f14 = f12;
                        nVar2 = nVar3;
                        i22 = i12;
                        a0Var3 = a0Var2;
                        kyVar3 = kyVar2;
                        f13 = f11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-541824132, i22, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1734)");
                }
                int i210 = (i22 & 14) | 48;
                int i211 = i22 << 3;
                R(btVar, androidx.compose.ui.unit.h.f42689b.e(), a0Var3, z13, kyVar3, function4, nVar2, f14, f13, c0VarR, i210 | (i211 & 896) | (i211 & 7168) | (57344 & i211) | (458752 & i211) | (3670016 & i211) | (29360128 & i211) | (234881024 & i211) | (i211 & 1879048192));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z13 = z11;
                kyVar3 = kyVar2;
                function4 = function3;
                f13 = f11;
                f14 = f12;
                nVar2 = nVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.uy
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.d0(this.f33804a, btVar, a0Var3, z13, kyVar3, function4, nVar2, f14, f13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                kyVar2 = kyVar;
                if (c0VarR.D(kyVar2)) {
                }
                i12 |= i24;
            } else {
                kyVar2 = kyVar;
            }
            i12 |= i24;
        } else {
            kyVar2 = kyVar;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                function3 = function2;
                if (c0VarR.k0(function3)) {
                }
                i12 |= i25;
            } else {
                function3 = function2;
            }
            i12 |= i25;
        } else {
            function3 = function2;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.k0(nVar)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i12 |= i16;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
            f12 = f10;
        } else {
            f12 = f10;
            if ((i10 & 1572864) == 0) {
                if (c0VarR.I(f12)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
        }
        i19 = i11 & 128;
        if (i19 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.I(f11)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i12 |= i20;
        }
        if ((i11 & 256) != 0) {
            i12 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c0VarR.D(this)) {
                i21 = 67108864;
            } else {
                i21 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i12 |= i21;
        }
        if ((38347923 & i12) != 38347922) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    ky kyVarI5 = i0(c0VarR, (i12 >> 24) & 14);
                    i12 &= -7169;
                    kyVar2 = kyVarI5;
                }
                if ((i11 & 16) != 0) {
                    z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                    objI1 = c0VarR.i0();
                    if (z14) {
                        objI1 = new Function2() { // from class: androidx.compose.material3.ty
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.c0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function2() { // from class: androidx.compose.material3.ty
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.c0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    function3 = (Function2) objI1;
                    i12 = (-57345) & i12;
                }
                if (i15 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = d.f30154a;
                        c0VarR.Y(objI0);
                    }
                    nVar3 = (pj.n) objI0;
                } else {
                    nVar3 = nVar;
                }
                if (i17 != 0) {
                    f12 = j00.f29451f;
                }
                if (i19 != 0) {
                    z13 = z11;
                    function4 = function3;
                    f14 = f12;
                    nVar2 = nVar3;
                    i22 = i12;
                    a0Var3 = a0Var2;
                    kyVar3 = kyVar2;
                    f13 = j00.f29452g;
                } else {
                    z13 = z11;
                    function4 = function3;
                    f14 = f12;
                    nVar2 = nVar3;
                    i22 = i12;
                    a0Var3 = a0Var2;
                    kyVar3 = kyVar2;
                    f13 = f11;
                }
            } else {
                if (i23 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    ky kyVarI6 = i0(c0VarR, (i12 >> 24) & 14);
                    i12 &= -7169;
                    kyVar2 = kyVarI6;
                }
                if ((i11 & 16) != 0) {
                    z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                    objI1 = c0VarR.i0();
                    if (z14) {
                        objI1 = new Function2() { // from class: androidx.compose.material3.ty
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.c0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function2() { // from class: androidx.compose.material3.ty
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.c0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    function3 = (Function2) objI1;
                    i12 = (-57345) & i12;
                }
                if (i15 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = d.f30154a;
                        c0VarR.Y(objI0);
                    }
                    nVar3 = (pj.n) objI0;
                } else {
                    nVar3 = nVar;
                }
                if (i17 != 0) {
                    f12 = j00.f29451f;
                }
                if (i19 != 0) {
                    z13 = z11;
                    function4 = function3;
                    f14 = f12;
                    nVar2 = nVar3;
                    i22 = i12;
                    a0Var3 = a0Var2;
                    kyVar3 = kyVar2;
                    f13 = j00.f29452g;
                } else {
                    z13 = z11;
                    function4 = function3;
                    f14 = f12;
                    nVar2 = nVar3;
                    i22 = i12;
                    a0Var3 = a0Var2;
                    kyVar3 = kyVar2;
                    f13 = f11;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-541824132, i22, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1734)");
            }
            int i212 = (i22 & 14) | 48;
            int i213 = i22 << 3;
            R(btVar, androidx.compose.ui.unit.h.f42689b.e(), a0Var3, z13, kyVar3, function4, nVar2, f14, f13, c0VarR, i212 | (i213 & 896) | (i213 & 7168) | (57344 & i213) | (458752 & i213) | (3670016 & i213) | (29360128 & i213) | (234881024 & i213) | (i213 & 1879048192));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            z13 = z11;
            kyVar3 = kyVar2;
            function4 = function3;
            f13 = f11;
            f14 = f12;
            nVar2 = nVar;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.uy
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return kz.d0(this.f33804a, btVar, a0Var3, z13, kyVar3, function4, nVar2, f14, f13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0128  */
    /* JADX WARN: Code duplicated, block: B:103:0x0132  */
    /* JADX WARN: Code duplicated, block: B:105:0x013c  */
    /* JADX WARN: Code duplicated, block: B:116:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x015d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0162  */
    /* JADX WARN: Code duplicated, block: B:122:0x0168  */
    /* JADX WARN: Code duplicated, block: B:125:0x0177  */
    /* JADX WARN: Code duplicated, block: B:127:0x017f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0185  */
    /* JADX WARN: Code duplicated, block: B:135:0x0194  */
    /* JADX WARN: Code duplicated, block: B:138:0x019e  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:152:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:155:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:158:0x0234  */
    /* JADX WARN: Code duplicated, block: B:159:0x0238  */
    /* JADX WARN: Code duplicated, block: B:162:0x024b  */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:89:0x0105  */
    /* JADX WARN: Code duplicated, block: B:90:0x0108  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112  */
    /* JADX WARN: Code duplicated, block: B:95:0x0115  */
    /* JADX WARN: Code duplicated, block: B:99:0x0125  */
    @androidx.compose.runtime.o
    @af
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void N(@NotNull final t00 t00Var, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable ky kyVar, @Nullable Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function2, @Nullable pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar, float f10, float f11, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        final boolean z11;
        int i14;
        final ky kyVar2;
        Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function3;
        int i15;
        int i16;
        int i17;
        final float f12;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z12;
        final pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final ky kyVar3;
        final Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function4;
        final float f13;
        androidx.compose.runtime.s5 s5VarT;
        pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar3;
        int i22;
        Object objI0;
        boolean z14;
        Object objI1;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(49984771);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(t00Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i23 = i11 & 2;
        if (i23 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        kyVar2 = kyVar;
                        int i24 = c0VarR.D(kyVar2) ? 2048 : 1024;
                        i12 |= i24;
                    } else {
                        kyVar2 = kyVar;
                    }
                    i12 |= i24;
                } else {
                    kyVar2 = kyVar;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        function3 = function2;
                        int i25 = c0VarR.k0(function3) ? 16384 : 8192;
                        i12 |= i25;
                    } else {
                        function3 = function2;
                    }
                    i12 |= i25;
                } else {
                    function3 = function2;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    f12 = f10;
                } else {
                    f12 = f10;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.I(f12)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f11)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i11 & 256) != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(this)) {
                        i21 = 67108864;
                    } else {
                        i21 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i21;
                }
                if ((38347923 & i12) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            ky kyVarI0 = i0(c0VarR, (i12 >> 24) & 14);
                            i12 &= -7169;
                            kyVar2 = kyVarI0;
                        }
                        if ((i11 & 16) != 0) {
                            z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                            objI1 = c0VarR.i0();
                            if (z14 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.cz
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.a0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-57345) & i12;
                        }
                        if (i15 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = f.f30156a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i17 != 0) {
                            f12 = j00.f29451f;
                        }
                        if (i19 != 0) {
                            nVar2 = nVar3;
                            i22 = i12;
                            z13 = z11;
                            kyVar3 = kyVar2;
                            f13 = j00.f29452g;
                        } else {
                            nVar2 = nVar3;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(49984771, i22, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1446)");
                        }
                        int i26 = i22 << 3;
                        a0Var3 = a0Var2;
                        function4 = function3;
                        Q(t00Var, androidx.compose.ui.unit.h.f42689b.e(), a0Var3, z13, kyVar3, function4, nVar2, f12, f13, false, false, c0VarR, (i22 & 14) | 805306416 | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (458752 & i26) | (3670016 & i26) | (29360128 & i26) | (i26 & 234881024), ((i22 >> 21) & com.planner5d.library.engine.input.f.b.B) | 6);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                    } else {
                        c0VarR.u();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        nVar2 = nVar;
                    }
                    i22 = i12;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    f13 = f11;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(49984771, i22, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1446)");
                    }
                    int i27 = i22 << 3;
                    a0Var3 = a0Var2;
                    function4 = function3;
                    Q(t00Var, androidx.compose.ui.unit.h.f42689b.e(), a0Var3, z13, kyVar3, function4, nVar2, f12, f13, false, false, c0VarR, (i22 & 14) | 805306416 | (i27 & 896) | (i27 & 7168) | (57344 & i27) | (458752 & i27) | (3670016 & i27) | (29360128 & i27) | (i27 & 234881024), ((i22 >> 21) & com.planner5d.library.engine.input.f.b.B) | 6);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                } else {
                    c0VarR.u();
                    nVar2 = nVar;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    function4 = function3;
                    f13 = f11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.dz
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.b0(this.f27172a, t00Var, a0Var3, z13, kyVar3, function4, nVar2, f12, f13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    kyVar2 = kyVar;
                    if (c0VarR.D(kyVar2)) {
                    }
                    i12 |= i24;
                } else {
                    kyVar2 = kyVar;
                }
                i12 |= i24;
            } else {
                kyVar2 = kyVar;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                    }
                    i12 |= i25;
                } else {
                    function3 = function2;
                }
                i12 |= i25;
            } else {
                function3 = function2;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                f12 = f10;
            } else {
                f12 = f10;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.I(f12)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f11)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i11 & 256) != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.D(this)) {
                    i21 = 67108864;
                } else {
                    i21 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i21;
            }
            if ((38347923 & i12) != 38347922) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        ky kyVarI1 = i0(c0VarR, (i12 >> 24) & 14);
                        i12 &= -7169;
                        kyVar2 = kyVarI1;
                    }
                    if ((i11 & 16) != 0) {
                        z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.cz
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.a0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.cz
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.a0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-57345) & i12;
                    }
                    if (i15 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = f.f30156a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i17 != 0) {
                        f12 = j00.f29451f;
                    }
                    if (i19 != 0) {
                        nVar2 = nVar3;
                        i22 = i12;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        f13 = j00.f29452g;
                    } else {
                        nVar2 = nVar3;
                        i22 = i12;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        f13 = f11;
                    }
                } else {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        ky kyVarI2 = i0(c0VarR, (i12 >> 24) & 14);
                        i12 &= -7169;
                        kyVar2 = kyVarI2;
                    }
                    if ((i11 & 16) != 0) {
                        z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.cz
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.a0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.cz
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.a0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-57345) & i12;
                    }
                    if (i15 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = f.f30156a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i17 != 0) {
                        f12 = j00.f29451f;
                    }
                    if (i19 != 0) {
                        nVar2 = nVar3;
                        i22 = i12;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        f13 = j00.f29452g;
                    } else {
                        nVar2 = nVar3;
                        i22 = i12;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        f13 = f11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(49984771, i22, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1446)");
                }
                int i28 = i22 << 3;
                a0Var3 = a0Var2;
                function4 = function3;
                Q(t00Var, androidx.compose.ui.unit.h.f42689b.e(), a0Var3, z13, kyVar3, function4, nVar2, f12, f13, false, false, c0VarR, (i22 & 14) | 805306416 | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | (3670016 & i28) | (29360128 & i28) | (i28 & 234881024), ((i22 >> 21) & com.planner5d.library.engine.input.f.b.B) | 6);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                nVar2 = nVar;
                a0Var3 = a0Var2;
                z13 = z11;
                kyVar3 = kyVar2;
                function4 = function3;
                f13 = f11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.dz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.b0(this.f27172a, t00Var, a0Var3, z13, kyVar3, function4, nVar2, f12, f13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    kyVar2 = kyVar;
                    if (c0VarR.D(kyVar2)) {
                    }
                    i12 |= i24;
                } else {
                    kyVar2 = kyVar;
                }
                i12 |= i24;
            } else {
                kyVar2 = kyVar;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                    }
                    i12 |= i25;
                } else {
                    function3 = function2;
                }
                i12 |= i25;
            } else {
                function3 = function2;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                f12 = f10;
            } else {
                f12 = f10;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.I(f12)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f11)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i11 & 256) != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.D(this)) {
                    i21 = 67108864;
                } else {
                    i21 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i21;
            }
            if ((38347923 & i12) != 38347922) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        ky kyVarI3 = i0(c0VarR, (i12 >> 24) & 14);
                        i12 &= -7169;
                        kyVar2 = kyVarI3;
                    }
                    if ((i11 & 16) != 0) {
                        z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.cz
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.a0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.cz
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.a0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-57345) & i12;
                    }
                    if (i15 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = f.f30156a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i17 != 0) {
                        f12 = j00.f29451f;
                    }
                    if (i19 != 0) {
                        nVar2 = nVar3;
                        i22 = i12;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        f13 = j00.f29452g;
                    } else {
                        nVar2 = nVar3;
                        i22 = i12;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        f13 = f11;
                    }
                } else {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        ky kyVarI4 = i0(c0VarR, (i12 >> 24) & 14);
                        i12 &= -7169;
                        kyVar2 = kyVarI4;
                    }
                    if ((i11 & 16) != 0) {
                        z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.cz
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.a0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.cz
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.a0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-57345) & i12;
                    }
                    if (i15 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = f.f30156a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i17 != 0) {
                        f12 = j00.f29451f;
                    }
                    if (i19 != 0) {
                        nVar2 = nVar3;
                        i22 = i12;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        f13 = j00.f29452g;
                    } else {
                        nVar2 = nVar3;
                        i22 = i12;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        f13 = f11;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(49984771, i22, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1446)");
                }
                int i29 = i22 << 3;
                a0Var3 = a0Var2;
                function4 = function3;
                Q(t00Var, androidx.compose.ui.unit.h.f42689b.e(), a0Var3, z13, kyVar3, function4, nVar2, f12, f13, false, false, c0VarR, (i22 & 14) | 805306416 | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (3670016 & i29) | (29360128 & i29) | (i29 & 234881024), ((i22 >> 21) & com.planner5d.library.engine.input.f.b.B) | 6);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                nVar2 = nVar;
                a0Var3 = a0Var2;
                z13 = z11;
                kyVar3 = kyVar2;
                function4 = function3;
                f13 = f11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.dz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.b0(this.f27172a, t00Var, a0Var3, z13, kyVar3, function4, nVar2, f12, f13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                kyVar2 = kyVar;
                if (c0VarR.D(kyVar2)) {
                }
                i12 |= i24;
            } else {
                kyVar2 = kyVar;
            }
            i12 |= i24;
        } else {
            kyVar2 = kyVar;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                function3 = function2;
                if (c0VarR.k0(function3)) {
                }
                i12 |= i25;
            } else {
                function3 = function2;
            }
            i12 |= i25;
        } else {
            function3 = function2;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.k0(nVar)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i12 |= i16;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
            f12 = f10;
        } else {
            f12 = f10;
            if ((i10 & 1572864) == 0) {
                if (c0VarR.I(f12)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
        }
        i19 = i11 & 128;
        if (i19 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.I(f11)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i12 |= i20;
        }
        if ((i11 & 256) != 0) {
            i12 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c0VarR.D(this)) {
                i21 = 67108864;
            } else {
                i21 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i12 |= i21;
        }
        if ((38347923 & i12) != 38347922) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    ky kyVarI5 = i0(c0VarR, (i12 >> 24) & 14);
                    i12 &= -7169;
                    kyVar2 = kyVarI5;
                }
                if ((i11 & 16) != 0) {
                    z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                    objI1 = c0VarR.i0();
                    if (z14) {
                        objI1 = new Function2() { // from class: androidx.compose.material3.cz
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.a0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function2() { // from class: androidx.compose.material3.cz
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.a0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    function3 = (Function2) objI1;
                    i12 = (-57345) & i12;
                }
                if (i15 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = f.f30156a;
                        c0VarR.Y(objI0);
                    }
                    nVar3 = (pj.n) objI0;
                } else {
                    nVar3 = nVar;
                }
                if (i17 != 0) {
                    f12 = j00.f29451f;
                }
                if (i19 != 0) {
                    nVar2 = nVar3;
                    i22 = i12;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    f13 = j00.f29452g;
                } else {
                    nVar2 = nVar3;
                    i22 = i12;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    f13 = f11;
                }
            } else {
                if (i23 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    ky kyVarI6 = i0(c0VarR, (i12 >> 24) & 14);
                    i12 &= -7169;
                    kyVar2 = kyVarI6;
                }
                if ((i11 & 16) != 0) {
                    z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                    objI1 = c0VarR.i0();
                    if (z14) {
                        objI1 = new Function2() { // from class: androidx.compose.material3.cz
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.a0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function2() { // from class: androidx.compose.material3.cz
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.a0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    function3 = (Function2) objI1;
                    i12 = (-57345) & i12;
                }
                if (i15 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = f.f30156a;
                        c0VarR.Y(objI0);
                    }
                    nVar3 = (pj.n) objI0;
                } else {
                    nVar3 = nVar;
                }
                if (i17 != 0) {
                    f12 = j00.f29451f;
                }
                if (i19 != 0) {
                    nVar2 = nVar3;
                    i22 = i12;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    f13 = j00.f29452g;
                } else {
                    nVar2 = nVar3;
                    i22 = i12;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    f13 = f11;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(49984771, i22, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1446)");
            }
            int i210 = i22 << 3;
            a0Var3 = a0Var2;
            function4 = function3;
            Q(t00Var, androidx.compose.ui.unit.h.f42689b.e(), a0Var3, z13, kyVar3, function4, nVar2, f12, f13, false, false, c0VarR, (i22 & 14) | 805306416 | (i210 & 896) | (i210 & 7168) | (57344 & i210) | (458752 & i210) | (3670016 & i210) | (29360128 & i210) | (i210 & 234881024), ((i22 >> 21) & com.planner5d.library.engine.input.f.b.B) | 6);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
            nVar2 = nVar;
            a0Var3 = a0Var2;
            z13 = z11;
            kyVar3 = kyVar2;
            function4 = function3;
            f13 = f11;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.dz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return kz.b0(this.f27172a, t00Var, a0Var3, z13, kyVar3, function4, nVar2, f12, f13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0128  */
    /* JADX WARN: Code duplicated, block: B:102:0x012b  */
    /* JADX WARN: Code duplicated, block: B:104:0x012f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0135  */
    /* JADX WARN: Code duplicated, block: B:107:0x0138  */
    /* JADX WARN: Code duplicated, block: B:111:0x0148  */
    /* JADX WARN: Code duplicated, block: B:112:0x014b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0155  */
    /* JADX WARN: Code duplicated, block: B:117:0x0162  */
    /* JADX WARN: Code duplicated, block: B:128:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0185  */
    /* JADX WARN: Code duplicated, block: B:131:0x018a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0190  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:150:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:157:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:161:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:163:0x0204  */
    /* JADX WARN: Code duplicated, block: B:164:0x0213  */
    /* JADX WARN: Code duplicated, block: B:167:0x021f  */
    /* JADX WARN: Code duplicated, block: B:170:0x023c  */
    /* JADX WARN: Code duplicated, block: B:172:0x024b  */
    /* JADX WARN: Code duplicated, block: B:175:0x0263  */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x010d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0111  */
    /* JADX WARN: Code duplicated, block: B:96:0x011b  */
    /* JADX WARN: Code duplicated, block: B:97:0x011e  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void O(@NotNull final bt btVar, final float f10, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable ky kyVar, @Nullable Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function2, @Nullable pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar, float f11, float f12, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        int i13;
        androidx.compose.ui.a0 a0Var2;
        int i14;
        int i15;
        final boolean z11;
        int i16;
        final ky kyVar2;
        Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function3;
        int i17;
        int i18;
        int i19;
        float f13;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z12;
        final pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final ky kyVar3;
        final float f14;
        final Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function4;
        final float f15;
        androidx.compose.runtime.s5 s5VarT;
        pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar3;
        pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar4;
        int i24;
        androidx.compose.ui.a0 a0Var4;
        boolean z14;
        ky kyVar4;
        float f16;
        Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function5;
        float f17;
        Object objI0;
        boolean z15;
        Object objI1;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1952945688);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(btVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.I(f10) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        z11 = z10;
                        if (c0VarR.G(z11)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 24576) == 0) {
                        if ((i11 & 16) == 0) {
                            kyVar2 = kyVar;
                            int i25 = c0VarR.D(kyVar2) ? 16384 : 8192;
                            i12 |= i25;
                        } else {
                            kyVar2 = kyVar;
                        }
                        i12 |= i25;
                    } else {
                        kyVar2 = kyVar;
                    }
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            function3 = function2;
                            int i26 = c0VarR.k0(function3) ? 131072 : 65536;
                            i12 |= i26;
                        } else {
                            function3 = function2;
                        }
                        i12 |= i26;
                    } else {
                        function3 = function2;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                        f13 = f11;
                    } else {
                        f13 = f11;
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.I(f13)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                            i12 |= i20;
                        }
                    }
                    i21 = i11 & 256;
                    if (i21 != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.I(f12)) {
                                i22 = 67108864;
                            } else {
                                i22 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i12 |= i22;
                        }
                        if ((i11 & 512) != 0) {
                            i12 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.D(this)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i12 |= i23;
                        }
                        if ((306783379 & i12) != 306783378) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z11 = true;
                                }
                                if ((i11 & 16) != 0) {
                                    ky kyVarI0 = i0(c0VarR, (i12 >> 27) & 14);
                                    i12 &= -57345;
                                    kyVar2 = kyVarI0;
                                }
                                if ((i11 & 32) != 0) {
                                    z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                                    objI1 = c0VarR.i0();
                                    if (z15 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                            }
                                        };
                                        c0VarR.Y(objI1);
                                    }
                                    function3 = (Function2) objI1;
                                    i12 = (-458753) & i12;
                                }
                                if (i17 != 0) {
                                    objI0 = c0VarR.i0();
                                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI0 = e.f30155a;
                                        c0VarR.Y(objI0);
                                    }
                                    nVar3 = (pj.n) objI0;
                                } else {
                                    nVar3 = nVar;
                                }
                                if (i19 != 0) {
                                    f13 = j00.f29451f;
                                }
                                if (i21 != 0) {
                                    nVar4 = nVar3;
                                    i24 = i12;
                                    a0Var4 = a0Var2;
                                    z14 = z11;
                                    kyVar4 = kyVar2;
                                    f16 = f13;
                                    function5 = function3;
                                    f17 = j00.f29452g;
                                } else {
                                    nVar4 = nVar3;
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(1952945688, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1785)");
                                }
                                R(btVar, f10, a0Var4, z14, kyVar4, function5, nVar4, f16, f17, c0VarR, i24 & 2147483646);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                f15 = f17;
                                f14 = f16;
                                nVar2 = nVar4;
                                function4 = function5;
                                kyVar3 = kyVar4;
                                z13 = z14;
                                a0Var3 = a0Var4;
                            } else {
                                c0VarR.u();
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                nVar4 = nVar;
                            }
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = f12;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1952945688, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1785)");
                            }
                            R(btVar, f10, a0Var4, z14, kyVar4, function5, nVar4, f16, f17, c0VarR, i24 & 2147483646);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            f15 = f17;
                            f14 = f16;
                            nVar2 = nVar4;
                            function4 = function5;
                            kyVar3 = kyVar4;
                            z13 = z14;
                            a0Var3 = a0Var4;
                        } else {
                            c0VarR.u();
                            nVar2 = nVar;
                            a0Var3 = a0Var2;
                            z13 = z11;
                            kyVar3 = kyVar2;
                            f14 = f13;
                            function4 = function3;
                            f15 = f12;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.fz
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.h0(this.f27774a, btVar, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 100663296;
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(this)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i12 |= i23;
                    }
                    if ((306783379 & i12) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                ky kyVarI1 = i0(c0VarR, (i12 >> 27) & 14);
                                i12 &= -57345;
                                kyVar2 = kyVarI1;
                            }
                            if ((i11 & 32) != 0) {
                                z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                                objI1 = c0VarR.i0();
                                if (z15) {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                } else {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                function3 = (Function2) objI1;
                                i12 = (-458753) & i12;
                            }
                            if (i17 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = e.f30155a;
                                    c0VarR.Y(objI0);
                                }
                                nVar3 = (pj.n) objI0;
                            } else {
                                nVar3 = nVar;
                            }
                            if (i19 != 0) {
                                f13 = j00.f29451f;
                            }
                            if (i21 != 0) {
                                nVar4 = nVar3;
                                i24 = i12;
                                a0Var4 = a0Var2;
                                z14 = z11;
                                kyVar4 = kyVar2;
                                f16 = f13;
                                function5 = function3;
                                f17 = j00.f29452g;
                            } else {
                                nVar4 = nVar3;
                                i24 = i12;
                                a0Var4 = a0Var2;
                                z14 = z11;
                                kyVar4 = kyVar2;
                                f16 = f13;
                                function5 = function3;
                                f17 = f12;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                ky kyVarI2 = i0(c0VarR, (i12 >> 27) & 14);
                                i12 &= -57345;
                                kyVar2 = kyVarI2;
                            }
                            if ((i11 & 32) != 0) {
                                z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                                objI1 = c0VarR.i0();
                                if (z15) {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                } else {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                function3 = (Function2) objI1;
                                i12 = (-458753) & i12;
                            }
                            if (i17 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = e.f30155a;
                                    c0VarR.Y(objI0);
                                }
                                nVar3 = (pj.n) objI0;
                            } else {
                                nVar3 = nVar;
                            }
                            if (i19 != 0) {
                                f13 = j00.f29451f;
                            }
                            if (i21 != 0) {
                                nVar4 = nVar3;
                                i24 = i12;
                                a0Var4 = a0Var2;
                                z14 = z11;
                                kyVar4 = kyVar2;
                                f16 = f13;
                                function5 = function3;
                                f17 = j00.f29452g;
                            } else {
                                nVar4 = nVar3;
                                i24 = i12;
                                a0Var4 = a0Var2;
                                z14 = z11;
                                kyVar4 = kyVar2;
                                f16 = f13;
                                function5 = function3;
                                f17 = f12;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1952945688, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1785)");
                        }
                        R(btVar, f10, a0Var4, z14, kyVar4, function5, nVar4, f16, f17, c0VarR, i24 & 2147483646);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f15 = f17;
                        f14 = f16;
                        nVar2 = nVar4;
                        function4 = function5;
                        kyVar3 = kyVar4;
                        z13 = z14;
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        nVar2 = nVar;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        f14 = f13;
                        function4 = function3;
                        f15 = f12;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.fz
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.h0(this.f27774a, btVar, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                z11 = z10;
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        kyVar2 = kyVar;
                        if (c0VarR.D(kyVar2)) {
                        }
                        i12 |= i25;
                    } else {
                        kyVar2 = kyVar;
                    }
                    i12 |= i25;
                } else {
                    kyVar2 = kyVar;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        function3 = function2;
                        if (c0VarR.k0(function3)) {
                        }
                        i12 |= i26;
                    } else {
                        function3 = function2;
                    }
                    i12 |= i26;
                } else {
                    function3 = function2;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                    f13 = f11;
                } else {
                    f13 = f11;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.I(f13)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.I(f12)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i22;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(this)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i12 |= i23;
                    }
                    if ((306783379 & i12) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                ky kyVarI3 = i0(c0VarR, (i12 >> 27) & 14);
                                i12 &= -57345;
                                kyVar2 = kyVarI3;
                            }
                            if ((i11 & 32) != 0) {
                                z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                                objI1 = c0VarR.i0();
                                if (z15) {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                } else {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                function3 = (Function2) objI1;
                                i12 = (-458753) & i12;
                            }
                            if (i17 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = e.f30155a;
                                    c0VarR.Y(objI0);
                                }
                                nVar3 = (pj.n) objI0;
                            } else {
                                nVar3 = nVar;
                            }
                            if (i19 != 0) {
                                f13 = j00.f29451f;
                            }
                            if (i21 != 0) {
                                nVar4 = nVar3;
                                i24 = i12;
                                a0Var4 = a0Var2;
                                z14 = z11;
                                kyVar4 = kyVar2;
                                f16 = f13;
                                function5 = function3;
                                f17 = j00.f29452g;
                            } else {
                                nVar4 = nVar3;
                                i24 = i12;
                                a0Var4 = a0Var2;
                                z14 = z11;
                                kyVar4 = kyVar2;
                                f16 = f13;
                                function5 = function3;
                                f17 = f12;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                ky kyVarI4 = i0(c0VarR, (i12 >> 27) & 14);
                                i12 &= -57345;
                                kyVar2 = kyVarI4;
                            }
                            if ((i11 & 32) != 0) {
                                z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                                objI1 = c0VarR.i0();
                                if (z15) {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                } else {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                function3 = (Function2) objI1;
                                i12 = (-458753) & i12;
                            }
                            if (i17 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = e.f30155a;
                                    c0VarR.Y(objI0);
                                }
                                nVar3 = (pj.n) objI0;
                            } else {
                                nVar3 = nVar;
                            }
                            if (i19 != 0) {
                                f13 = j00.f29451f;
                            }
                            if (i21 != 0) {
                                nVar4 = nVar3;
                                i24 = i12;
                                a0Var4 = a0Var2;
                                z14 = z11;
                                kyVar4 = kyVar2;
                                f16 = f13;
                                function5 = function3;
                                f17 = j00.f29452g;
                            } else {
                                nVar4 = nVar3;
                                i24 = i12;
                                a0Var4 = a0Var2;
                                z14 = z11;
                                kyVar4 = kyVar2;
                                f16 = f13;
                                function5 = function3;
                                f17 = f12;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1952945688, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1785)");
                        }
                        R(btVar, f10, a0Var4, z14, kyVar4, function5, nVar4, f16, f17, c0VarR, i24 & 2147483646);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f15 = f17;
                        f14 = f16;
                        nVar2 = nVar4;
                        function4 = function5;
                        kyVar3 = kyVar4;
                        z13 = z14;
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        nVar2 = nVar;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        f14 = f13;
                        function4 = function3;
                        f15 = f12;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.fz
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.h0(this.f27774a, btVar, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(this)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i12 |= i23;
                }
                if ((306783379 & i12) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI5 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI5;
                        }
                        if ((i11 & 32) != 0) {
                            z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z15) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = e.f30155a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = j00.f29452g;
                        } else {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = f12;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI6 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI6;
                        }
                        if ((i11 & 32) != 0) {
                            z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z15) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = e.f30155a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = j00.f29452g;
                        } else {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = f12;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1952945688, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1785)");
                    }
                    R(btVar, f10, a0Var4, z14, kyVar4, function5, nVar4, f16, f17, c0VarR, i24 & 2147483646);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f15 = f17;
                    f14 = f16;
                    nVar2 = nVar4;
                    function4 = function5;
                    kyVar3 = kyVar4;
                    z13 = z14;
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    nVar2 = nVar;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    f14 = f13;
                    function4 = function3;
                    f15 = f12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.fz
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.h0(this.f27774a, btVar, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            a0Var2 = a0Var;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        kyVar2 = kyVar;
                        if (c0VarR.D(kyVar2)) {
                        }
                        i12 |= i25;
                    } else {
                        kyVar2 = kyVar;
                    }
                    i12 |= i25;
                } else {
                    kyVar2 = kyVar;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        function3 = function2;
                        if (c0VarR.k0(function3)) {
                        }
                        i12 |= i26;
                    } else {
                        function3 = function2;
                    }
                    i12 |= i26;
                } else {
                    function3 = function2;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                    f13 = f11;
                } else {
                    f13 = f11;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.I(f13)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.I(f12)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i22;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(this)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i12 |= i23;
                    }
                    if ((306783379 & i12) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                ky kyVarI7 = i0(c0VarR, (i12 >> 27) & 14);
                                i12 &= -57345;
                                kyVar2 = kyVarI7;
                            }
                            if ((i11 & 32) != 0) {
                                z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                                objI1 = c0VarR.i0();
                                if (z15) {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                } else {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                function3 = (Function2) objI1;
                                i12 = (-458753) & i12;
                            }
                            if (i17 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = e.f30155a;
                                    c0VarR.Y(objI0);
                                }
                                nVar3 = (pj.n) objI0;
                            } else {
                                nVar3 = nVar;
                            }
                            if (i19 != 0) {
                                f13 = j00.f29451f;
                            }
                            if (i21 != 0) {
                                nVar4 = nVar3;
                                i24 = i12;
                                a0Var4 = a0Var2;
                                z14 = z11;
                                kyVar4 = kyVar2;
                                f16 = f13;
                                function5 = function3;
                                f17 = j00.f29452g;
                            } else {
                                nVar4 = nVar3;
                                i24 = i12;
                                a0Var4 = a0Var2;
                                z14 = z11;
                                kyVar4 = kyVar2;
                                f16 = f13;
                                function5 = function3;
                                f17 = f12;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                ky kyVarI8 = i0(c0VarR, (i12 >> 27) & 14);
                                i12 &= -57345;
                                kyVar2 = kyVarI8;
                            }
                            if ((i11 & 32) != 0) {
                                z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                                objI1 = c0VarR.i0();
                                if (z15) {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                } else {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                function3 = (Function2) objI1;
                                i12 = (-458753) & i12;
                            }
                            if (i17 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = e.f30155a;
                                    c0VarR.Y(objI0);
                                }
                                nVar3 = (pj.n) objI0;
                            } else {
                                nVar3 = nVar;
                            }
                            if (i19 != 0) {
                                f13 = j00.f29451f;
                            }
                            if (i21 != 0) {
                                nVar4 = nVar3;
                                i24 = i12;
                                a0Var4 = a0Var2;
                                z14 = z11;
                                kyVar4 = kyVar2;
                                f16 = f13;
                                function5 = function3;
                                f17 = j00.f29452g;
                            } else {
                                nVar4 = nVar3;
                                i24 = i12;
                                a0Var4 = a0Var2;
                                z14 = z11;
                                kyVar4 = kyVar2;
                                f16 = f13;
                                function5 = function3;
                                f17 = f12;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1952945688, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1785)");
                        }
                        R(btVar, f10, a0Var4, z14, kyVar4, function5, nVar4, f16, f17, c0VarR, i24 & 2147483646);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f15 = f17;
                        f14 = f16;
                        nVar2 = nVar4;
                        function4 = function5;
                        kyVar3 = kyVar4;
                        z13 = z14;
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        nVar2 = nVar;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        f14 = f13;
                        function4 = function3;
                        f15 = f12;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.fz
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.h0(this.f27774a, btVar, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(this)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i12 |= i23;
                }
                if ((306783379 & i12) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI9 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI9;
                        }
                        if ((i11 & 32) != 0) {
                            z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z15) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = e.f30155a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = j00.f29452g;
                        } else {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = f12;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI10 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI10;
                        }
                        if ((i11 & 32) != 0) {
                            z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z15) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = e.f30155a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = j00.f29452g;
                        } else {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = f12;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1952945688, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1785)");
                    }
                    R(btVar, f10, a0Var4, z14, kyVar4, function5, nVar4, f16, f17, c0VarR, i24 & 2147483646);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f15 = f17;
                    f14 = f16;
                    nVar2 = nVar4;
                    function4 = function5;
                    kyVar3 = kyVar4;
                    z13 = z14;
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    nVar2 = nVar;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    f14 = f13;
                    function4 = function3;
                    f15 = f12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.fz
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.h0(this.f27774a, btVar, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z11 = z10;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    kyVar2 = kyVar;
                    if (c0VarR.D(kyVar2)) {
                    }
                    i12 |= i25;
                } else {
                    kyVar2 = kyVar;
                }
                i12 |= i25;
            } else {
                kyVar2 = kyVar;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                    }
                    i12 |= i26;
                } else {
                    function3 = function2;
                }
                i12 |= i26;
            } else {
                function3 = function2;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
                f13 = f11;
            } else {
                f13 = f11;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f13)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.I(f12)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i22;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(this)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i12 |= i23;
                }
                if ((306783379 & i12) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI11 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI11;
                        }
                        if ((i11 & 32) != 0) {
                            z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z15) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = e.f30155a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = j00.f29452g;
                        } else {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = f12;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI12 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI12;
                        }
                        if ((i11 & 32) != 0) {
                            z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z15) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = e.f30155a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = j00.f29452g;
                        } else {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = f12;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1952945688, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1785)");
                    }
                    R(btVar, f10, a0Var4, z14, kyVar4, function5, nVar4, f16, f17, c0VarR, i24 & 2147483646);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f15 = f17;
                    f14 = f16;
                    nVar2 = nVar4;
                    function4 = function5;
                    kyVar3 = kyVar4;
                    z13 = z14;
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    nVar2 = nVar;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    f14 = f13;
                    function4 = function3;
                    f15 = f12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.fz
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.h0(this.f27774a, btVar, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.D(this)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i12 |= i23;
            }
            if ((306783379 & i12) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        ky kyVarI13 = i0(c0VarR, (i12 >> 27) & 14);
                        i12 &= -57345;
                        kyVar2 = kyVarI13;
                    }
                    if ((i11 & 32) != 0) {
                        z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                        objI1 = c0VarR.i0();
                        if (z15) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-458753) & i12;
                    }
                    if (i17 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = e.f30155a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i19 != 0) {
                        f13 = j00.f29451f;
                    }
                    if (i21 != 0) {
                        nVar4 = nVar3;
                        i24 = i12;
                        a0Var4 = a0Var2;
                        z14 = z11;
                        kyVar4 = kyVar2;
                        f16 = f13;
                        function5 = function3;
                        f17 = j00.f29452g;
                    } else {
                        nVar4 = nVar3;
                        i24 = i12;
                        a0Var4 = a0Var2;
                        z14 = z11;
                        kyVar4 = kyVar2;
                        f16 = f13;
                        function5 = function3;
                        f17 = f12;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        ky kyVarI14 = i0(c0VarR, (i12 >> 27) & 14);
                        i12 &= -57345;
                        kyVar2 = kyVarI14;
                    }
                    if ((i11 & 32) != 0) {
                        z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                        objI1 = c0VarR.i0();
                        if (z15) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-458753) & i12;
                    }
                    if (i17 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = e.f30155a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i19 != 0) {
                        f13 = j00.f29451f;
                    }
                    if (i21 != 0) {
                        nVar4 = nVar3;
                        i24 = i12;
                        a0Var4 = a0Var2;
                        z14 = z11;
                        kyVar4 = kyVar2;
                        f16 = f13;
                        function5 = function3;
                        f17 = j00.f29452g;
                    } else {
                        nVar4 = nVar3;
                        i24 = i12;
                        a0Var4 = a0Var2;
                        z14 = z11;
                        kyVar4 = kyVar2;
                        f16 = f13;
                        function5 = function3;
                        f17 = f12;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1952945688, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1785)");
                }
                R(btVar, f10, a0Var4, z14, kyVar4, function5, nVar4, f16, f17, c0VarR, i24 & 2147483646);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f15 = f17;
                f14 = f16;
                nVar2 = nVar4;
                function4 = function5;
                kyVar3 = kyVar4;
                z13 = z14;
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                nVar2 = nVar;
                a0Var3 = a0Var2;
                z13 = z11;
                kyVar3 = kyVar2;
                f14 = f13;
                function4 = function3;
                f15 = f12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.fz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.h0(this.f27774a, btVar, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        kyVar2 = kyVar;
                        if (c0VarR.D(kyVar2)) {
                        }
                        i12 |= i25;
                    } else {
                        kyVar2 = kyVar;
                    }
                    i12 |= i25;
                } else {
                    kyVar2 = kyVar;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        function3 = function2;
                        if (c0VarR.k0(function3)) {
                        }
                        i12 |= i26;
                    } else {
                        function3 = function2;
                    }
                    i12 |= i26;
                } else {
                    function3 = function2;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                    f13 = f11;
                } else {
                    f13 = f11;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.I(f13)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.I(f12)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i22;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(this)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i12 |= i23;
                    }
                    if ((306783379 & i12) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                ky kyVarI15 = i0(c0VarR, (i12 >> 27) & 14);
                                i12 &= -57345;
                                kyVar2 = kyVarI15;
                            }
                            if ((i11 & 32) != 0) {
                                z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                                objI1 = c0VarR.i0();
                                if (z15) {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                } else {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                function3 = (Function2) objI1;
                                i12 = (-458753) & i12;
                            }
                            if (i17 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = e.f30155a;
                                    c0VarR.Y(objI0);
                                }
                                nVar3 = (pj.n) objI0;
                            } else {
                                nVar3 = nVar;
                            }
                            if (i19 != 0) {
                                f13 = j00.f29451f;
                            }
                            if (i21 != 0) {
                                nVar4 = nVar3;
                                i24 = i12;
                                a0Var4 = a0Var2;
                                z14 = z11;
                                kyVar4 = kyVar2;
                                f16 = f13;
                                function5 = function3;
                                f17 = j00.f29452g;
                            } else {
                                nVar4 = nVar3;
                                i24 = i12;
                                a0Var4 = a0Var2;
                                z14 = z11;
                                kyVar4 = kyVar2;
                                f16 = f13;
                                function5 = function3;
                                f17 = f12;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                ky kyVarI16 = i0(c0VarR, (i12 >> 27) & 14);
                                i12 &= -57345;
                                kyVar2 = kyVarI16;
                            }
                            if ((i11 & 32) != 0) {
                                z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                                objI1 = c0VarR.i0();
                                if (z15) {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                } else {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                function3 = (Function2) objI1;
                                i12 = (-458753) & i12;
                            }
                            if (i17 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = e.f30155a;
                                    c0VarR.Y(objI0);
                                }
                                nVar3 = (pj.n) objI0;
                            } else {
                                nVar3 = nVar;
                            }
                            if (i19 != 0) {
                                f13 = j00.f29451f;
                            }
                            if (i21 != 0) {
                                nVar4 = nVar3;
                                i24 = i12;
                                a0Var4 = a0Var2;
                                z14 = z11;
                                kyVar4 = kyVar2;
                                f16 = f13;
                                function5 = function3;
                                f17 = j00.f29452g;
                            } else {
                                nVar4 = nVar3;
                                i24 = i12;
                                a0Var4 = a0Var2;
                                z14 = z11;
                                kyVar4 = kyVar2;
                                f16 = f13;
                                function5 = function3;
                                f17 = f12;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1952945688, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1785)");
                        }
                        R(btVar, f10, a0Var4, z14, kyVar4, function5, nVar4, f16, f17, c0VarR, i24 & 2147483646);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f15 = f17;
                        f14 = f16;
                        nVar2 = nVar4;
                        function4 = function5;
                        kyVar3 = kyVar4;
                        z13 = z14;
                        a0Var3 = a0Var4;
                    } else {
                        c0VarR.u();
                        nVar2 = nVar;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        f14 = f13;
                        function4 = function3;
                        f15 = f12;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.fz
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.h0(this.f27774a, btVar, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(this)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i12 |= i23;
                }
                if ((306783379 & i12) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI17 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI17;
                        }
                        if ((i11 & 32) != 0) {
                            z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z15) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = e.f30155a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = j00.f29452g;
                        } else {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = f12;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI18 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI18;
                        }
                        if ((i11 & 32) != 0) {
                            z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z15) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = e.f30155a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = j00.f29452g;
                        } else {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = f12;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1952945688, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1785)");
                    }
                    R(btVar, f10, a0Var4, z14, kyVar4, function5, nVar4, f16, f17, c0VarR, i24 & 2147483646);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f15 = f17;
                    f14 = f16;
                    nVar2 = nVar4;
                    function4 = function5;
                    kyVar3 = kyVar4;
                    z13 = z14;
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    nVar2 = nVar;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    f14 = f13;
                    function4 = function3;
                    f15 = f12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.fz
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.h0(this.f27774a, btVar, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z11 = z10;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    kyVar2 = kyVar;
                    if (c0VarR.D(kyVar2)) {
                    }
                    i12 |= i25;
                } else {
                    kyVar2 = kyVar;
                }
                i12 |= i25;
            } else {
                kyVar2 = kyVar;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                    }
                    i12 |= i26;
                } else {
                    function3 = function2;
                }
                i12 |= i26;
            } else {
                function3 = function2;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
                f13 = f11;
            } else {
                f13 = f11;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f13)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.I(f12)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i22;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(this)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i12 |= i23;
                }
                if ((306783379 & i12) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI19 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI19;
                        }
                        if ((i11 & 32) != 0) {
                            z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z15) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = e.f30155a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = j00.f29452g;
                        } else {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = f12;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI110 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI110;
                        }
                        if ((i11 & 32) != 0) {
                            z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z15) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = e.f30155a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = j00.f29452g;
                        } else {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = f12;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1952945688, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1785)");
                    }
                    R(btVar, f10, a0Var4, z14, kyVar4, function5, nVar4, f16, f17, c0VarR, i24 & 2147483646);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f15 = f17;
                    f14 = f16;
                    nVar2 = nVar4;
                    function4 = function5;
                    kyVar3 = kyVar4;
                    z13 = z14;
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    nVar2 = nVar;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    f14 = f13;
                    function4 = function3;
                    f15 = f12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.fz
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.h0(this.f27774a, btVar, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.D(this)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i12 |= i23;
            }
            if ((306783379 & i12) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        ky kyVarI111 = i0(c0VarR, (i12 >> 27) & 14);
                        i12 &= -57345;
                        kyVar2 = kyVarI111;
                    }
                    if ((i11 & 32) != 0) {
                        z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                        objI1 = c0VarR.i0();
                        if (z15) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-458753) & i12;
                    }
                    if (i17 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = e.f30155a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i19 != 0) {
                        f13 = j00.f29451f;
                    }
                    if (i21 != 0) {
                        nVar4 = nVar3;
                        i24 = i12;
                        a0Var4 = a0Var2;
                        z14 = z11;
                        kyVar4 = kyVar2;
                        f16 = f13;
                        function5 = function3;
                        f17 = j00.f29452g;
                    } else {
                        nVar4 = nVar3;
                        i24 = i12;
                        a0Var4 = a0Var2;
                        z14 = z11;
                        kyVar4 = kyVar2;
                        f16 = f13;
                        function5 = function3;
                        f17 = f12;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        ky kyVarI112 = i0(c0VarR, (i12 >> 27) & 14);
                        i12 &= -57345;
                        kyVar2 = kyVarI112;
                    }
                    if ((i11 & 32) != 0) {
                        z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                        objI1 = c0VarR.i0();
                        if (z15) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-458753) & i12;
                    }
                    if (i17 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = e.f30155a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i19 != 0) {
                        f13 = j00.f29451f;
                    }
                    if (i21 != 0) {
                        nVar4 = nVar3;
                        i24 = i12;
                        a0Var4 = a0Var2;
                        z14 = z11;
                        kyVar4 = kyVar2;
                        f16 = f13;
                        function5 = function3;
                        f17 = j00.f29452g;
                    } else {
                        nVar4 = nVar3;
                        i24 = i12;
                        a0Var4 = a0Var2;
                        z14 = z11;
                        kyVar4 = kyVar2;
                        f16 = f13;
                        function5 = function3;
                        f17 = f12;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1952945688, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1785)");
                }
                R(btVar, f10, a0Var4, z14, kyVar4, function5, nVar4, f16, f17, c0VarR, i24 & 2147483646);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f15 = f17;
                f14 = f16;
                nVar2 = nVar4;
                function4 = function5;
                kyVar3 = kyVar4;
                z13 = z14;
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                nVar2 = nVar;
                a0Var3 = a0Var2;
                z13 = z11;
                kyVar3 = kyVar2;
                f14 = f13;
                function4 = function3;
                f15 = f12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.fz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.h0(this.f27774a, btVar, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    kyVar2 = kyVar;
                    if (c0VarR.D(kyVar2)) {
                    }
                    i12 |= i25;
                } else {
                    kyVar2 = kyVar;
                }
                i12 |= i25;
            } else {
                kyVar2 = kyVar;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                    }
                    i12 |= i26;
                } else {
                    function3 = function2;
                }
                i12 |= i26;
            } else {
                function3 = function2;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
                f13 = f11;
            } else {
                f13 = f11;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f13)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.I(f12)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i22;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(this)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i12 |= i23;
                }
                if ((306783379 & i12) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI113 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI113;
                        }
                        if ((i11 & 32) != 0) {
                            z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z15) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = e.f30155a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = j00.f29452g;
                        } else {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = f12;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI114 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI114;
                        }
                        if ((i11 & 32) != 0) {
                            z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z15) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = e.f30155a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = j00.f29452g;
                        } else {
                            nVar4 = nVar3;
                            i24 = i12;
                            a0Var4 = a0Var2;
                            z14 = z11;
                            kyVar4 = kyVar2;
                            f16 = f13;
                            function5 = function3;
                            f17 = f12;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1952945688, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1785)");
                    }
                    R(btVar, f10, a0Var4, z14, kyVar4, function5, nVar4, f16, f17, c0VarR, i24 & 2147483646);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f15 = f17;
                    f14 = f16;
                    nVar2 = nVar4;
                    function4 = function5;
                    kyVar3 = kyVar4;
                    z13 = z14;
                    a0Var3 = a0Var4;
                } else {
                    c0VarR.u();
                    nVar2 = nVar;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    f14 = f13;
                    function4 = function3;
                    f15 = f12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.fz
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.h0(this.f27774a, btVar, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.D(this)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i12 |= i23;
            }
            if ((306783379 & i12) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        ky kyVarI115 = i0(c0VarR, (i12 >> 27) & 14);
                        i12 &= -57345;
                        kyVar2 = kyVarI115;
                    }
                    if ((i11 & 32) != 0) {
                        z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                        objI1 = c0VarR.i0();
                        if (z15) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-458753) & i12;
                    }
                    if (i17 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = e.f30155a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i19 != 0) {
                        f13 = j00.f29451f;
                    }
                    if (i21 != 0) {
                        nVar4 = nVar3;
                        i24 = i12;
                        a0Var4 = a0Var2;
                        z14 = z11;
                        kyVar4 = kyVar2;
                        f16 = f13;
                        function5 = function3;
                        f17 = j00.f29452g;
                    } else {
                        nVar4 = nVar3;
                        i24 = i12;
                        a0Var4 = a0Var2;
                        z14 = z11;
                        kyVar4 = kyVar2;
                        f16 = f13;
                        function5 = function3;
                        f17 = f12;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        ky kyVarI116 = i0(c0VarR, (i12 >> 27) & 14);
                        i12 &= -57345;
                        kyVar2 = kyVarI116;
                    }
                    if ((i11 & 32) != 0) {
                        z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                        objI1 = c0VarR.i0();
                        if (z15) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-458753) & i12;
                    }
                    if (i17 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = e.f30155a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i19 != 0) {
                        f13 = j00.f29451f;
                    }
                    if (i21 != 0) {
                        nVar4 = nVar3;
                        i24 = i12;
                        a0Var4 = a0Var2;
                        z14 = z11;
                        kyVar4 = kyVar2;
                        f16 = f13;
                        function5 = function3;
                        f17 = j00.f29452g;
                    } else {
                        nVar4 = nVar3;
                        i24 = i12;
                        a0Var4 = a0Var2;
                        z14 = z11;
                        kyVar4 = kyVar2;
                        f16 = f13;
                        function5 = function3;
                        f17 = f12;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1952945688, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1785)");
                }
                R(btVar, f10, a0Var4, z14, kyVar4, function5, nVar4, f16, f17, c0VarR, i24 & 2147483646);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f15 = f17;
                f14 = f16;
                nVar2 = nVar4;
                function4 = function5;
                kyVar3 = kyVar4;
                z13 = z14;
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                nVar2 = nVar;
                a0Var3 = a0Var2;
                z13 = z11;
                kyVar3 = kyVar2;
                f14 = f13;
                function4 = function3;
                f15 = f12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.fz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.h0(this.f27774a, btVar, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z11 = z10;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                kyVar2 = kyVar;
                if (c0VarR.D(kyVar2)) {
                }
                i12 |= i25;
            } else {
                kyVar2 = kyVar;
            }
            i12 |= i25;
        } else {
            kyVar2 = kyVar;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                function3 = function2;
                if (c0VarR.k0(function3)) {
                }
                i12 |= i26;
            } else {
                function3 = function2;
            }
            i12 |= i26;
        } else {
            function3 = function2;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0VarR.k0(nVar)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i12 |= i18;
        }
        i19 = i11 & 128;
        if (i19 != 0) {
            i12 |= 12582912;
            f13 = f11;
        } else {
            f13 = f11;
            if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f13)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
        }
        i21 = i11 & 256;
        if (i21 != 0) {
            if ((i10 & 100663296) == 0) {
                if (c0VarR.I(f12)) {
                    i22 = 67108864;
                } else {
                    i22 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i22;
            }
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.D(this)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i12 |= i23;
            }
            if ((306783379 & i12) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        ky kyVarI117 = i0(c0VarR, (i12 >> 27) & 14);
                        i12 &= -57345;
                        kyVar2 = kyVarI117;
                    }
                    if ((i11 & 32) != 0) {
                        z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                        objI1 = c0VarR.i0();
                        if (z15) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-458753) & i12;
                    }
                    if (i17 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = e.f30155a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i19 != 0) {
                        f13 = j00.f29451f;
                    }
                    if (i21 != 0) {
                        nVar4 = nVar3;
                        i24 = i12;
                        a0Var4 = a0Var2;
                        z14 = z11;
                        kyVar4 = kyVar2;
                        f16 = f13;
                        function5 = function3;
                        f17 = j00.f29452g;
                    } else {
                        nVar4 = nVar3;
                        i24 = i12;
                        a0Var4 = a0Var2;
                        z14 = z11;
                        kyVar4 = kyVar2;
                        f16 = f13;
                        function5 = function3;
                        f17 = f12;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        ky kyVarI118 = i0(c0VarR, (i12 >> 27) & 14);
                        i12 &= -57345;
                        kyVar2 = kyVarI118;
                    }
                    if ((i11 & 32) != 0) {
                        z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                        objI1 = c0VarR.i0();
                        if (z15) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ez
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-458753) & i12;
                    }
                    if (i17 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = e.f30155a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i19 != 0) {
                        f13 = j00.f29451f;
                    }
                    if (i21 != 0) {
                        nVar4 = nVar3;
                        i24 = i12;
                        a0Var4 = a0Var2;
                        z14 = z11;
                        kyVar4 = kyVar2;
                        f16 = f13;
                        function5 = function3;
                        f17 = j00.f29452g;
                    } else {
                        nVar4 = nVar3;
                        i24 = i12;
                        a0Var4 = a0Var2;
                        z14 = z11;
                        kyVar4 = kyVar2;
                        f16 = f13;
                        function5 = function3;
                        f17 = f12;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1952945688, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1785)");
                }
                R(btVar, f10, a0Var4, z14, kyVar4, function5, nVar4, f16, f17, c0VarR, i24 & 2147483646);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f15 = f17;
                f14 = f16;
                nVar2 = nVar4;
                function4 = function5;
                kyVar3 = kyVar4;
                z13 = z14;
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                nVar2 = nVar;
                a0Var3 = a0Var2;
                z13 = z11;
                kyVar3 = kyVar2;
                f14 = f13;
                function4 = function3;
                f15 = f12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.fz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.h0(this.f27774a, btVar, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 100663296;
        if ((i11 & 512) != 0) {
            i12 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            if (c0VarR.D(this)) {
                i23 = 536870912;
            } else {
                i23 = 268435456;
            }
            i12 |= i23;
        }
        if ((306783379 & i12) != 306783378) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i15 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    ky kyVarI119 = i0(c0VarR, (i12 >> 27) & 14);
                    i12 &= -57345;
                    kyVar2 = kyVarI119;
                }
                if ((i11 & 32) != 0) {
                    z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                    objI1 = c0VarR.i0();
                    if (z15) {
                        objI1 = new Function2() { // from class: androidx.compose.material3.ez
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function2() { // from class: androidx.compose.material3.ez
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    function3 = (Function2) objI1;
                    i12 = (-458753) & i12;
                }
                if (i17 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = e.f30155a;
                        c0VarR.Y(objI0);
                    }
                    nVar3 = (pj.n) objI0;
                } else {
                    nVar3 = nVar;
                }
                if (i19 != 0) {
                    f13 = j00.f29451f;
                }
                if (i21 != 0) {
                    nVar4 = nVar3;
                    i24 = i12;
                    a0Var4 = a0Var2;
                    z14 = z11;
                    kyVar4 = kyVar2;
                    f16 = f13;
                    function5 = function3;
                    f17 = j00.f29452g;
                } else {
                    nVar4 = nVar3;
                    i24 = i12;
                    a0Var4 = a0Var2;
                    z14 = z11;
                    kyVar4 = kyVar2;
                    f16 = f13;
                    function5 = function3;
                    f17 = f12;
                }
            } else {
                if (i13 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i15 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    ky kyVarI1110 = i0(c0VarR, (i12 >> 27) & 14);
                    i12 &= -57345;
                    kyVar2 = kyVarI1110;
                }
                if ((i11 & 32) != 0) {
                    z15 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                    objI1 = c0VarR.i0();
                    if (z15) {
                        objI1 = new Function2() { // from class: androidx.compose.material3.ez
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function2() { // from class: androidx.compose.material3.ez
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.g0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    function3 = (Function2) objI1;
                    i12 = (-458753) & i12;
                }
                if (i17 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = e.f30155a;
                        c0VarR.Y(objI0);
                    }
                    nVar3 = (pj.n) objI0;
                } else {
                    nVar3 = nVar;
                }
                if (i19 != 0) {
                    f13 = j00.f29451f;
                }
                if (i21 != 0) {
                    nVar4 = nVar3;
                    i24 = i12;
                    a0Var4 = a0Var2;
                    z14 = z11;
                    kyVar4 = kyVar2;
                    f16 = f13;
                    function5 = function3;
                    f17 = j00.f29452g;
                } else {
                    nVar4 = nVar3;
                    i24 = i12;
                    a0Var4 = a0Var2;
                    z14 = z11;
                    kyVar4 = kyVar2;
                    f16 = f13;
                    function5 = function3;
                    f17 = f12;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1952945688, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1785)");
            }
            R(btVar, f10, a0Var4, z14, kyVar4, function5, nVar4, f16, f17, c0VarR, i24 & 2147483646);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            f15 = f17;
            f14 = f16;
            nVar2 = nVar4;
            function4 = function5;
            kyVar3 = kyVar4;
            z13 = z14;
            a0Var3 = a0Var4;
        } else {
            c0VarR.u();
            nVar2 = nVar;
            a0Var3 = a0Var2;
            z13 = z11;
            kyVar3 = kyVar2;
            f14 = f13;
            function4 = function3;
            f15 = f12;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.fz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return kz.h0(this.f27774a, btVar, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0132  */
    /* JADX WARN: Code duplicated, block: B:104:0x0136  */
    /* JADX WARN: Code duplicated, block: B:106:0x013c  */
    /* JADX WARN: Code duplicated, block: B:107:0x013f  */
    /* JADX WARN: Code duplicated, block: B:111:0x014f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0154  */
    /* JADX WARN: Code duplicated, block: B:115:0x015e  */
    /* JADX WARN: Code duplicated, block: B:117:0x016b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0182 A[PHI: r1 r4 r7 r10 r11 r13 r14
      0x0182: PHI (r1v38 pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, kotlin.Unit>) = 
      (r1v13 pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, kotlin.Unit>)
      (r1v42 pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, kotlin.Unit>)
     binds: [B:163:0x020a, B:126:0x0180] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r4v33 int) = (r4v26 int), (r4v35 int) binds: [B:163:0x020a, B:126:0x0180] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r7v12 androidx.compose.ui.a0) = (r7v5 androidx.compose.ui.a0), (r7v2 androidx.compose.ui.a0) binds: [B:163:0x020a, B:126:0x0180] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r10v21 boolean) = (r10v5 boolean), (r10v2 boolean) binds: [B:163:0x020a, B:126:0x0180] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r11v27 androidx.compose.material3.ky) = (r11v8 androidx.compose.material3.ky), (r11v6 androidx.compose.material3.ky) binds: [B:163:0x020a, B:126:0x0180] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r13v8 float) = (r13v3 float), (r13v1 float) binds: [B:163:0x020a, B:126:0x0180] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r14v9 kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, kotlin.Unit>) = 
      (r14v5 kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, kotlin.Unit>)
      (r14v4 kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, kotlin.Unit>)
     binds: [B:163:0x020a, B:126:0x0180] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:129:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x018e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0194  */
    /* JADX WARN: Code duplicated, block: B:135:0x019a  */
    /* JADX WARN: Code duplicated, block: B:138:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:153:0x01db  */
    /* JADX WARN: Code duplicated, block: B:156:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:158:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:160:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:162:0x0205  */
    /* JADX WARN: Code duplicated, block: B:164:0x020c  */
    /* JADX WARN: Code duplicated, block: B:167:0x021c  */
    /* JADX WARN: Code duplicated, block: B:170:0x0264  */
    /* JADX WARN: Code duplicated, block: B:172:0x0272  */
    /* JADX WARN: Code duplicated, block: B:175:0x0286  */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:90:0x0109  */
    /* JADX WARN: Code duplicated, block: B:92:0x0112  */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    /* JADX WARN: Code duplicated, block: B:96:0x0122  */
    /* JADX WARN: Code duplicated, block: B:97:0x0125  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void P(@NotNull final t00 t00Var, final float f10, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable ky kyVar, @Nullable Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function2, @Nullable pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar, float f11, float f12, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        t00 t00Var2;
        int i12;
        int i13;
        androidx.compose.ui.a0 a0Var2;
        int i14;
        int i15;
        final boolean z11;
        int i16;
        final ky kyVar2;
        Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function3;
        int i17;
        int i18;
        int i19;
        float f13;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z12;
        final pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final ky kyVar3;
        final float f14;
        final Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function4;
        final float f15;
        androidx.compose.runtime.s5 s5VarT;
        pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar3;
        float f16;
        Object objI0;
        boolean z14;
        Object objI1;
        int i24;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1691224881);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            t00Var2 = t00Var;
        } else if ((i10 & 6) == 0) {
            t00Var2 = t00Var;
            i12 = (c0VarR.k0(t00Var2) ? 4 : 2) | i10;
        } else {
            t00Var2 = t00Var;
            i12 = i10;
        }
        if ((i11 & 2) == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.I(f10) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        z11 = z10;
                        if (c0VarR.G(z11)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 24576) == 0) {
                        if ((i11 & 16) == 0) {
                            kyVar2 = kyVar;
                            int i25 = c0VarR.D(kyVar2) ? 16384 : 8192;
                            i12 |= i25;
                        } else {
                            kyVar2 = kyVar;
                        }
                        i12 |= i25;
                    } else {
                        kyVar2 = kyVar;
                    }
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            function3 = function2;
                            int i26 = c0VarR.k0(function3) ? 131072 : 65536;
                            i12 |= i26;
                        } else {
                            function3 = function2;
                        }
                        i12 |= i26;
                    } else {
                        function3 = function2;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                        f13 = f11;
                    } else {
                        f13 = f11;
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.I(f13)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                            i12 |= i20;
                        }
                    }
                    i21 = i11 & 256;
                    if (i21 != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.I(f12)) {
                                i22 = 67108864;
                            } else {
                                i22 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i12 |= i22;
                        }
                        if ((i11 & 512) != 0) {
                            i12 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.D(this)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i12 |= i23;
                        }
                        if ((306783379 & i12) != 306783378) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z11 = true;
                                }
                                if ((i11 & 16) != 0) {
                                    ky kyVarI0 = i0(c0VarR, (i12 >> 27) & 14);
                                    i12 &= -57345;
                                    kyVar2 = kyVarI0;
                                }
                                if ((i11 & 32) != 0) {
                                    z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                                    objI1 = c0VarR.i0();
                                    if (z14 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                            }
                                        };
                                        c0VarR.Y(objI1);
                                    }
                                    function3 = (Function2) objI1;
                                    i12 = (-458753) & i12;
                                }
                                if (i17 != 0) {
                                    objI0 = c0VarR.i0();
                                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                        objI0 = g.f30157a;
                                        c0VarR.Y(objI0);
                                    }
                                    nVar3 = (pj.n) objI0;
                                } else {
                                    nVar3 = nVar;
                                }
                                if (i19 != 0) {
                                    f13 = j00.f29451f;
                                }
                                if (i21 != 0) {
                                    f16 = j00.f29452g;
                                }
                                i24 = i12;
                                boolean z15 = z11;
                                ky kyVar4 = kyVar2;
                                float f17 = f13;
                                Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function5 = function3;
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(1691224881, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1502)");
                                }
                                int i27 = (i24 & 14) | 805306368 | (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24);
                                int i28 = ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6;
                                androidx.compose.ui.a0 a0Var4 = a0Var2;
                                pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar4 = nVar3;
                                Q(t00Var2, f10, a0Var4, z15, kyVar4, function5, nVar4, f17, f16, true, false, c0VarR, i27, i28);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                f15 = f16;
                                f14 = f17;
                                nVar2 = nVar4;
                                function4 = function5;
                                kyVar3 = kyVar4;
                                z13 = z15;
                                a0Var3 = a0Var4;
                            } else {
                                c0VarR.u();
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                nVar3 = nVar;
                            }
                            f16 = f12;
                            i24 = i12;
                            boolean z16 = z11;
                            ky kyVar5 = kyVar2;
                            float f18 = f13;
                            Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function6 = function3;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1691224881, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1502)");
                            }
                            int i29 = (i24 & 14) | 805306368 | (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24);
                            int i210 = ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6;
                            androidx.compose.ui.a0 a0Var5 = a0Var2;
                            pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar5 = nVar3;
                            Q(t00Var2, f10, a0Var5, z16, kyVar5, function6, nVar5, f18, f16, true, false, c0VarR, i29, i210);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            f15 = f16;
                            f14 = f18;
                            nVar2 = nVar5;
                            function4 = function6;
                            kyVar3 = kyVar5;
                            z13 = z16;
                            a0Var3 = a0Var5;
                        } else {
                            c0VarR.u();
                            nVar2 = nVar;
                            a0Var3 = a0Var2;
                            z13 = z11;
                            kyVar3 = kyVar2;
                            f14 = f13;
                            function4 = function3;
                            f15 = f12;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.sy
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.f0(this.f32994a, t00Var, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 100663296;
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(this)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i12 |= i23;
                    }
                    if ((306783379 & i12) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                ky kyVarI1 = i0(c0VarR, (i12 >> 27) & 14);
                                i12 &= -57345;
                                kyVar2 = kyVarI1;
                            }
                            if ((i11 & 32) != 0) {
                                z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                                objI1 = c0VarR.i0();
                                if (z14) {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                } else {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                function3 = (Function2) objI1;
                                i12 = (-458753) & i12;
                            }
                            if (i17 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = g.f30157a;
                                    c0VarR.Y(objI0);
                                }
                                nVar3 = (pj.n) objI0;
                            } else {
                                nVar3 = nVar;
                            }
                            if (i19 != 0) {
                                f13 = j00.f29451f;
                            }
                            if (i21 != 0) {
                                f16 = j00.f29452g;
                            } else {
                                f16 = f12;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                ky kyVarI2 = i0(c0VarR, (i12 >> 27) & 14);
                                i12 &= -57345;
                                kyVar2 = kyVarI2;
                            }
                            if ((i11 & 32) != 0) {
                                z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                                objI1 = c0VarR.i0();
                                if (z14) {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                } else {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                function3 = (Function2) objI1;
                                i12 = (-458753) & i12;
                            }
                            if (i17 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = g.f30157a;
                                    c0VarR.Y(objI0);
                                }
                                nVar3 = (pj.n) objI0;
                            } else {
                                nVar3 = nVar;
                            }
                            if (i19 != 0) {
                                f13 = j00.f29451f;
                            }
                            if (i21 != 0) {
                                f16 = j00.f29452g;
                            } else {
                                f16 = f12;
                            }
                        }
                        i24 = i12;
                        boolean z17 = z11;
                        ky kyVar6 = kyVar2;
                        float f19 = f13;
                        Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function7 = function3;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1691224881, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1502)");
                        }
                        int i211 = (i24 & 14) | 805306368 | (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24);
                        int i212 = ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6;
                        androidx.compose.ui.a0 a0Var6 = a0Var2;
                        pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar6 = nVar3;
                        Q(t00Var2, f10, a0Var6, z17, kyVar6, function7, nVar6, f19, f16, true, false, c0VarR, i211, i212);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f15 = f16;
                        f14 = f19;
                        nVar2 = nVar6;
                        function4 = function7;
                        kyVar3 = kyVar6;
                        z13 = z17;
                        a0Var3 = a0Var6;
                    } else {
                        c0VarR.u();
                        nVar2 = nVar;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        f14 = f13;
                        function4 = function3;
                        f15 = f12;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.sy
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.f0(this.f32994a, t00Var, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                z11 = z10;
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        kyVar2 = kyVar;
                        if (c0VarR.D(kyVar2)) {
                        }
                        i12 |= i25;
                    } else {
                        kyVar2 = kyVar;
                    }
                    i12 |= i25;
                } else {
                    kyVar2 = kyVar;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        function3 = function2;
                        if (c0VarR.k0(function3)) {
                        }
                        i12 |= i26;
                    } else {
                        function3 = function2;
                    }
                    i12 |= i26;
                } else {
                    function3 = function2;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                    f13 = f11;
                } else {
                    f13 = f11;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.I(f13)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.I(f12)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i22;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(this)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i12 |= i23;
                    }
                    if ((306783379 & i12) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                ky kyVarI3 = i0(c0VarR, (i12 >> 27) & 14);
                                i12 &= -57345;
                                kyVar2 = kyVarI3;
                            }
                            if ((i11 & 32) != 0) {
                                z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                                objI1 = c0VarR.i0();
                                if (z14) {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                } else {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                function3 = (Function2) objI1;
                                i12 = (-458753) & i12;
                            }
                            if (i17 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = g.f30157a;
                                    c0VarR.Y(objI0);
                                }
                                nVar3 = (pj.n) objI0;
                            } else {
                                nVar3 = nVar;
                            }
                            if (i19 != 0) {
                                f13 = j00.f29451f;
                            }
                            if (i21 != 0) {
                                f16 = j00.f29452g;
                            } else {
                                f16 = f12;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                ky kyVarI4 = i0(c0VarR, (i12 >> 27) & 14);
                                i12 &= -57345;
                                kyVar2 = kyVarI4;
                            }
                            if ((i11 & 32) != 0) {
                                z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                                objI1 = c0VarR.i0();
                                if (z14) {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                } else {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                function3 = (Function2) objI1;
                                i12 = (-458753) & i12;
                            }
                            if (i17 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = g.f30157a;
                                    c0VarR.Y(objI0);
                                }
                                nVar3 = (pj.n) objI0;
                            } else {
                                nVar3 = nVar;
                            }
                            if (i19 != 0) {
                                f13 = j00.f29451f;
                            }
                            if (i21 != 0) {
                                f16 = j00.f29452g;
                            } else {
                                f16 = f12;
                            }
                        }
                        i24 = i12;
                        boolean z18 = z11;
                        ky kyVar7 = kyVar2;
                        float f110 = f13;
                        Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function8 = function3;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1691224881, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1502)");
                        }
                        int i213 = (i24 & 14) | 805306368 | (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24);
                        int i214 = ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6;
                        androidx.compose.ui.a0 a0Var7 = a0Var2;
                        pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar7 = nVar3;
                        Q(t00Var2, f10, a0Var7, z18, kyVar7, function8, nVar7, f110, f16, true, false, c0VarR, i213, i214);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f15 = f16;
                        f14 = f110;
                        nVar2 = nVar7;
                        function4 = function8;
                        kyVar3 = kyVar7;
                        z13 = z18;
                        a0Var3 = a0Var7;
                    } else {
                        c0VarR.u();
                        nVar2 = nVar;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        f14 = f13;
                        function4 = function3;
                        f15 = f12;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.sy
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.f0(this.f32994a, t00Var, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(this)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i12 |= i23;
                }
                if ((306783379 & i12) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI5 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI5;
                        }
                        if ((i11 & 32) != 0) {
                            z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z14) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = g.f30157a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            f16 = j00.f29452g;
                        } else {
                            f16 = f12;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI6 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI6;
                        }
                        if ((i11 & 32) != 0) {
                            z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z14) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = g.f30157a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            f16 = j00.f29452g;
                        } else {
                            f16 = f12;
                        }
                    }
                    i24 = i12;
                    boolean z19 = z11;
                    ky kyVar8 = kyVar2;
                    float f111 = f13;
                    Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function9 = function3;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1691224881, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1502)");
                    }
                    int i215 = (i24 & 14) | 805306368 | (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24);
                    int i216 = ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6;
                    androidx.compose.ui.a0 a0Var8 = a0Var2;
                    pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar8 = nVar3;
                    Q(t00Var2, f10, a0Var8, z19, kyVar8, function9, nVar8, f111, f16, true, false, c0VarR, i215, i216);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f15 = f16;
                    f14 = f111;
                    nVar2 = nVar8;
                    function4 = function9;
                    kyVar3 = kyVar8;
                    z13 = z19;
                    a0Var3 = a0Var8;
                } else {
                    c0VarR.u();
                    nVar2 = nVar;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    f14 = f13;
                    function4 = function3;
                    f15 = f12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.sy
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.f0(this.f32994a, t00Var, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            a0Var2 = a0Var;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        kyVar2 = kyVar;
                        if (c0VarR.D(kyVar2)) {
                        }
                        i12 |= i25;
                    } else {
                        kyVar2 = kyVar;
                    }
                    i12 |= i25;
                } else {
                    kyVar2 = kyVar;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        function3 = function2;
                        if (c0VarR.k0(function3)) {
                        }
                        i12 |= i26;
                    } else {
                        function3 = function2;
                    }
                    i12 |= i26;
                } else {
                    function3 = function2;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                    f13 = f11;
                } else {
                    f13 = f11;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.I(f13)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.I(f12)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i22;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(this)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i12 |= i23;
                    }
                    if ((306783379 & i12) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                ky kyVarI7 = i0(c0VarR, (i12 >> 27) & 14);
                                i12 &= -57345;
                                kyVar2 = kyVarI7;
                            }
                            if ((i11 & 32) != 0) {
                                z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                                objI1 = c0VarR.i0();
                                if (z14) {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                } else {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                function3 = (Function2) objI1;
                                i12 = (-458753) & i12;
                            }
                            if (i17 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = g.f30157a;
                                    c0VarR.Y(objI0);
                                }
                                nVar3 = (pj.n) objI0;
                            } else {
                                nVar3 = nVar;
                            }
                            if (i19 != 0) {
                                f13 = j00.f29451f;
                            }
                            if (i21 != 0) {
                                f16 = j00.f29452g;
                            } else {
                                f16 = f12;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                ky kyVarI8 = i0(c0VarR, (i12 >> 27) & 14);
                                i12 &= -57345;
                                kyVar2 = kyVarI8;
                            }
                            if ((i11 & 32) != 0) {
                                z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                                objI1 = c0VarR.i0();
                                if (z14) {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                } else {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                function3 = (Function2) objI1;
                                i12 = (-458753) & i12;
                            }
                            if (i17 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = g.f30157a;
                                    c0VarR.Y(objI0);
                                }
                                nVar3 = (pj.n) objI0;
                            } else {
                                nVar3 = nVar;
                            }
                            if (i19 != 0) {
                                f13 = j00.f29451f;
                            }
                            if (i21 != 0) {
                                f16 = j00.f29452g;
                            } else {
                                f16 = f12;
                            }
                        }
                        i24 = i12;
                        boolean z110 = z11;
                        ky kyVar9 = kyVar2;
                        float f112 = f13;
                        Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function10 = function3;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1691224881, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1502)");
                        }
                        int i217 = (i24 & 14) | 805306368 | (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24);
                        int i218 = ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6;
                        androidx.compose.ui.a0 a0Var9 = a0Var2;
                        pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar9 = nVar3;
                        Q(t00Var2, f10, a0Var9, z110, kyVar9, function10, nVar9, f112, f16, true, false, c0VarR, i217, i218);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f15 = f16;
                        f14 = f112;
                        nVar2 = nVar9;
                        function4 = function10;
                        kyVar3 = kyVar9;
                        z13 = z110;
                        a0Var3 = a0Var9;
                    } else {
                        c0VarR.u();
                        nVar2 = nVar;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        f14 = f13;
                        function4 = function3;
                        f15 = f12;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.sy
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.f0(this.f32994a, t00Var, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(this)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i12 |= i23;
                }
                if ((306783379 & i12) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI9 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI9;
                        }
                        if ((i11 & 32) != 0) {
                            z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z14) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = g.f30157a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            f16 = j00.f29452g;
                        } else {
                            f16 = f12;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI10 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI10;
                        }
                        if ((i11 & 32) != 0) {
                            z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z14) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = g.f30157a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            f16 = j00.f29452g;
                        } else {
                            f16 = f12;
                        }
                    }
                    i24 = i12;
                    boolean z111 = z11;
                    ky kyVar10 = kyVar2;
                    float f113 = f13;
                    Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function11 = function3;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1691224881, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1502)");
                    }
                    int i219 = (i24 & 14) | 805306368 | (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24);
                    int i2110 = ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6;
                    androidx.compose.ui.a0 a0Var10 = a0Var2;
                    pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar10 = nVar3;
                    Q(t00Var2, f10, a0Var10, z111, kyVar10, function11, nVar10, f113, f16, true, false, c0VarR, i219, i2110);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f15 = f16;
                    f14 = f113;
                    nVar2 = nVar10;
                    function4 = function11;
                    kyVar3 = kyVar10;
                    z13 = z111;
                    a0Var3 = a0Var10;
                } else {
                    c0VarR.u();
                    nVar2 = nVar;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    f14 = f13;
                    function4 = function3;
                    f15 = f12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.sy
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.f0(this.f32994a, t00Var, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z11 = z10;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    kyVar2 = kyVar;
                    if (c0VarR.D(kyVar2)) {
                    }
                    i12 |= i25;
                } else {
                    kyVar2 = kyVar;
                }
                i12 |= i25;
            } else {
                kyVar2 = kyVar;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                    }
                    i12 |= i26;
                } else {
                    function3 = function2;
                }
                i12 |= i26;
            } else {
                function3 = function2;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
                f13 = f11;
            } else {
                f13 = f11;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f13)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.I(f12)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i22;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(this)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i12 |= i23;
                }
                if ((306783379 & i12) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI11 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI11;
                        }
                        if ((i11 & 32) != 0) {
                            z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z14) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = g.f30157a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            f16 = j00.f29452g;
                        } else {
                            f16 = f12;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI12 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI12;
                        }
                        if ((i11 & 32) != 0) {
                            z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z14) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = g.f30157a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            f16 = j00.f29452g;
                        } else {
                            f16 = f12;
                        }
                    }
                    i24 = i12;
                    boolean z112 = z11;
                    ky kyVar11 = kyVar2;
                    float f114 = f13;
                    Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function12 = function3;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1691224881, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1502)");
                    }
                    int i2111 = (i24 & 14) | 805306368 | (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24);
                    int i2112 = ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6;
                    androidx.compose.ui.a0 a0Var11 = a0Var2;
                    pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar11 = nVar3;
                    Q(t00Var2, f10, a0Var11, z112, kyVar11, function12, nVar11, f114, f16, true, false, c0VarR, i2111, i2112);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f15 = f16;
                    f14 = f114;
                    nVar2 = nVar11;
                    function4 = function12;
                    kyVar3 = kyVar11;
                    z13 = z112;
                    a0Var3 = a0Var11;
                } else {
                    c0VarR.u();
                    nVar2 = nVar;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    f14 = f13;
                    function4 = function3;
                    f15 = f12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.sy
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.f0(this.f32994a, t00Var, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.D(this)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i12 |= i23;
            }
            if ((306783379 & i12) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        ky kyVarI13 = i0(c0VarR, (i12 >> 27) & 14);
                        i12 &= -57345;
                        kyVar2 = kyVarI13;
                    }
                    if ((i11 & 32) != 0) {
                        z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-458753) & i12;
                    }
                    if (i17 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = g.f30157a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i19 != 0) {
                        f13 = j00.f29451f;
                    }
                    if (i21 != 0) {
                        f16 = j00.f29452g;
                    } else {
                        f16 = f12;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        ky kyVarI14 = i0(c0VarR, (i12 >> 27) & 14);
                        i12 &= -57345;
                        kyVar2 = kyVarI14;
                    }
                    if ((i11 & 32) != 0) {
                        z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-458753) & i12;
                    }
                    if (i17 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = g.f30157a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i19 != 0) {
                        f13 = j00.f29451f;
                    }
                    if (i21 != 0) {
                        f16 = j00.f29452g;
                    } else {
                        f16 = f12;
                    }
                }
                i24 = i12;
                boolean z113 = z11;
                ky kyVar12 = kyVar2;
                float f115 = f13;
                Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function13 = function3;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1691224881, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1502)");
                }
                int i2113 = (i24 & 14) | 805306368 | (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24);
                int i2114 = ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6;
                androidx.compose.ui.a0 a0Var12 = a0Var2;
                pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar12 = nVar3;
                Q(t00Var2, f10, a0Var12, z113, kyVar12, function13, nVar12, f115, f16, true, false, c0VarR, i2113, i2114);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f15 = f16;
                f14 = f115;
                nVar2 = nVar12;
                function4 = function13;
                kyVar3 = kyVar12;
                z13 = z113;
                a0Var3 = a0Var12;
            } else {
                c0VarR.u();
                nVar2 = nVar;
                a0Var3 = a0Var2;
                z13 = z11;
                kyVar3 = kyVar2;
                f14 = f13;
                function4 = function3;
                f15 = f12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.sy
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.f0(this.f32994a, t00Var, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        kyVar2 = kyVar;
                        if (c0VarR.D(kyVar2)) {
                        }
                        i12 |= i25;
                    } else {
                        kyVar2 = kyVar;
                    }
                    i12 |= i25;
                } else {
                    kyVar2 = kyVar;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        function3 = function2;
                        if (c0VarR.k0(function3)) {
                        }
                        i12 |= i26;
                    } else {
                        function3 = function2;
                    }
                    i12 |= i26;
                } else {
                    function3 = function2;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                    f13 = f11;
                } else {
                    f13 = f11;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.I(f13)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.I(f12)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i22;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(this)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i12 |= i23;
                    }
                    if ((306783379 & i12) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                ky kyVarI15 = i0(c0VarR, (i12 >> 27) & 14);
                                i12 &= -57345;
                                kyVar2 = kyVarI15;
                            }
                            if ((i11 & 32) != 0) {
                                z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                                objI1 = c0VarR.i0();
                                if (z14) {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                } else {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                function3 = (Function2) objI1;
                                i12 = (-458753) & i12;
                            }
                            if (i17 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = g.f30157a;
                                    c0VarR.Y(objI0);
                                }
                                nVar3 = (pj.n) objI0;
                            } else {
                                nVar3 = nVar;
                            }
                            if (i19 != 0) {
                                f13 = j00.f29451f;
                            }
                            if (i21 != 0) {
                                f16 = j00.f29452g;
                            } else {
                                f16 = f12;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                ky kyVarI16 = i0(c0VarR, (i12 >> 27) & 14);
                                i12 &= -57345;
                                kyVar2 = kyVarI16;
                            }
                            if ((i11 & 32) != 0) {
                                z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                                objI1 = c0VarR.i0();
                                if (z14) {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                } else {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                function3 = (Function2) objI1;
                                i12 = (-458753) & i12;
                            }
                            if (i17 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = g.f30157a;
                                    c0VarR.Y(objI0);
                                }
                                nVar3 = (pj.n) objI0;
                            } else {
                                nVar3 = nVar;
                            }
                            if (i19 != 0) {
                                f13 = j00.f29451f;
                            }
                            if (i21 != 0) {
                                f16 = j00.f29452g;
                            } else {
                                f16 = f12;
                            }
                        }
                        i24 = i12;
                        boolean z114 = z11;
                        ky kyVar13 = kyVar2;
                        float f116 = f13;
                        Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function14 = function3;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1691224881, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1502)");
                        }
                        int i2115 = (i24 & 14) | 805306368 | (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24);
                        int i2116 = ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6;
                        androidx.compose.ui.a0 a0Var13 = a0Var2;
                        pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar13 = nVar3;
                        Q(t00Var2, f10, a0Var13, z114, kyVar13, function14, nVar13, f116, f16, true, false, c0VarR, i2115, i2116);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f15 = f16;
                        f14 = f116;
                        nVar2 = nVar13;
                        function4 = function14;
                        kyVar3 = kyVar13;
                        z13 = z114;
                        a0Var3 = a0Var13;
                    } else {
                        c0VarR.u();
                        nVar2 = nVar;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        f14 = f13;
                        function4 = function3;
                        f15 = f12;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.sy
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.f0(this.f32994a, t00Var, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(this)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i12 |= i23;
                }
                if ((306783379 & i12) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI17 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI17;
                        }
                        if ((i11 & 32) != 0) {
                            z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z14) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = g.f30157a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            f16 = j00.f29452g;
                        } else {
                            f16 = f12;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI18 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI18;
                        }
                        if ((i11 & 32) != 0) {
                            z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z14) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = g.f30157a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            f16 = j00.f29452g;
                        } else {
                            f16 = f12;
                        }
                    }
                    i24 = i12;
                    boolean z115 = z11;
                    ky kyVar14 = kyVar2;
                    float f117 = f13;
                    Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function15 = function3;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1691224881, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1502)");
                    }
                    int i2117 = (i24 & 14) | 805306368 | (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24);
                    int i2118 = ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6;
                    androidx.compose.ui.a0 a0Var14 = a0Var2;
                    pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar14 = nVar3;
                    Q(t00Var2, f10, a0Var14, z115, kyVar14, function15, nVar14, f117, f16, true, false, c0VarR, i2117, i2118);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f15 = f16;
                    f14 = f117;
                    nVar2 = nVar14;
                    function4 = function15;
                    kyVar3 = kyVar14;
                    z13 = z115;
                    a0Var3 = a0Var14;
                } else {
                    c0VarR.u();
                    nVar2 = nVar;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    f14 = f13;
                    function4 = function3;
                    f15 = f12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.sy
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.f0(this.f32994a, t00Var, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z11 = z10;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    kyVar2 = kyVar;
                    if (c0VarR.D(kyVar2)) {
                    }
                    i12 |= i25;
                } else {
                    kyVar2 = kyVar;
                }
                i12 |= i25;
            } else {
                kyVar2 = kyVar;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                    }
                    i12 |= i26;
                } else {
                    function3 = function2;
                }
                i12 |= i26;
            } else {
                function3 = function2;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
                f13 = f11;
            } else {
                f13 = f11;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f13)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.I(f12)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i22;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(this)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i12 |= i23;
                }
                if ((306783379 & i12) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI19 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI19;
                        }
                        if ((i11 & 32) != 0) {
                            z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z14) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = g.f30157a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            f16 = j00.f29452g;
                        } else {
                            f16 = f12;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI110 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI110;
                        }
                        if ((i11 & 32) != 0) {
                            z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z14) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = g.f30157a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            f16 = j00.f29452g;
                        } else {
                            f16 = f12;
                        }
                    }
                    i24 = i12;
                    boolean z116 = z11;
                    ky kyVar15 = kyVar2;
                    float f118 = f13;
                    Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function16 = function3;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1691224881, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1502)");
                    }
                    int i2119 = (i24 & 14) | 805306368 | (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24);
                    int i21110 = ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6;
                    androidx.compose.ui.a0 a0Var15 = a0Var2;
                    pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar15 = nVar3;
                    Q(t00Var2, f10, a0Var15, z116, kyVar15, function16, nVar15, f118, f16, true, false, c0VarR, i2119, i21110);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f15 = f16;
                    f14 = f118;
                    nVar2 = nVar15;
                    function4 = function16;
                    kyVar3 = kyVar15;
                    z13 = z116;
                    a0Var3 = a0Var15;
                } else {
                    c0VarR.u();
                    nVar2 = nVar;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    f14 = f13;
                    function4 = function3;
                    f15 = f12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.sy
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.f0(this.f32994a, t00Var, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.D(this)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i12 |= i23;
            }
            if ((306783379 & i12) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        ky kyVarI111 = i0(c0VarR, (i12 >> 27) & 14);
                        i12 &= -57345;
                        kyVar2 = kyVarI111;
                    }
                    if ((i11 & 32) != 0) {
                        z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-458753) & i12;
                    }
                    if (i17 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = g.f30157a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i19 != 0) {
                        f13 = j00.f29451f;
                    }
                    if (i21 != 0) {
                        f16 = j00.f29452g;
                    } else {
                        f16 = f12;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        ky kyVarI112 = i0(c0VarR, (i12 >> 27) & 14);
                        i12 &= -57345;
                        kyVar2 = kyVarI112;
                    }
                    if ((i11 & 32) != 0) {
                        z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-458753) & i12;
                    }
                    if (i17 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = g.f30157a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i19 != 0) {
                        f13 = j00.f29451f;
                    }
                    if (i21 != 0) {
                        f16 = j00.f29452g;
                    } else {
                        f16 = f12;
                    }
                }
                i24 = i12;
                boolean z117 = z11;
                ky kyVar16 = kyVar2;
                float f119 = f13;
                Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function17 = function3;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1691224881, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1502)");
                }
                int i21111 = (i24 & 14) | 805306368 | (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24);
                int i21112 = ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6;
                androidx.compose.ui.a0 a0Var16 = a0Var2;
                pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar16 = nVar3;
                Q(t00Var2, f10, a0Var16, z117, kyVar16, function17, nVar16, f119, f16, true, false, c0VarR, i21111, i21112);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f15 = f16;
                f14 = f119;
                nVar2 = nVar16;
                function4 = function17;
                kyVar3 = kyVar16;
                z13 = z117;
                a0Var3 = a0Var16;
            } else {
                c0VarR.u();
                nVar2 = nVar;
                a0Var3 = a0Var2;
                z13 = z11;
                kyVar3 = kyVar2;
                f14 = f13;
                function4 = function3;
                f15 = f12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.sy
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.f0(this.f32994a, t00Var, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    kyVar2 = kyVar;
                    if (c0VarR.D(kyVar2)) {
                    }
                    i12 |= i25;
                } else {
                    kyVar2 = kyVar;
                }
                i12 |= i25;
            } else {
                kyVar2 = kyVar;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                    }
                    i12 |= i26;
                } else {
                    function3 = function2;
                }
                i12 |= i26;
            } else {
                function3 = function2;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
                f13 = f11;
            } else {
                f13 = f11;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f13)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.I(f12)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i22;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(this)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i12 |= i23;
                }
                if ((306783379 & i12) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI113 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI113;
                        }
                        if ((i11 & 32) != 0) {
                            z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z14) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = g.f30157a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            f16 = j00.f29452g;
                        } else {
                            f16 = f12;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            ky kyVarI114 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -57345;
                            kyVar2 = kyVarI114;
                        }
                        if ((i11 & 32) != 0) {
                            z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                            objI1 = c0VarR.i0();
                            if (z14) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-458753) & i12;
                        }
                        if (i17 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = g.f30157a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i19 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i21 != 0) {
                            f16 = j00.f29452g;
                        } else {
                            f16 = f12;
                        }
                    }
                    i24 = i12;
                    boolean z118 = z11;
                    ky kyVar17 = kyVar2;
                    float f1110 = f13;
                    Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function18 = function3;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1691224881, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1502)");
                    }
                    int i21113 = (i24 & 14) | 805306368 | (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24);
                    int i21114 = ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6;
                    androidx.compose.ui.a0 a0Var17 = a0Var2;
                    pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar17 = nVar3;
                    Q(t00Var2, f10, a0Var17, z118, kyVar17, function18, nVar17, f1110, f16, true, false, c0VarR, i21113, i21114);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f15 = f16;
                    f14 = f1110;
                    nVar2 = nVar17;
                    function4 = function18;
                    kyVar3 = kyVar17;
                    z13 = z118;
                    a0Var3 = a0Var17;
                } else {
                    c0VarR.u();
                    nVar2 = nVar;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    f14 = f13;
                    function4 = function3;
                    f15 = f12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.sy
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.f0(this.f32994a, t00Var, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.D(this)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i12 |= i23;
            }
            if ((306783379 & i12) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        ky kyVarI115 = i0(c0VarR, (i12 >> 27) & 14);
                        i12 &= -57345;
                        kyVar2 = kyVarI115;
                    }
                    if ((i11 & 32) != 0) {
                        z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-458753) & i12;
                    }
                    if (i17 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = g.f30157a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i19 != 0) {
                        f13 = j00.f29451f;
                    }
                    if (i21 != 0) {
                        f16 = j00.f29452g;
                    } else {
                        f16 = f12;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        ky kyVarI116 = i0(c0VarR, (i12 >> 27) & 14);
                        i12 &= -57345;
                        kyVar2 = kyVarI116;
                    }
                    if ((i11 & 32) != 0) {
                        z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-458753) & i12;
                    }
                    if (i17 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = g.f30157a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i19 != 0) {
                        f13 = j00.f29451f;
                    }
                    if (i21 != 0) {
                        f16 = j00.f29452g;
                    } else {
                        f16 = f12;
                    }
                }
                i24 = i12;
                boolean z119 = z11;
                ky kyVar18 = kyVar2;
                float f1111 = f13;
                Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function19 = function3;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1691224881, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1502)");
                }
                int i21115 = (i24 & 14) | 805306368 | (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24);
                int i21116 = ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6;
                androidx.compose.ui.a0 a0Var18 = a0Var2;
                pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar18 = nVar3;
                Q(t00Var2, f10, a0Var18, z119, kyVar18, function19, nVar18, f1111, f16, true, false, c0VarR, i21115, i21116);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f15 = f16;
                f14 = f1111;
                nVar2 = nVar18;
                function4 = function19;
                kyVar3 = kyVar18;
                z13 = z119;
                a0Var3 = a0Var18;
            } else {
                c0VarR.u();
                nVar2 = nVar;
                a0Var3 = a0Var2;
                z13 = z11;
                kyVar3 = kyVar2;
                f14 = f13;
                function4 = function3;
                f15 = f12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.sy
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.f0(this.f32994a, t00Var, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z11 = z10;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                kyVar2 = kyVar;
                if (c0VarR.D(kyVar2)) {
                }
                i12 |= i25;
            } else {
                kyVar2 = kyVar;
            }
            i12 |= i25;
        } else {
            kyVar2 = kyVar;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                function3 = function2;
                if (c0VarR.k0(function3)) {
                }
                i12 |= i26;
            } else {
                function3 = function2;
            }
            i12 |= i26;
        } else {
            function3 = function2;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0VarR.k0(nVar)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i12 |= i18;
        }
        i19 = i11 & 128;
        if (i19 != 0) {
            i12 |= 12582912;
            f13 = f11;
        } else {
            f13 = f11;
            if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f13)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
        }
        i21 = i11 & 256;
        if (i21 != 0) {
            if ((i10 & 100663296) == 0) {
                if (c0VarR.I(f12)) {
                    i22 = 67108864;
                } else {
                    i22 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i22;
            }
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.D(this)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i12 |= i23;
            }
            if ((306783379 & i12) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        ky kyVarI117 = i0(c0VarR, (i12 >> 27) & 14);
                        i12 &= -57345;
                        kyVar2 = kyVarI117;
                    }
                    if ((i11 & 32) != 0) {
                        z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-458753) & i12;
                    }
                    if (i17 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = g.f30157a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i19 != 0) {
                        f13 = j00.f29451f;
                    }
                    if (i21 != 0) {
                        f16 = j00.f29452g;
                    } else {
                        f16 = f12;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        ky kyVarI118 = i0(c0VarR, (i12 >> 27) & 14);
                        i12 &= -57345;
                        kyVar2 = kyVarI118;
                    }
                    if ((i11 & 32) != 0) {
                        z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.ry
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-458753) & i12;
                    }
                    if (i17 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = g.f30157a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i19 != 0) {
                        f13 = j00.f29451f;
                    }
                    if (i21 != 0) {
                        f16 = j00.f29452g;
                    } else {
                        f16 = f12;
                    }
                }
                i24 = i12;
                boolean z1110 = z11;
                ky kyVar19 = kyVar2;
                float f1112 = f13;
                Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function110 = function3;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1691224881, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1502)");
                }
                int i21117 = (i24 & 14) | 805306368 | (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24);
                int i21118 = ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6;
                androidx.compose.ui.a0 a0Var19 = a0Var2;
                pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar19 = nVar3;
                Q(t00Var2, f10, a0Var19, z1110, kyVar19, function110, nVar19, f1112, f16, true, false, c0VarR, i21117, i21118);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f15 = f16;
                f14 = f1112;
                nVar2 = nVar19;
                function4 = function110;
                kyVar3 = kyVar19;
                z13 = z1110;
                a0Var3 = a0Var19;
            } else {
                c0VarR.u();
                nVar2 = nVar;
                a0Var3 = a0Var2;
                z13 = z11;
                kyVar3 = kyVar2;
                f14 = f13;
                function4 = function3;
                f15 = f12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.sy
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.f0(this.f32994a, t00Var, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 100663296;
        if ((i11 & 512) != 0) {
            i12 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            if (c0VarR.D(this)) {
                i23 = 536870912;
            } else {
                i23 = 268435456;
            }
            i12 |= i23;
        }
        if ((306783379 & i12) != 306783378) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i15 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    ky kyVarI119 = i0(c0VarR, (i12 >> 27) & 14);
                    i12 &= -57345;
                    kyVar2 = kyVarI119;
                }
                if ((i11 & 32) != 0) {
                    z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                    objI1 = c0VarR.i0();
                    if (z14) {
                        objI1 = new Function2() { // from class: androidx.compose.material3.ry
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function2() { // from class: androidx.compose.material3.ry
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    function3 = (Function2) objI1;
                    i12 = (-458753) & i12;
                }
                if (i17 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = g.f30157a;
                        c0VarR.Y(objI0);
                    }
                    nVar3 = (pj.n) objI0;
                } else {
                    nVar3 = nVar;
                }
                if (i19 != 0) {
                    f13 = j00.f29451f;
                }
                if (i21 != 0) {
                    f16 = j00.f29452g;
                } else {
                    f16 = f12;
                }
            } else {
                if (i13 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i15 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    ky kyVarI1110 = i0(c0VarR, (i12 >> 27) & 14);
                    i12 &= -57345;
                    kyVar2 = kyVarI1110;
                }
                if ((i11 & 32) != 0) {
                    z14 = ((((57344 & i12) ^ 24576) <= 16384 && c0VarR.D(kyVar2)) || (i12 & 24576) == 16384) | ((i12 & 7168) == 2048);
                    objI1 = c0VarR.i0();
                    if (z14) {
                        objI1 = new Function2() { // from class: androidx.compose.material3.ry
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function2() { // from class: androidx.compose.material3.ry
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.e0(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    function3 = (Function2) objI1;
                    i12 = (-458753) & i12;
                }
                if (i17 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = g.f30157a;
                        c0VarR.Y(objI0);
                    }
                    nVar3 = (pj.n) objI0;
                } else {
                    nVar3 = nVar;
                }
                if (i19 != 0) {
                    f13 = j00.f29451f;
                }
                if (i21 != 0) {
                    f16 = j00.f29452g;
                } else {
                    f16 = f12;
                }
            }
            i24 = i12;
            boolean z1111 = z11;
            ky kyVar110 = kyVar2;
            float f1113 = f13;
            Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function111 = function3;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1691224881, i24, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1502)");
            }
            int i21119 = (i24 & 14) | 805306368 | (i24 & com.planner5d.library.engine.input.f.b.B) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24);
            int i211110 = ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6;
            androidx.compose.ui.a0 a0Var110 = a0Var2;
            pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar110 = nVar3;
            Q(t00Var2, f10, a0Var110, z1111, kyVar110, function111, nVar110, f1113, f16, true, false, c0VarR, i21119, i211110);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            f15 = f16;
            f14 = f1113;
            nVar2 = nVar110;
            function4 = function111;
            kyVar3 = kyVar110;
            z13 = z1111;
            a0Var3 = a0Var110;
        } else {
            c0VarR.u();
            nVar2 = nVar;
            a0Var3 = a0Var2;
            z13 = z11;
            kyVar3 = kyVar2;
            f14 = f13;
            function4 = function3;
            f15 = f12;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.sy
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return kz.f0(this.f32994a, t00Var, f10, a0Var3, z13, kyVar3, function4, nVar2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @NotNull
    public final ky i0(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1376295968, i10, -1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:1107)");
        }
        ky kyVarO0 = o0(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return kyVarO0;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final ky j0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11, int i12) {
        long jU = (i12 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i12 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i12 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jU4 = (i12 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        long jU5 = (i12 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        long jU6 = (i12 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j15;
        long jU7 = (i12 & 64) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j16;
        long jU8 = (i12 & 128) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j17;
        long j20 = jU;
        long jU9 = (i12 & 256) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j18;
        long jU10 = (i12 & 512) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j19;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(885588574, i10, i11, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:1149)");
        }
        ky kyVarA = o0(pj.f31758a.a(c0Var, 6)).a(j20, jU2, jU3, jU4, jU5, jU6, jU7, jU8, jU9, jU10);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return kyVarA;
    }

    public final void k0(@NotNull androidx.compose.ui.graphics.drawscope.f fVar, long j10, float f10, long j11) {
        androidx.compose.ui.graphics.drawscope.f.B4(fVar, j11, fVar.S7(f10) / 2.0f, j10, 0.0f, null, null, 0, 120, null);
    }

    @NotNull
    public final ky o0(@NotNull l6 l6Var) {
        ky kyVarT = l6Var.T();
        if (kyVarT != null) {
            return kyVarT;
        }
        d0.m2 m2Var = d0.m2.f268479a;
        ky kyVar = new ky(o6.o(l6Var, m2Var.x()), o6.o(l6Var, m2Var.h()), o6.o(l6Var, m2Var.F()), o6.o(l6Var, m2Var.F()), o6.o(l6Var, m2Var.h()), androidx.compose.ui.graphics.s0.j(androidx.compose.ui.graphics.q0.w(o6.o(l6Var, m2Var.n()), m2Var.o(), 0.0f, 0.0f, 0.0f, 14, null), l6Var.M0()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, m2Var.l()), m2Var.m(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, m2Var.q()), m2Var.r(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, m2Var.q()), m2Var.r(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, m2Var.l()), m2Var.m(), 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.K1(kyVar);
        return kyVar;
    }

    public final float p0() {
        return f30142c;
    }

    public final float q0() {
        return f30141b;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0129  */
    /* JADX WARN: Code duplicated, block: B:101:0x012c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0130  */
    /* JADX WARN: Code duplicated, block: B:105:0x0136  */
    /* JADX WARN: Code duplicated, block: B:106:0x0139  */
    /* JADX WARN: Code duplicated, block: B:110:0x0149  */
    /* JADX WARN: Code duplicated, block: B:111:0x014c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0156  */
    /* JADX WARN: Code duplicated, block: B:116:0x0160  */
    /* JADX WARN: Code duplicated, block: B:126:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x0182  */
    /* JADX WARN: Code duplicated, block: B:129:0x0187  */
    /* JADX WARN: Code duplicated, block: B:132:0x018d  */
    /* JADX WARN: Code duplicated, block: B:135:0x019d  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:155:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:157:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:159:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:161:0x0201  */
    /* JADX WARN: Code duplicated, block: B:162:0x0206  */
    /* JADX WARN: Code duplicated, block: B:164:0x020a  */
    /* JADX WARN: Code duplicated, block: B:165:0x021b  */
    /* JADX WARN: Code duplicated, block: B:168:0x022e  */
    /* JADX WARN: Code duplicated, block: B:171:0x0276  */
    /* JADX WARN: Code duplicated, block: B:173:0x027b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0293  */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00be  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0107  */
    /* JADX WARN: Code duplicated, block: B:91:0x010e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112  */
    /* JADX WARN: Code duplicated, block: B:95:0x011c  */
    /* JADX WARN: Code duplicated, block: B:96:0x011f  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void y(@NotNull final t00 t00Var, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable ky kyVar, @Nullable Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function2, @Nullable pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar, float f10, float f11, float f12, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        final boolean z11;
        int i14;
        final ky kyVar2;
        Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function3;
        int i15;
        int i16;
        int i17;
        final float f13;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z12;
        final pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final ky kyVar3;
        final Function2<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, Unit> function4;
        final float f14;
        final float f15;
        androidx.compose.runtime.s5 s5VarT;
        pj.n<? super androidx.compose.ui.graphics.drawscope.f, ? super n0.g, ? super androidx.compose.ui.graphics.q0, Unit> nVar3;
        float f16;
        int i24;
        float fE;
        Object objI0;
        boolean z14;
        Object objI1;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1199441071);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(t00Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i25 = i11 & 2;
        if (i25 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        kyVar2 = kyVar;
                        int i26 = c0VarR.D(kyVar2) ? 2048 : 1024;
                        i12 |= i26;
                    } else {
                        kyVar2 = kyVar;
                    }
                    i12 |= i26;
                } else {
                    kyVar2 = kyVar;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        function3 = function2;
                        int i27 = c0VarR.k0(function3) ? 16384 : 8192;
                        i12 |= i27;
                    } else {
                        function3 = function2;
                    }
                    i12 |= i27;
                } else {
                    function3 = function2;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    f13 = f10;
                } else {
                    f13 = f10;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.I(f13)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f11)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.I(f12)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i22;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(this)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i12 |= i23;
                    }
                    if ((306783379 & i12) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i25 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                ky kyVarI0 = i0(c0VarR, (i12 >> 27) & 14);
                                i12 &= -7169;
                                kyVar2 = kyVarI0;
                            }
                            if ((i11 & 16) != 0) {
                                z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                                objI1 = c0VarR.i0();
                                if (z14 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = new Function2() { // from class: androidx.compose.material3.az
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                function3 = (Function2) objI1;
                                i12 = (-57345) & i12;
                            }
                            if (i15 != 0) {
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = a.f30145a;
                                    c0VarR.Y(objI0);
                                }
                                nVar3 = (pj.n) objI0;
                            } else {
                                nVar3 = nVar;
                            }
                            if (i17 != 0) {
                                f13 = j00.f29451f;
                            }
                            if (i19 != 0) {
                                f16 = j00.f29452g;
                            } else {
                                f16 = f11;
                            }
                            if (i21 != 0) {
                                nVar2 = nVar3;
                                i24 = i12;
                                z13 = z11;
                                f14 = f16;
                                fE = androidx.compose.ui.unit.h.f42689b.e();
                                kyVar3 = kyVar2;
                            } else {
                                nVar2 = nVar3;
                                i24 = i12;
                                z13 = z11;
                                kyVar3 = kyVar2;
                                f14 = f16;
                                fE = f12;
                            }
                        } else {
                            c0VarR.u();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            nVar2 = nVar;
                            fE = f12;
                            i24 = i12;
                            z13 = z11;
                            kyVar3 = kyVar2;
                            f14 = f11;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1199441071, i24, -1, "androidx.compose.material3.SliderDefaults.CenteredTrack (Slider.kt:1557)");
                        }
                        int i28 = i24 << 3;
                        a0Var3 = a0Var2;
                        function4 = function3;
                        Q(t00Var, fE, a0Var3, z13, kyVar3, function4, nVar2, f13, f14, true, true, c0VarR, (i24 & 14) | 805306368 | ((i24 >> 21) & com.planner5d.library.engine.input.f.b.B) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | (3670016 & i28) | (29360128 & i28) | (i28 & 234881024), ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f15 = fE;
                    } else {
                        c0VarR.u();
                        nVar2 = nVar;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        function4 = function3;
                        f14 = f11;
                        f15 = f12;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.bz
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.A(this.f26395a, t00Var, a0Var3, z13, kyVar3, function4, nVar2, f13, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(this)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i12 |= i23;
                }
                if ((306783379 & i12) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            ky kyVarI1 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -7169;
                            kyVar2 = kyVarI1;
                        }
                        if ((i11 & 16) != 0) {
                            z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                            objI1 = c0VarR.i0();
                            if (z14) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.az
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.az
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-57345) & i12;
                        }
                        if (i15 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = a.f30145a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i17 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i19 != 0) {
                            f16 = j00.f29452g;
                        } else {
                            f16 = f11;
                        }
                        if (i21 != 0) {
                            nVar2 = nVar3;
                            i24 = i12;
                            z13 = z11;
                            f14 = f16;
                            fE = androidx.compose.ui.unit.h.f42689b.e();
                            kyVar3 = kyVar2;
                        } else {
                            nVar2 = nVar3;
                            i24 = i12;
                            z13 = z11;
                            kyVar3 = kyVar2;
                            f14 = f16;
                            fE = f12;
                        }
                    } else {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            ky kyVarI2 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -7169;
                            kyVar2 = kyVarI2;
                        }
                        if ((i11 & 16) != 0) {
                            z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                            objI1 = c0VarR.i0();
                            if (z14) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.az
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.az
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-57345) & i12;
                        }
                        if (i15 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = a.f30145a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i17 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i19 != 0) {
                            f16 = j00.f29452g;
                        } else {
                            f16 = f11;
                        }
                        if (i21 != 0) {
                            nVar2 = nVar3;
                            i24 = i12;
                            z13 = z11;
                            f14 = f16;
                            fE = androidx.compose.ui.unit.h.f42689b.e();
                            kyVar3 = kyVar2;
                        } else {
                            nVar2 = nVar3;
                            i24 = i12;
                            z13 = z11;
                            kyVar3 = kyVar2;
                            f14 = f16;
                            fE = f12;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1199441071, i24, -1, "androidx.compose.material3.SliderDefaults.CenteredTrack (Slider.kt:1557)");
                    }
                    int i29 = i24 << 3;
                    a0Var3 = a0Var2;
                    function4 = function3;
                    Q(t00Var, fE, a0Var3, z13, kyVar3, function4, nVar2, f13, f14, true, true, c0VarR, (i24 & 14) | 805306368 | ((i24 >> 21) & com.planner5d.library.engine.input.f.b.B) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (3670016 & i29) | (29360128 & i29) | (i29 & 234881024), ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f15 = fE;
                } else {
                    c0VarR.u();
                    nVar2 = nVar;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    function4 = function3;
                    f14 = f11;
                    f15 = f12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.bz
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.A(this.f26395a, t00Var, a0Var3, z13, kyVar3, function4, nVar2, f13, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    kyVar2 = kyVar;
                    if (c0VarR.D(kyVar2)) {
                    }
                    i12 |= i26;
                } else {
                    kyVar2 = kyVar;
                }
                i12 |= i26;
            } else {
                kyVar2 = kyVar;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                    }
                    i12 |= i27;
                } else {
                    function3 = function2;
                }
                i12 |= i27;
            } else {
                function3 = function2;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                f13 = f10;
            } else {
                f13 = f10;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.I(f13)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f11)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.I(f12)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i22;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(this)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i12 |= i23;
                }
                if ((306783379 & i12) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            ky kyVarI3 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -7169;
                            kyVar2 = kyVarI3;
                        }
                        if ((i11 & 16) != 0) {
                            z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                            objI1 = c0VarR.i0();
                            if (z14) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.az
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.az
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-57345) & i12;
                        }
                        if (i15 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = a.f30145a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i17 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i19 != 0) {
                            f16 = j00.f29452g;
                        } else {
                            f16 = f11;
                        }
                        if (i21 != 0) {
                            nVar2 = nVar3;
                            i24 = i12;
                            z13 = z11;
                            f14 = f16;
                            fE = androidx.compose.ui.unit.h.f42689b.e();
                            kyVar3 = kyVar2;
                        } else {
                            nVar2 = nVar3;
                            i24 = i12;
                            z13 = z11;
                            kyVar3 = kyVar2;
                            f14 = f16;
                            fE = f12;
                        }
                    } else {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            ky kyVarI4 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -7169;
                            kyVar2 = kyVarI4;
                        }
                        if ((i11 & 16) != 0) {
                            z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                            objI1 = c0VarR.i0();
                            if (z14) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.az
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.az
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-57345) & i12;
                        }
                        if (i15 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = a.f30145a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i17 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i19 != 0) {
                            f16 = j00.f29452g;
                        } else {
                            f16 = f11;
                        }
                        if (i21 != 0) {
                            nVar2 = nVar3;
                            i24 = i12;
                            z13 = z11;
                            f14 = f16;
                            fE = androidx.compose.ui.unit.h.f42689b.e();
                            kyVar3 = kyVar2;
                        } else {
                            nVar2 = nVar3;
                            i24 = i12;
                            z13 = z11;
                            kyVar3 = kyVar2;
                            f14 = f16;
                            fE = f12;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1199441071, i24, -1, "androidx.compose.material3.SliderDefaults.CenteredTrack (Slider.kt:1557)");
                    }
                    int i210 = i24 << 3;
                    a0Var3 = a0Var2;
                    function4 = function3;
                    Q(t00Var, fE, a0Var3, z13, kyVar3, function4, nVar2, f13, f14, true, true, c0VarR, (i24 & 14) | 805306368 | ((i24 >> 21) & com.planner5d.library.engine.input.f.b.B) | (i210 & 896) | (i210 & 7168) | (57344 & i210) | (458752 & i210) | (3670016 & i210) | (29360128 & i210) | (i210 & 234881024), ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f15 = fE;
                } else {
                    c0VarR.u();
                    nVar2 = nVar;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    function4 = function3;
                    f14 = f11;
                    f15 = f12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.bz
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.A(this.f26395a, t00Var, a0Var3, z13, kyVar3, function4, nVar2, f13, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.D(this)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i12 |= i23;
            }
            if ((306783379 & i12) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        ky kyVarI5 = i0(c0VarR, (i12 >> 27) & 14);
                        i12 &= -7169;
                        kyVar2 = kyVarI5;
                    }
                    if ((i11 & 16) != 0) {
                        z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.az
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.az
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-57345) & i12;
                    }
                    if (i15 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = a.f30145a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i17 != 0) {
                        f13 = j00.f29451f;
                    }
                    if (i19 != 0) {
                        f16 = j00.f29452g;
                    } else {
                        f16 = f11;
                    }
                    if (i21 != 0) {
                        nVar2 = nVar3;
                        i24 = i12;
                        z13 = z11;
                        f14 = f16;
                        fE = androidx.compose.ui.unit.h.f42689b.e();
                        kyVar3 = kyVar2;
                    } else {
                        nVar2 = nVar3;
                        i24 = i12;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        f14 = f16;
                        fE = f12;
                    }
                } else {
                    if (i25 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        ky kyVarI6 = i0(c0VarR, (i12 >> 27) & 14);
                        i12 &= -7169;
                        kyVar2 = kyVarI6;
                    }
                    if ((i11 & 16) != 0) {
                        z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.az
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.az
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-57345) & i12;
                    }
                    if (i15 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = a.f30145a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i17 != 0) {
                        f13 = j00.f29451f;
                    }
                    if (i19 != 0) {
                        f16 = j00.f29452g;
                    } else {
                        f16 = f11;
                    }
                    if (i21 != 0) {
                        nVar2 = nVar3;
                        i24 = i12;
                        z13 = z11;
                        f14 = f16;
                        fE = androidx.compose.ui.unit.h.f42689b.e();
                        kyVar3 = kyVar2;
                    } else {
                        nVar2 = nVar3;
                        i24 = i12;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        f14 = f16;
                        fE = f12;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1199441071, i24, -1, "androidx.compose.material3.SliderDefaults.CenteredTrack (Slider.kt:1557)");
                }
                int i211 = i24 << 3;
                a0Var3 = a0Var2;
                function4 = function3;
                Q(t00Var, fE, a0Var3, z13, kyVar3, function4, nVar2, f13, f14, true, true, c0VarR, (i24 & 14) | 805306368 | ((i24 >> 21) & com.planner5d.library.engine.input.f.b.B) | (i211 & 896) | (i211 & 7168) | (57344 & i211) | (458752 & i211) | (3670016 & i211) | (29360128 & i211) | (i211 & 234881024), ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f15 = fE;
            } else {
                c0VarR.u();
                nVar2 = nVar;
                a0Var3 = a0Var2;
                z13 = z11;
                kyVar3 = kyVar2;
                function4 = function3;
                f14 = f11;
                f15 = f12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.bz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.A(this.f26395a, t00Var, a0Var3, z13, kyVar3, function4, nVar2, f13, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    kyVar2 = kyVar;
                    if (c0VarR.D(kyVar2)) {
                    }
                    i12 |= i26;
                } else {
                    kyVar2 = kyVar;
                }
                i12 |= i26;
            } else {
                kyVar2 = kyVar;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                    }
                    i12 |= i27;
                } else {
                    function3 = function2;
                }
                i12 |= i27;
            } else {
                function3 = function2;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                f13 = f10;
            } else {
                f13 = f10;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.I(f13)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f11)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.I(f12)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i22;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(this)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i12 |= i23;
                }
                if ((306783379 & i12) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            ky kyVarI7 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -7169;
                            kyVar2 = kyVarI7;
                        }
                        if ((i11 & 16) != 0) {
                            z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                            objI1 = c0VarR.i0();
                            if (z14) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.az
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.az
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-57345) & i12;
                        }
                        if (i15 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = a.f30145a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i17 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i19 != 0) {
                            f16 = j00.f29452g;
                        } else {
                            f16 = f11;
                        }
                        if (i21 != 0) {
                            nVar2 = nVar3;
                            i24 = i12;
                            z13 = z11;
                            f14 = f16;
                            fE = androidx.compose.ui.unit.h.f42689b.e();
                            kyVar3 = kyVar2;
                        } else {
                            nVar2 = nVar3;
                            i24 = i12;
                            z13 = z11;
                            kyVar3 = kyVar2;
                            f14 = f16;
                            fE = f12;
                        }
                    } else {
                        if (i25 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            ky kyVarI8 = i0(c0VarR, (i12 >> 27) & 14);
                            i12 &= -7169;
                            kyVar2 = kyVarI8;
                        }
                        if ((i11 & 16) != 0) {
                            z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                            objI1 = c0VarR.i0();
                            if (z14) {
                                objI1 = new Function2() { // from class: androidx.compose.material3.az
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function2() { // from class: androidx.compose.material3.az
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function3 = (Function2) objI1;
                            i12 = (-57345) & i12;
                        }
                        if (i15 != 0) {
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = a.f30145a;
                                c0VarR.Y(objI0);
                            }
                            nVar3 = (pj.n) objI0;
                        } else {
                            nVar3 = nVar;
                        }
                        if (i17 != 0) {
                            f13 = j00.f29451f;
                        }
                        if (i19 != 0) {
                            f16 = j00.f29452g;
                        } else {
                            f16 = f11;
                        }
                        if (i21 != 0) {
                            nVar2 = nVar3;
                            i24 = i12;
                            z13 = z11;
                            f14 = f16;
                            fE = androidx.compose.ui.unit.h.f42689b.e();
                            kyVar3 = kyVar2;
                        } else {
                            nVar2 = nVar3;
                            i24 = i12;
                            z13 = z11;
                            kyVar3 = kyVar2;
                            f14 = f16;
                            fE = f12;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1199441071, i24, -1, "androidx.compose.material3.SliderDefaults.CenteredTrack (Slider.kt:1557)");
                    }
                    int i212 = i24 << 3;
                    a0Var3 = a0Var2;
                    function4 = function3;
                    Q(t00Var, fE, a0Var3, z13, kyVar3, function4, nVar2, f13, f14, true, true, c0VarR, (i24 & 14) | 805306368 | ((i24 >> 21) & com.planner5d.library.engine.input.f.b.B) | (i212 & 896) | (i212 & 7168) | (57344 & i212) | (458752 & i212) | (3670016 & i212) | (29360128 & i212) | (i212 & 234881024), ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f15 = fE;
                } else {
                    c0VarR.u();
                    nVar2 = nVar;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    function4 = function3;
                    f14 = f11;
                    f15 = f12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.bz
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kz.A(this.f26395a, t00Var, a0Var3, z13, kyVar3, function4, nVar2, f13, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.D(this)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i12 |= i23;
            }
            if ((306783379 & i12) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        ky kyVarI9 = i0(c0VarR, (i12 >> 27) & 14);
                        i12 &= -7169;
                        kyVar2 = kyVarI9;
                    }
                    if ((i11 & 16) != 0) {
                        z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.az
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.az
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-57345) & i12;
                    }
                    if (i15 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = a.f30145a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i17 != 0) {
                        f13 = j00.f29451f;
                    }
                    if (i19 != 0) {
                        f16 = j00.f29452g;
                    } else {
                        f16 = f11;
                    }
                    if (i21 != 0) {
                        nVar2 = nVar3;
                        i24 = i12;
                        z13 = z11;
                        f14 = f16;
                        fE = androidx.compose.ui.unit.h.f42689b.e();
                        kyVar3 = kyVar2;
                    } else {
                        nVar2 = nVar3;
                        i24 = i12;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        f14 = f16;
                        fE = f12;
                    }
                } else {
                    if (i25 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        ky kyVarI10 = i0(c0VarR, (i12 >> 27) & 14);
                        i12 &= -7169;
                        kyVar2 = kyVarI10;
                    }
                    if ((i11 & 16) != 0) {
                        z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.az
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.az
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-57345) & i12;
                    }
                    if (i15 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = a.f30145a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i17 != 0) {
                        f13 = j00.f29451f;
                    }
                    if (i19 != 0) {
                        f16 = j00.f29452g;
                    } else {
                        f16 = f11;
                    }
                    if (i21 != 0) {
                        nVar2 = nVar3;
                        i24 = i12;
                        z13 = z11;
                        f14 = f16;
                        fE = androidx.compose.ui.unit.h.f42689b.e();
                        kyVar3 = kyVar2;
                    } else {
                        nVar2 = nVar3;
                        i24 = i12;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        f14 = f16;
                        fE = f12;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1199441071, i24, -1, "androidx.compose.material3.SliderDefaults.CenteredTrack (Slider.kt:1557)");
                }
                int i213 = i24 << 3;
                a0Var3 = a0Var2;
                function4 = function3;
                Q(t00Var, fE, a0Var3, z13, kyVar3, function4, nVar2, f13, f14, true, true, c0VarR, (i24 & 14) | 805306368 | ((i24 >> 21) & com.planner5d.library.engine.input.f.b.B) | (i213 & 896) | (i213 & 7168) | (57344 & i213) | (458752 & i213) | (3670016 & i213) | (29360128 & i213) | (i213 & 234881024), ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f15 = fE;
            } else {
                c0VarR.u();
                nVar2 = nVar;
                a0Var3 = a0Var2;
                z13 = z11;
                kyVar3 = kyVar2;
                function4 = function3;
                f14 = f11;
                f15 = f12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.bz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.A(this.f26395a, t00Var, a0Var3, z13, kyVar3, function4, nVar2, f13, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                kyVar2 = kyVar;
                if (c0VarR.D(kyVar2)) {
                }
                i12 |= i26;
            } else {
                kyVar2 = kyVar;
            }
            i12 |= i26;
        } else {
            kyVar2 = kyVar;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                function3 = function2;
                if (c0VarR.k0(function3)) {
                }
                i12 |= i27;
            } else {
                function3 = function2;
            }
            i12 |= i27;
        } else {
            function3 = function2;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.k0(nVar)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i12 |= i16;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
            f13 = f10;
        } else {
            f13 = f10;
            if ((i10 & 1572864) == 0) {
                if (c0VarR.I(f13)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
        }
        i19 = i11 & 128;
        if (i19 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.I(f11)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i12 |= i20;
        }
        i21 = i11 & 256;
        if (i21 != 0) {
            if ((i10 & 100663296) == 0) {
                if (c0VarR.I(f12)) {
                    i22 = 67108864;
                } else {
                    i22 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i22;
            }
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.D(this)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i12 |= i23;
            }
            if ((306783379 & i12) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        ky kyVarI11 = i0(c0VarR, (i12 >> 27) & 14);
                        i12 &= -7169;
                        kyVar2 = kyVarI11;
                    }
                    if ((i11 & 16) != 0) {
                        z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.az
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.az
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-57345) & i12;
                    }
                    if (i15 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = a.f30145a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i17 != 0) {
                        f13 = j00.f29451f;
                    }
                    if (i19 != 0) {
                        f16 = j00.f29452g;
                    } else {
                        f16 = f11;
                    }
                    if (i21 != 0) {
                        nVar2 = nVar3;
                        i24 = i12;
                        z13 = z11;
                        f14 = f16;
                        fE = androidx.compose.ui.unit.h.f42689b.e();
                        kyVar3 = kyVar2;
                    } else {
                        nVar2 = nVar3;
                        i24 = i12;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        f14 = f16;
                        fE = f12;
                    }
                } else {
                    if (i25 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        ky kyVarI12 = i0(c0VarR, (i12 >> 27) & 14);
                        i12 &= -7169;
                        kyVar2 = kyVarI12;
                    }
                    if ((i11 & 16) != 0) {
                        z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                        objI1 = c0VarR.i0();
                        if (z14) {
                            objI1 = new Function2() { // from class: androidx.compose.material3.az
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function2() { // from class: androidx.compose.material3.az
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function3 = (Function2) objI1;
                        i12 = (-57345) & i12;
                    }
                    if (i15 != 0) {
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = a.f30145a;
                            c0VarR.Y(objI0);
                        }
                        nVar3 = (pj.n) objI0;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i17 != 0) {
                        f13 = j00.f29451f;
                    }
                    if (i19 != 0) {
                        f16 = j00.f29452g;
                    } else {
                        f16 = f11;
                    }
                    if (i21 != 0) {
                        nVar2 = nVar3;
                        i24 = i12;
                        z13 = z11;
                        f14 = f16;
                        fE = androidx.compose.ui.unit.h.f42689b.e();
                        kyVar3 = kyVar2;
                    } else {
                        nVar2 = nVar3;
                        i24 = i12;
                        z13 = z11;
                        kyVar3 = kyVar2;
                        f14 = f16;
                        fE = f12;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1199441071, i24, -1, "androidx.compose.material3.SliderDefaults.CenteredTrack (Slider.kt:1557)");
                }
                int i214 = i24 << 3;
                a0Var3 = a0Var2;
                function4 = function3;
                Q(t00Var, fE, a0Var3, z13, kyVar3, function4, nVar2, f13, f14, true, true, c0VarR, (i24 & 14) | 805306368 | ((i24 >> 21) & com.planner5d.library.engine.input.f.b.B) | (i214 & 896) | (i214 & 7168) | (57344 & i214) | (458752 & i214) | (3670016 & i214) | (29360128 & i214) | (i214 & 234881024), ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f15 = fE;
            } else {
                c0VarR.u();
                nVar2 = nVar;
                a0Var3 = a0Var2;
                z13 = z11;
                kyVar3 = kyVar2;
                function4 = function3;
                f14 = f11;
                f15 = f12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.bz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kz.A(this.f26395a, t00Var, a0Var3, z13, kyVar3, function4, nVar2, f13, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 100663296;
        if ((i11 & 512) != 0) {
            i12 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            if (c0VarR.D(this)) {
                i23 = 536870912;
            } else {
                i23 = 268435456;
            }
            i12 |= i23;
        }
        if ((306783379 & i12) != 306783378) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i25 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    ky kyVarI13 = i0(c0VarR, (i12 >> 27) & 14);
                    i12 &= -7169;
                    kyVar2 = kyVarI13;
                }
                if ((i11 & 16) != 0) {
                    z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                    objI1 = c0VarR.i0();
                    if (z14) {
                        objI1 = new Function2() { // from class: androidx.compose.material3.az
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function2() { // from class: androidx.compose.material3.az
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    function3 = (Function2) objI1;
                    i12 = (-57345) & i12;
                }
                if (i15 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = a.f30145a;
                        c0VarR.Y(objI0);
                    }
                    nVar3 = (pj.n) objI0;
                } else {
                    nVar3 = nVar;
                }
                if (i17 != 0) {
                    f13 = j00.f29451f;
                }
                if (i19 != 0) {
                    f16 = j00.f29452g;
                } else {
                    f16 = f11;
                }
                if (i21 != 0) {
                    nVar2 = nVar3;
                    i24 = i12;
                    z13 = z11;
                    f14 = f16;
                    fE = androidx.compose.ui.unit.h.f42689b.e();
                    kyVar3 = kyVar2;
                } else {
                    nVar2 = nVar3;
                    i24 = i12;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    f14 = f16;
                    fE = f12;
                }
            } else {
                if (i25 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    ky kyVarI14 = i0(c0VarR, (i12 >> 27) & 14);
                    i12 &= -7169;
                    kyVar2 = kyVarI14;
                }
                if ((i11 & 16) != 0) {
                    z14 = ((((i12 & 7168) ^ 3072) <= 2048 && c0VarR.D(kyVar2)) || (i12 & 3072) == 2048) | ((i12 & 896) == 256);
                    objI1 = c0VarR.i0();
                    if (z14) {
                        objI1 = new Function2() { // from class: androidx.compose.material3.az
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function2() { // from class: androidx.compose.material3.az
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kz.z(kyVar2, z11, (androidx.compose.ui.graphics.drawscope.f) obj, (n0.g) obj2);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    function3 = (Function2) objI1;
                    i12 = (-57345) & i12;
                }
                if (i15 != 0) {
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = a.f30145a;
                        c0VarR.Y(objI0);
                    }
                    nVar3 = (pj.n) objI0;
                } else {
                    nVar3 = nVar;
                }
                if (i17 != 0) {
                    f13 = j00.f29451f;
                }
                if (i19 != 0) {
                    f16 = j00.f29452g;
                } else {
                    f16 = f11;
                }
                if (i21 != 0) {
                    nVar2 = nVar3;
                    i24 = i12;
                    z13 = z11;
                    f14 = f16;
                    fE = androidx.compose.ui.unit.h.f42689b.e();
                    kyVar3 = kyVar2;
                } else {
                    nVar2 = nVar3;
                    i24 = i12;
                    z13 = z11;
                    kyVar3 = kyVar2;
                    f14 = f16;
                    fE = f12;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1199441071, i24, -1, "androidx.compose.material3.SliderDefaults.CenteredTrack (Slider.kt:1557)");
            }
            int i215 = i24 << 3;
            a0Var3 = a0Var2;
            function4 = function3;
            Q(t00Var, fE, a0Var3, z13, kyVar3, function4, nVar2, f13, f14, true, true, c0VarR, (i24 & 14) | 805306368 | ((i24 >> 21) & com.planner5d.library.engine.input.f.b.B) | (i215 & 896) | (i215 & 7168) | (57344 & i215) | (458752 & i215) | (3670016 & i215) | (29360128 & i215) | (i215 & 234881024), ((i24 >> 24) & com.planner5d.library.engine.input.f.b.B) | 6);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            f15 = fE;
        } else {
            c0VarR.u();
            nVar2 = nVar;
            a0Var3 = a0Var2;
            z13 = z11;
            kyVar3 = kyVar2;
            function4 = function3;
            f14 = f11;
            f15 = f12;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.bz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return kz.A(this.f26395a, t00Var, a0Var3, z13, kyVar3, function4, nVar2, f13, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
