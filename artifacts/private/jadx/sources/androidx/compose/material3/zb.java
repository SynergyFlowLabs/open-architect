package androidx.compose.material3;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nWideNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WideNavigationRail.kt\nandroidx/compose/material3/DefaultModalWideNavigationRailOverride\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 9 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1263:1\n1282#2,6:1264\n1282#2,6:1271\n1282#2,6:1277\n1282#2,6:1283\n1282#2,6:1289\n1282#2,6:1295\n1282#2,6:1301\n1282#2,6:1307\n1282#2,3:1361\n1285#2,3:1365\n1282#2,6:1368\n1282#2,6:1374\n1282#2,6:1380\n1282#2,6:1386\n1282#2,6:1392\n1282#2,6:1398\n75#3:1270\n70#4:1313\n67#4,9:1314\n77#4:1353\n79#5,6:1323\n86#5,3:1338\n89#5,2:1347\n93#5:1352\n347#6,9:1329\n356#6,3:1349\n4206#7,6:1341\n607#8:1354\n604#8,6:1355\n605#9:1364\n85#10:1404\n85#10:1405\n*S KotlinDebug\n*F\n+ 1 WideNavigationRail.kt\nandroidx/compose/material3/DefaultModalWideNavigationRailOverride\n*L\n508#1:1264,6\n514#1:1271,6\n527#1:1277,6\n528#1:1283,6\n529#1:1289,6\n536#1:1295,6\n558#1:1301,6\n560#1:1307,6\n584#1:1361,3\n584#1:1365,3\n585#1:1368,6\n586#1:1374,6\n588#1:1380,6\n592#1:1386,6\n593#1:1392,6\n596#1:1398,6\n510#1:1270\n579#1:1313\n579#1:1314,9\n579#1:1353\n579#1:1323,6\n579#1:1338,3\n579#1:1347,2\n579#1:1352\n579#1:1329,9\n579#1:1349,3\n579#1:1341,6\n584#1:1354\n584#1:1355,6\n584#1:1364\n527#1:1404\n528#1:1405\n*E\n"})
public final class zb implements yl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final zb f35075a = new zb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35076b = 0;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1", f = "WideNavigationRail.kt", i = {0}, l = {com.google.android.vending.licensing.k.f115073b}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f35078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f35079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.p<Boolean> f35080d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ fm f35081e;

        /* JADX INFO: renamed from: androidx.compose.material3.zb$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1$1", f = "WideNavigationRail.kt", i = {}, l = {565, 567}, m = "invokeSuspend", n = {}, s = {})
        static final class C0267a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f35082a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f35083b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ fm f35084c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0267a(boolean z10, fm fmVar, kotlin.coroutines.d<? super C0267a> dVar) {
                super(2, dVar);
                this.f35083b = z10;
                this.f35084c = fmVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0267a(this.f35083b, this.f35084c, dVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
            
                if (r6.e(r5) == r0) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
            
                if (r6.g(r5) == r0) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
            
                return r0;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r4 = 2
                    int r1 = r5.f35082a
                    r2 = 2
                    r3 = 1
                    r4 = 3
                    if (r1 == 0) goto L1f
                    if (r1 == r3) goto L1b
                    r4 = 2
                    if (r1 != r2) goto L13
                    r4 = 6
                    goto L1b
                L13:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L1b:
                    kotlin.ResultKt.m(r6)
                    goto L41
                L1f:
                    kotlin.ResultKt.m(r6)
                    r4 = 5
                    boolean r6 = r5.f35083b
                    r4 = 1
                    if (r6 == 0) goto L34
                    androidx.compose.material3.fm r6 = r5.f35084c
                    r5.f35082a = r3
                    java.lang.Object r5 = r6.e(r5)
                    r4 = 7
                    if (r5 != r0) goto L41
                    goto L40
                L34:
                    androidx.compose.material3.fm r6 = r5.f35084c
                    r4 = 4
                    r5.f35082a = r2
                    r4 = 0
                    java.lang.Object r5 = r6.g(r5)
                    if (r5 != r0) goto L41
                L40:
                    return r0
                L41:
                    r4 = 0
                    kotlin.Unit r5 = kotlin.Unit.f312394a
                    r4 = 5
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.zb.a.C0267a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0267a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlinx.coroutines.channels.p<Boolean> pVar, fm fmVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f35080d = pVar;
            this.f35081e = fmVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f35080d, this.f35081e, dVar);
            aVar.f35079c = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0043  */
        /* JADX WARN: Code duplicated, block: B:15:0x004d  */
        /* JADX WARN: Code duplicated, block: B:17:0x0068  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0041 -> B:13:0x0045). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0043
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r9 = 6
                int r1 = r10.f35078b
                r2 = 2
                r2 = 1
                if (r1 == 0) goto L25
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r10.f35077a
                kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                java.lang.Object r3 = r10.f35079c
                kotlinx.coroutines.s0 r3 = (kotlinx.coroutines.s0) r3
                r9 = 7
                kotlin.ResultKt.m(r11)
                goto L45
            L1a:
                r9 = 2
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "/msre/ n tneoucsue/iceowf or//oai/etv hl/lbrk ie/o "
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L25:
                kotlin.ResultKt.m(r11)
                r9 = 2
                java.lang.Object r11 = r10.f35079c
                kotlinx.coroutines.s0 r11 = (kotlinx.coroutines.s0) r11
                kotlinx.coroutines.channels.p<java.lang.Boolean> r1 = r10.f35080d
                r9 = 0
                kotlinx.coroutines.channels.r r1 = r1.iterator()
                r3 = r11
            L35:
                r10.f35079c = r3
                r10.f35077a = r1
                r10.f35078b = r2
                r9 = 5
                java.lang.Object r11 = r1.c(r10)
                r9 = 1
                if (r11 != r0) goto L45
                r9 = 0
                return r0
            L45:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L7d
                java.lang.Object r11 = r1.next()
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                r9 = 1
                kotlinx.coroutines.channels.p<java.lang.Boolean> r4 = r10.f35080d
                java.lang.Object r4 = r4.w()
                r9 = 7
                java.lang.Object r4 = kotlinx.coroutines.channels.t.h(r4)
                r9 = 5
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                if (r4 == 0) goto L6c
                boolean r11 = r4.booleanValue()
            L6c:
                r9 = 1
                androidx.compose.material3.zb$a$a r6 = new androidx.compose.material3.zb$a$a
                androidx.compose.material3.fm r4 = r10.f35081e
                r5 = 0
                r6.<init>(r11, r4, r5)
                r7 = 3
                r8 = 0
                r4 = 0
                kotlinx.coroutines.i.e(r3, r4, r5, r6, r7, r8)
                r9 = 6
                goto L35
            L7d:
                kotlin.Unit r10 = kotlin.Unit.f312394a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.zb.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$4$1$1", f = "WideNavigationRail.kt", i = {}, l = {592}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zl f35086b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(zl zlVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f35086b = zlVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f35086b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f35085a;
            if (i10 == 0) {
                ResultKt.m(obj);
                qb0 qb0VarK = this.f35086b.k();
                this.f35085a = 1;
                if (qb0VarK.g(this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$5$1$1", f = "WideNavigationRail.kt", i = {}, l = {594}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f35088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f35089c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar, float f10, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f35088b = cVar;
            this.f35089c = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f35088b, this.f35089c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f35087a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar = this.f35088b;
                Float fE = kotlin.coroutines.jvm.internal.b.e(this.f35089c);
                this.f35087a = 1;
                if (cVar.C(fE, this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$6$1$1", f = "WideNavigationRail.kt", i = {}, l = {597}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f35091b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f35091b = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f35091b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f35090a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar = this.f35091b;
                Float fE = kotlin.coroutines.jvm.internal.b.e(0.0f);
                this.f35090a = 1;
                if (androidx.compose.animation.core.c.i(cVar, fE, null, null, null, this, 14, null) == objL) {
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
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nWideNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WideNavigationRail.kt\nandroidx/compose/material3/DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$7\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1263:1\n70#2:1264\n67#2,9:1265\n77#2:1304\n79#3,6:1274\n86#3,3:1289\n89#3,2:1298\n93#3:1303\n347#4,9:1280\n356#4,3:1300\n4206#5,6:1292\n*S KotlinDebug\n*F\n+ 1 WideNavigationRail.kt\nandroidx/compose/material3/DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$7\n*L\n601#1:1264\n601#1:1265,9\n601#1:1304\n601#1:1274,6\n601#1:1289,3\n601#1:1298,2\n601#1:1303\n601#1:1280,9\n601#1:1300,3\n601#1:1292,6\n*E\n"})
    static final class e implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zl f35092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ fm f35093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f35094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f35095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ vs f35096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Float, kotlin.coroutines.d<? super Unit>, Object> f35097f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f35098g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<Boolean> f35099h;

        @SourceDebugExtension({"SMAP\nWideNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WideNavigationRail.kt\nandroidx/compose/material3/DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$7$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1263:1\n70#2:1264\n67#2,9:1265\n77#2:1304\n79#3,6:1274\n86#3,3:1289\n89#3,2:1298\n93#3:1303\n347#4,9:1280\n356#4,3:1300\n4206#5,6:1292\n*S KotlinDebug\n*F\n+ 1 WideNavigationRail.kt\nandroidx/compose/material3/DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$7$1$1\n*L\n627#1:1264\n627#1:1265,9\n627#1:1304\n627#1:1274,6\n627#1:1289,3\n627#1:1298,2\n627#1:1303\n627#1:1280,9\n627#1:1300,3\n627#1:1292,6\n*E\n"})
        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ zl f35100a;

            a(zl zlVar) {
                this.f35100a = zlVar;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(208840989, i10, -1, "androidx.compose.material3.DefaultModalWideNavigationRailOverride.ModalWideNavigationRail.<anonymous>.<anonymous>.<anonymous> (WideNavigationRail.kt:626)");
                }
                androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(androidx.compose.ui.a0.E, 0.0f, this.f35100a.e(), 0.0f, 0.0f, 13, null);
                zl zlVar = this.f35100a;
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                androidx.compose.runtime.b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarV);
                androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A = aVar.a();
                if (c0Var.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var.q();
                if (c0Var.P()) {
                    c0Var.q0(function0A);
                } else {
                    c0Var.l();
                }
                androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
                androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2H = zlVar.h();
                if (function2H == null) {
                    c0Var.E(-1627801290);
                } else {
                    c0Var.E(-2130719701);
                    function2H.invoke(c0Var, 0);
                }
                c0Var.A();
                c0Var.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
                c(c0Var, num.intValue());
                return Unit.f312394a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(zl zlVar, fm fmVar, Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar, vs vsVar, Function2<? super Float, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, androidx.compose.runtime.n7<Boolean> n7Var) {
            this.f35092a = zlVar;
            this.f35093b = fmVar;
            this.f35094c = function1;
            this.f35095d = cVar;
            this.f35096e = vsVar;
            this.f35097f = function2;
            this.f35098g = function3;
            this.f35099h = n7Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            boolean zQ;
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1345045690, i10, -1, "androidx.compose.material3.DefaultModalWideNavigationRailOverride.ModalWideNavigationRail.<anonymous> (WideNavigationRail.kt:600)");
            }
            androidx.compose.ui.a0 a0VarC = androidx.compose.foundation.layout.u7.c(androidx.compose.foundation.layout.i6.f(androidx.compose.ui.a0.E, 0.0f, 1, null));
            zl zlVar = this.f35092a;
            fm fmVar = this.f35093b;
            Function1<kotlin.coroutines.d<? super Unit>, Object> function1 = this.f35094c;
            androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar = this.f35095d;
            vs vsVar = this.f35096e;
            Function2<Float, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f35097f;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function3 = this.f35098g;
            androidx.compose.runtime.n7<Boolean> n7Var = this.f35099h;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarC);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            if (zlVar.j()) {
                zQ = fmVar.c() != xb0.Collapsed;
            } else {
                zQ = zb.q(n7Var);
            }
            ib0.z(zlVar.c().g(), function1, zQ, c0Var, 0);
            ib0.s(zlVar.j() || zb.q(n7Var), zlVar.j(), cVar, vsVar, function2, zlVar.i(), fmVar, zlVar.c(), zlVar.g(), ib0.f28531g, androidx.compose.runtime.internal.w.e(208840989, true, new a(zlVar), c0Var, 54), zlVar.l(), zlVar.j(), zlVar.a(), function3, c0Var, (androidx.compose.animation.core.c.f12810o << 6) | 805309440, 6);
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$animateToDismiss$1$1", f = "WideNavigationRail.kt", i = {}, l = {531, 533}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zl f35102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ fm f35103c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(zl zlVar, fm fmVar, kotlin.coroutines.d<? super f> dVar) {
            super(1, dVar);
            this.f35102b = zlVar;
            this.f35103c = fmVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new f(this.f35102b, this.f35103c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        
            if (r6.g(r5) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f35101a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L1c
                r4 = 2
                if (r1 != r2) goto L14
                r4 = 4
                kotlin.ResultKt.m(r6)
                goto L4d
            L14:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1c:
                kotlin.ResultKt.m(r6)
                r4 = 4
                goto L3c
            L21:
                r4 = 2
                kotlin.ResultKt.m(r6)
                r4 = 3
                androidx.compose.material3.zl r6 = r5.f35102b
                boolean r6 = r6.j()
                if (r6 == 0) goto L3c
                androidx.compose.material3.fm r6 = r5.f35103c
                r4 = 1
                r5.f35101a = r3
                java.lang.Object r6 = r6.g(r5)
                r4 = 6
                if (r6 != r0) goto L3c
                r4 = 5
                goto L4c
            L3c:
                androidx.compose.material3.zl r6 = r5.f35102b
                r4 = 0
                androidx.compose.material3.qb0 r6 = r6.k()
                r5.f35101a = r2
                java.lang.Object r5 = r6.g(r5)
                r4 = 3
                if (r5 != r0) goto L4d
            L4c:
                return r0
            L4d:
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.zb.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1", f = "WideNavigationRail.kt", i = {}, l = {538, 539}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<Float, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ float f35105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zl f35106c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ fm f35107d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(zl zlVar, fm fmVar, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f35106c = zlVar;
            this.f35107d = fmVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            g gVar = new g(this.f35106c, this.f35107d, dVar);
            gVar.f35105b = ((Number) obj).floatValue();
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Float f10, kotlin.coroutines.d<? super Unit> dVar) {
            return k(f10.floatValue(), dVar);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x004d  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        
            if (r6.g(r5) == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r4 = 3
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r4 = 5
                int r1 = r5.f35104a
                r4 = 6
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                r4 = 1
                if (r1 == r3) goto L1f
                r4 = 6
                if (r1 != r2) goto L17
                kotlin.ResultKt.m(r6)
                goto L5e
            L17:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1f:
                kotlin.ResultKt.m(r6)
                goto L3f
            L23:
                r4 = 7
                kotlin.ResultKt.m(r6)
                r4 = 5
                float r6 = r5.f35105b
                androidx.compose.material3.zl r1 = r5.f35106c
                boolean r1 = r1.j()
                if (r1 == 0) goto L5e
                androidx.compose.material3.fm r1 = r5.f35107d
                r4 = 1
                r5.f35104a = r3
                r4 = 4
                java.lang.Object r6 = r1.t(r6, r5)
                if (r6 != r0) goto L3f
                goto L5d
            L3f:
                r4 = 7
                androidx.compose.material3.fm r6 = r5.f35107d
                androidx.compose.material3.xb0 r6 = r6.c()
                r4 = 2
                boolean r6 = androidx.compose.material3.wb0.b(r6)
                if (r6 != 0) goto L5e
                r4 = 1
                androidx.compose.material3.zl r6 = r5.f35106c
                r4 = 0
                androidx.compose.material3.qb0 r6 = r6.k()
                r5.f35104a = r2
                java.lang.Object r5 = r6.g(r5)
                if (r5 != r0) goto L5e
            L5d:
                return r0
            L5e:
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.zb.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object k(float f10, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(Float.valueOf(f10), dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private zb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(kotlinx.coroutines.channels.p pVar, zl zlVar) {
        pVar.p(Boolean.valueOf(wb0.b(zlVar.k().c())));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(kotlinx.coroutines.s0 s0Var, zl zlVar) {
        kotlinx.coroutines.k.f(s0Var, null, null, new b(zlVar, null), 3, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(kotlinx.coroutines.s0 s0Var, androidx.compose.animation.core.c cVar, float f10) {
        kotlinx.coroutines.k.f(s0Var, null, null, new c(cVar, f10, null), 3, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(kotlinx.coroutines.s0 s0Var, androidx.compose.animation.core.c cVar) {
        kotlinx.coroutines.k.f(s0Var, null, null, new d(cVar, null), 3, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(zb zbVar, zl zlVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        zbVar.a(zlVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(androidx.compose.runtime.n7 n7Var) {
        return ((Number) n7Var.getValue()).floatValue() == 0.0f;
    }

    private static final boolean o(androidx.compose.runtime.n7<Boolean> n7Var) {
        return n7Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(androidx.compose.runtime.n7 n7Var) {
        return ((Number) n7Var.getValue()).floatValue() >= 0.3f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(androidx.compose.runtime.n7<Boolean> n7Var) {
        return n7Var.getValue().booleanValue();
    }

    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.coroutines.d, kotlin.jvm.functions.Function1, kotlinx.coroutines.channels.j] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // androidx.compose.material3.yl
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public void a(@NotNull final zl zlVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        final zl zlVar2;
        Function2<androidx.compose.runtime.c0, Integer, Unit> function2D;
        int i12;
        ?? r10;
        boolean z10;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1751235721);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c0VarR.D(zlVar) : c0VarR.k0(zlVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1751235721, i11, -1, "androidx.compose.material3.DefaultModalWideNavigationRailOverride.ModalWideNavigationRail (WideNavigationRail.kt:503)");
            }
            if (zlVar.j()) {
                c0VarR.E(95781714);
                c0VarR.A();
                function2D = zlVar.d();
            } else {
                c0VarR.E(95826602);
                boolean zD = c0VarR.D(zlVar.d());
                Object objI0 = c0VarR.i0();
                if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.runtime.f3.a(zlVar.d());
                    c0VarR.Y(objI0);
                }
                function2D = (Function2) objI0;
                c0VarR.A();
            }
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = function2D;
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m());
            androidx.compose.animation.core.y0 y0VarB = hm.b(d0.h1.DefaultSpatial, c0VarR, 6);
            boolean zD2 = c0VarR.D(zlVar.k());
            Object objI1 = c0VarR.i0();
            if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new fm(zlVar.k(), dVar, y0VarB);
                c0VarR.Y(objI1);
            }
            fm fmVar = (fm) objI1;
            final androidx.compose.runtime.n7<Float> n7VarF = androidx.compose.animation.core.f.f(!wb0.b(zlVar.k().c()) ? 0.0f : 1.0f, hm.b(d0.h1.DefaultEffects, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
            Object objI2 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI2 == aVar.a()) {
                objI2 = androidx.compose.runtime.w6.e(new Function0() { // from class: androidx.compose.material3.sb
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(zb.n(n7VarF));
                    }
                });
                c0VarR.Y(objI2);
            }
            androidx.compose.runtime.n7 n7Var = (androidx.compose.runtime.n7) objI2;
            Object objI3 = c0VarR.i0();
            if (objI3 == aVar.a()) {
                objI3 = androidx.compose.runtime.w6.e(new Function0() { // from class: androidx.compose.material3.tb
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(zb.p(n7VarF));
                    }
                });
                c0VarR.Y(objI3);
            }
            androidx.compose.runtime.n7 n7Var2 = (androidx.compose.runtime.n7) objI3;
            int i13 = i11 & 14;
            boolean zK0 = (i13 == 4 || ((i11 & 8) != 0 && c0VarR.k0(zlVar))) | c0VarR.k0(fmVar);
            Object objI4 = c0VarR.i0();
            if (zK0 || objI4 == aVar.a()) {
                objI4 = new f(zlVar, fmVar, null);
                c0VarR.Y(objI4);
            }
            Function1 function1 = (Function1) objI4;
            boolean zK1 = (i13 == 4 || ((i11 & 8) != 0 && c0VarR.k0(zlVar))) | c0VarR.k0(fmVar);
            Object objI5 = c0VarR.i0();
            if (zK1 || objI5 == aVar.a()) {
                objI5 = new g(zlVar, fmVar, null);
                c0VarR.Y(objI5);
            }
            Function2 function3 = (Function2) objI5;
            if (zlVar.j() || !o(n7Var)) {
                i12 = i13;
                r10 = 0;
                c0VarR.E(97788313);
                c0VarR.A();
            } else {
                c0VarR.E(97400069);
                i12 = i13;
                r10 = 0;
                ib0.L(zlVar.i(), false, false, zlVar.c(), zlVar.b(), zlVar.h(), zlVar.l(), zlVar.a(), function2, c0VarR, 432);
                c0VarR = c0VarR;
                c0VarR.A();
            }
            Object objI6 = c0VarR.i0();
            if (objI6 == aVar.a()) {
                objI6 = kotlinx.coroutines.channels.s.d(-1, r10, r10, 6, r10);
                c0VarR.Y(objI6);
            }
            final kotlinx.coroutines.channels.p pVar = (kotlinx.coroutines.channels.p) objI6;
            if (zlVar.j()) {
                c0VarR.E(97908438);
                boolean zK2 = c0VarR.k0(pVar) | c0VarR.k0(fmVar);
                Object objI7 = c0VarR.i0();
                if (zK2 || objI7 == aVar.a()) {
                    objI7 = new a(pVar, fmVar, r10);
                    c0VarR.Y(objI7);
                }
                androidx.compose.runtime.b2.i(pVar, (Function2) objI7, c0VarR, 0);
                c0VarR.A();
            } else {
                c0VarR.E(98341849);
                c0VarR.A();
            }
            if (o(n7Var)) {
                zlVar2 = zlVar;
                c0VarR.E(101334713);
                c0VarR.A();
            } else {
                c0VarR.E(98512256);
                if (zlVar.j()) {
                    z10 = true;
                    c0VarR.E(98809081);
                    c0VarR.A();
                } else {
                    c0VarR.E(98472731);
                    androidx.compose.ui.a0 a0VarC = androidx.compose.foundation.v.c(androidx.compose.ui.a0.E, zlVar.c().c(), zlVar.b());
                    androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarC);
                    androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                    Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar2.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
                    androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    z10 = true;
                    androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.d(androidx.compose.foundation.layout.i6.D(zlVar.i(), ib0.f28529e, 0.0f, 2, r10), 0.0f, 1, r10), c0VarR, 0);
                    c0VarR.o();
                    c0VarR.A();
                }
                Object objI8 = c0VarR.i0();
                if (objI8 == aVar.a()) {
                    objI8 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI8);
                }
                final kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI8;
                Object objI9 = c0VarR.i0();
                if (objI9 == aVar.a()) {
                    objI9 = androidx.compose.animation.core.d.b(0.0f, 0.0f, 2, r10);
                    c0VarR.Y(objI9);
                }
                final androidx.compose.animation.core.c cVar = (androidx.compose.animation.core.c) objI9;
                Object objI10 = c0VarR.i0();
                if (objI10 == aVar.a()) {
                    objI10 = new vs();
                    c0VarR.Y(objI10);
                }
                vs vsVar = (vs) objI10;
                int i14 = i12;
                boolean zK3 = c0VarR.k0(pVar) | ((i14 == 4 || ((i11 & 8) != 0 && c0VarR.k0(zlVar))) ? z10 : false);
                Object objI11 = c0VarR.i0();
                if (zK3 || objI11 == aVar.a()) {
                    objI11 = new Function0() { // from class: androidx.compose.material3.ub
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return zb.i(pVar, zlVar);
                        }
                    };
                    c0VarR.Y(objI11);
                }
                boolean z11 = false;
                androidx.compose.runtime.b2.m((Function0) objI11, c0VarR, 0);
                am amVarF = zlVar.f();
                boolean zK4 = c0VarR.k0(s0Var);
                if (i14 == 4 || ((i11 & 8) != 0 && c0VarR.k0(zlVar))) {
                    z11 = z10;
                }
                boolean z12 = zK4 | z11;
                Object objI12 = c0VarR.i0();
                if (z12 || objI12 == aVar.a()) {
                    objI12 = new Function0() { // from class: androidx.compose.material3.vb
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return zb.j(s0Var, zlVar);
                        }
                    };
                    c0VarR.Y(objI12);
                }
                Function0 function0 = (Function0) objI12;
                boolean zK5 = c0VarR.k0(s0Var) | c0VarR.k0(cVar);
                Object objI13 = c0VarR.i0();
                if (zK5 || objI13 == aVar.a()) {
                    objI13 = new Function1() { // from class: androidx.compose.material3.wb
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return zb.k(s0Var, cVar, ((Float) obj).floatValue());
                        }
                    };
                    c0VarR.Y(objI13);
                }
                Function1 function4 = (Function1) objI13;
                boolean zK6 = c0VarR.k0(s0Var) | c0VarR.k0(cVar);
                Object objI14 = c0VarR.i0();
                if (zK6 || objI14 == aVar.a()) {
                    objI14 = new Function0() { // from class: androidx.compose.material3.xb
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return zb.l(s0Var, cVar);
                        }
                    };
                    c0VarR.Y(objI14);
                }
                e eVar = new e(zlVar, fmVar, function1, cVar, vsVar, function3, function2, n7Var2);
                zlVar2 = zlVar;
                dc0.e(function0, amVarF, function4, (Function0) objI14, vsVar, androidx.compose.runtime.internal.w.e(1345045690, z10, eVar, c0VarR, 54), c0VarR, 221184);
                c0VarR.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            zlVar2 = zlVar;
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.yb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return zb.m(this.f34747a, zlVar2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
