package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nWindowRecomposer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/WindowRecomposer_androidKt\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,436:1\n32#2:437\n381#3,7:438\n57#4,4:445\n78#4,5:450\n1#5:449\n*S KotlinDebug\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/WindowRecomposer_androidKt\n*L\n97#1:437\n98#1:438,7\n292#1:445,4\n348#1:450,5\n*E\n"})
public final class c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Map<Context, kotlinx.coroutines.flow.z0<Float>> f40343a = new LinkedHashMap();

    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f40344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.c5 f40345b;

        a(View view, androidx.compose.runtime.c5 c5Var) {
            this.f40344a = view;
            this.f40345b = c5Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f40344a.removeOnAttachStateChangeListener(this);
            this.f40345b.B0();
        }
    }

    public static final class b implements androidx.lifecycle.j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.s0 f40346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z3 f40347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.c5 f40348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.h<a3> f40349d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f40350e;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f40351a;

            static {
                int[] iArr = new int[androidx.lifecycle.c0.a.values().length];
                try {
                    iArr[androidx.lifecycle.c0.a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.lifecycle.c0.a.ON_START.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.lifecycle.c0.a.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[androidx.lifecycle.c0.a.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[androidx.lifecycle.c0.a.ON_PAUSE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[androidx.lifecycle.c0.a.ON_RESUME.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[androidx.lifecycle.c0.a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f40351a = iArr;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.platform.c5$b$b, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", i = {0}, l = {388}, m = "invokeSuspend", n = {"durationScaleJob"}, s = {"L$0"})
        static final class C0316b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f40352a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f40353b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.h<a3> f40354c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.c5 f40355d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.lifecycle.o0 f40356e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f40357f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ View f40358g;

            /* JADX INFO: renamed from: androidx.compose.ui.platform.c5$b$b$a */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", i = {}, l = {383}, m = "invokeSuspend", n = {}, s = {})
            static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f40359a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.z0<Float> f40360b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ a3 f40361c;

                /* JADX INFO: renamed from: androidx.compose.ui.platform.c5$b$b$a$a, reason: collision with other inner class name */
                static final class C0317a<T> implements kotlinx.coroutines.flow.j {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ a3 f40362a;

                    C0317a(a3 a3Var) {
                        this.f40362a = a3Var;
                    }

                    public final Object a(float f10, kotlin.coroutines.d<? super Unit> dVar) {
                        this.f40362a.a(f10);
                        return Unit.f312394a;
                    }

                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
                        return a(((Number) obj).floatValue(), dVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(kotlinx.coroutines.flow.z0<Float> z0Var, a3 a3Var, kotlin.coroutines.d<? super a> dVar) {
                    super(2, dVar);
                    this.f40360b = z0Var;
                    this.f40361c = a3Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new a(this.f40360b, this.f40361c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f40359a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        kotlinx.coroutines.flow.z0<Float> z0Var = this.f40360b;
                        C0317a c0317a = new C0317a(this.f40361c);
                        this.f40359a = 1;
                        if (z0Var.collect(c0317a, this) == objL) {
                            return objL;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    throw new kotlin.a0();
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0316b(kotlin.jvm.internal.i1.h<a3> hVar, androidx.compose.runtime.c5 c5Var, androidx.lifecycle.o0 o0Var, b bVar, View view, kotlin.coroutines.d<? super C0316b> dVar) {
                super(2, dVar);
                this.f40354c = hVar;
                this.f40355d = c5Var;
                this.f40356e = o0Var;
                this.f40357f = bVar;
                this.f40358g = view;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C0316b c0316b = new C0316b(this.f40354c, this.f40355d, this.f40356e, this.f40357f, this.f40358g, dVar);
                c0316b.f40353b = obj;
                return c0316b;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1 */
            /* JADX WARN: Type inference failed for: r1v11, types: [kotlinx.coroutines.p2] */
            /* JADX WARN: Type inference failed for: r1v14 */
            /* JADX WARN: Type inference failed for: r1v15 */
            /* JADX WARN: Type inference failed for: r1v16 */
            /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.p2] */
            /* JADX WARN: Type inference failed for: r1v3 */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Throwable th2;
                ?? r10;
                kotlinx.coroutines.p2 p2VarF;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                ?? r11 = this.f40352a;
                try {
                    if (r11 == 0) {
                        ResultKt.m(obj);
                        kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f40353b;
                        try {
                            a3 a3Var = this.f40354c.f312751a;
                            if (a3Var != null) {
                                kotlinx.coroutines.flow.z0 z0VarE = c5.e(this.f40358g.getContext().getApplicationContext());
                                a3Var.a(((Number) z0VarE.getValue()).floatValue());
                                int i10 = 3 | 0;
                                p2VarF = kotlinx.coroutines.k.f(s0Var, null, null, new a(z0VarE, a3Var, null), 3, null);
                            } else {
                                p2VarF = null;
                            }
                            androidx.compose.runtime.c5 c5Var = this.f40355d;
                            this.f40353b = p2VarF;
                            this.f40352a = 1;
                            r11 = p2VarF;
                            if (c5Var.v1(this) == objL) {
                                return objL;
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            r10 = 0;
                            if (r10 != 0) {
                                kotlinx.coroutines.p2.a.b(r10, null, 1, null);
                            }
                            this.f40356e.getLifecycle().g(this.f40357f);
                            throw th2;
                        }
                    } else {
                        if (r11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlinx.coroutines.p2 p2Var = (kotlinx.coroutines.p2) this.f40353b;
                        ResultKt.m(obj);
                        r11 = p2Var;
                    }
                    if (r11 != 0) {
                        kotlinx.coroutines.p2.a.b(r11, null, 1, null);
                    }
                    this.f40356e.getLifecycle().g(this.f40357f);
                    return Unit.f312394a;
                } catch (Throwable th4) {
                    th2 = th4;
                    r10 = r11;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0316b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        b(kotlinx.coroutines.s0 s0Var, androidx.compose.runtime.z3 z3Var, androidx.compose.runtime.c5 c5Var, kotlin.jvm.internal.i1.h<a3> hVar, View view) {
            this.f40346a = s0Var;
            this.f40347b = z3Var;
            this.f40348c = c5Var;
            this.f40349d = hVar;
            this.f40350e = view;
        }

        @Override // androidx.lifecycle.j0
        public void e(androidx.lifecycle.o0 o0Var, androidx.lifecycle.c0.a aVar) {
            switch (a.f40351a[aVar.ordinal()]) {
                case 1:
                    kotlinx.coroutines.k.f(this.f40346a, null, kotlinx.coroutines.u0.UNDISPATCHED, new C0316b(this.f40349d, this.f40348c, o0Var, this, this.f40350e, null), 1, null);
                    return;
                case 2:
                    androidx.compose.runtime.z3 z3Var = this.f40347b;
                    if (z3Var != null) {
                        z3Var.d();
                    }
                    this.f40348c.r1();
                    return;
                case 3:
                    this.f40348c.Z0();
                    return;
                case 4:
                    this.f40348c.B0();
                    return;
                case 5:
                case 6:
                case 7:
                    return;
                default:
                    throw new kotlin.k0();
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", i = {0, 1}, l = {114, 121}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super Float>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f40363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f40364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f40365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ContentResolver f40366d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Uri f40367e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f40368f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.p<Unit> f40369g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Context f40370h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ContentResolver contentResolver, Uri uri, d dVar, kotlinx.coroutines.channels.p<Unit> pVar, Context context, kotlin.coroutines.d<? super c> dVar2) {
            super(2, dVar2);
            this.f40366d = contentResolver;
            this.f40367e = uri;
            this.f40368f = dVar;
            this.f40369g = pVar;
            this.f40370h = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f40366d, this.f40367e, this.f40368f, this.f40369g, this.f40370h, dVar);
            cVar.f40365c = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0061  */
        /* JADX WARN: Code duplicated, block: B:22:0x0062  */
        /* JADX WARN: Code duplicated, block: B:25:0x006e A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #0 {all -> 0x001f, blocks: (B:8:0x0019, B:19:0x0052, B:23:0x0065, B:25:0x006e, B:15:0x0035, B:18:0x004c), top: B:32:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:28:0x0096  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
        
            if (r4.emit(r10, r9) == r0) goto L27;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0093 -> B:9:0x001d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r9.f40364b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L39
                if (r1 == r3) goto L2a
                r8 = 7
                if (r1 != r2) goto L22
                java.lang.Object r1 = r9.f40363a
                kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                r8 = 2
                java.lang.Object r4 = r9.f40365c
                r8 = 7
                kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
                r8 = 4
                kotlin.ResultKt.m(r10)     // Catch: java.lang.Throwable -> L1f
            L1d:
                r10 = r4
                goto L52
            L1f:
                r10 = move-exception
                goto La2
            L22:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L2a:
                java.lang.Object r1 = r9.f40363a
                r8 = 5
                kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                r8 = 2
                java.lang.Object r4 = r9.f40365c
                r8 = 4
                kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
                kotlin.ResultKt.m(r10)     // Catch: java.lang.Throwable -> L1f
                goto L65
            L39:
                kotlin.ResultKt.m(r10)
                r8 = 0
                java.lang.Object r10 = r9.f40365c
                kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.j) r10
                android.content.ContentResolver r1 = r9.f40366d
                android.net.Uri r4 = r9.f40367e
                r5 = 0
                androidx.compose.ui.platform.c5$d r6 = r9.f40368f
                r8 = 2
                r1.registerContentObserver(r4, r5, r6)
                kotlinx.coroutines.channels.p<kotlin.Unit> r1 = r9.f40369g     // Catch: java.lang.Throwable -> L1f
                kotlinx.coroutines.channels.r r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1f
            L52:
                r8 = 0
                r9.f40365c = r10     // Catch: java.lang.Throwable -> L1f
                r9.f40363a = r1     // Catch: java.lang.Throwable -> L1f
                r9.f40364b = r3     // Catch: java.lang.Throwable -> L1f
                r8 = 0
                java.lang.Object r4 = r1.c(r9)     // Catch: java.lang.Throwable -> L1f
                r8 = 4
                if (r4 != r0) goto L62
                goto L95
            L62:
                r7 = r4
                r4 = r10
                r10 = r7
            L65:
                r8 = 3
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L1f
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L1f
                if (r10 == 0) goto L96
                r8 = 3
                r1.next()     // Catch: java.lang.Throwable -> L1f
                android.content.Context r10 = r9.f40370h     // Catch: java.lang.Throwable -> L1f
                r8 = 5
                android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L1f
                r8 = 1
                java.lang.String r5 = "animator_duration_scale"
                r8 = 1
                r6 = 1065353216(0x3f800000, float:1.0)
                float r10 = android.provider.Settings.Global.getFloat(r10, r5, r6)     // Catch: java.lang.Throwable -> L1f
                java.lang.Float r10 = kotlin.coroutines.jvm.internal.b.e(r10)     // Catch: java.lang.Throwable -> L1f
                r9.f40365c = r4     // Catch: java.lang.Throwable -> L1f
                r8 = 1
                r9.f40363a = r1     // Catch: java.lang.Throwable -> L1f
                r9.f40364b = r2     // Catch: java.lang.Throwable -> L1f
                r8 = 5
                java.lang.Object r10 = r4.emit(r10, r9)     // Catch: java.lang.Throwable -> L1f
                if (r10 != r0) goto L1d
            L95:
                return r0
            L96:
                android.content.ContentResolver r10 = r9.f40366d
                r8 = 2
                androidx.compose.ui.platform.c5$d r9 = r9.f40368f
                r10.unregisterContentObserver(r9)
                kotlin.Unit r9 = kotlin.Unit.f312394a
                r8 = 0
                return r9
            La2:
                android.content.ContentResolver r0 = r9.f40366d
                androidx.compose.ui.platform.c5$d r9 = r9.f40368f
                r0.unregisterContentObserver(r9)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.c5.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.flow.j<? super Float> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class d extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.p<Unit> f40371a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlinx.coroutines.channels.p<Unit> pVar, Handler handler) {
            super(handler);
            this.f40371a = pVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10, Uri uri) {
            this.f40371a.p(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, androidx.compose.ui.platform.a3] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r11v3, types: [kotlin.coroutines.CoroutineContext] */
    @NotNull
    public static final androidx.compose.runtime.c5 b(@NotNull View view, @NotNull CoroutineContext coroutineContext, @Nullable androidx.lifecycle.c0 c0Var) {
        androidx.compose.runtime.z3 z3Var;
        CoroutineContext coroutineContext2;
        ?? a3Var;
        if (coroutineContext.get(kotlin.coroutines.e.K2) == null || coroutineContext.get(androidx.compose.runtime.c3.C) == null) {
            coroutineContext = l0.f40623l.a().plus(coroutineContext);
        }
        androidx.compose.runtime.c3 c3Var = (androidx.compose.runtime.c3) coroutineContext.get(androidx.compose.runtime.c3.C);
        if (c3Var != null) {
            androidx.compose.runtime.z3 z3Var2 = new androidx.compose.runtime.z3(c3Var);
            z3Var2.b();
            z3Var = z3Var2;
        } else {
            z3Var = null;
        }
        kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        androidx.compose.ui.c0 c0Var2 = (androidx.compose.ui.c0) coroutineContext.get(androidx.compose.ui.c0.F);
        ?? r10 = c0Var2;
        if (c0Var2 == null) {
            a3Var = new a3();
            hVar.f312751a = a3Var;
        }
        if (z3Var != null) {
            r10 = a3Var;
            coroutineContext2 = z3Var;
        } else {
            r10 = a3Var;
            coroutineContext2 = kotlin.coroutines.h.f312451a;
        }
        CoroutineContext coroutineContextPlus = coroutineContext.plus(coroutineContext2).plus(r10);
        androidx.compose.runtime.c5 c5Var = new androidx.compose.runtime.c5(coroutineContextPlus);
        c5Var.Z0();
        kotlinx.coroutines.s0 s0VarA = kotlinx.coroutines.t0.a(coroutineContextPlus);
        if (c0Var == null) {
            androidx.lifecycle.o0 o0VarA = androidx.lifecycle.n2.a(view);
            c0Var = o0VarA != null ? o0VarA.getLifecycle() : null;
        }
        if (c0Var != null) {
            view.addOnAttachStateChangeListener(new a(view, c5Var));
            c0Var.c(new b(s0VarA, z3Var, c5Var, hVar, view));
            return c5Var;
        }
        s0.a.j("ViewTreeLifecycleOwner not found from " + view);
        throw new kotlin.a0();
    }

    public static /* synthetic */ androidx.compose.runtime.c5 c(View view, CoroutineContext coroutineContext, androidx.lifecycle.c0 c0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        if ((i10 & 2) != 0) {
            c0Var = null;
        }
        return b(view, coroutineContext, c0Var);
    }

    @Nullable
    public static final androidx.compose.runtime.p0 d(@NotNull View view) {
        androidx.compose.runtime.p0 p0VarF = f(view);
        if (p0VarF != null) {
            return p0VarF;
        }
        Object parent = view.getParent();
        while (p0VarF == null && (parent instanceof View)) {
            View view2 = (View) parent;
            p0VarF = f(view2);
            parent = view2.getParent();
        }
        return p0VarF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.coroutines.flow.z0<Float> e(Context context) {
        kotlinx.coroutines.flow.z0<Float> z0Var;
        Map<Context, kotlinx.coroutines.flow.z0<Float>> map = f40343a;
        synchronized (map) {
            try {
                kotlinx.coroutines.flow.z0<Float> z0VarQ1 = map.get(context);
                if (z0VarQ1 == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    kotlinx.coroutines.channels.p pVarD = kotlinx.coroutines.channels.s.d(-1, null, null, 6, null);
                    z0VarQ1 = kotlinx.coroutines.flow.k.Q1(kotlinx.coroutines.flow.k.K0(new c(contentResolver, uriFor, new d(pVarD, androidx.core.os.k.a(Looper.getMainLooper())), pVarD, context, null)), kotlinx.coroutines.t0.b(), kotlinx.coroutines.flow.u0.a.b(kotlinx.coroutines.flow.u0.f314834a, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, z0VarQ1);
                }
                z0Var = z0VarQ1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z0Var;
    }

    @Nullable
    public static final androidx.compose.runtime.p0 f(@NotNull View view) {
        Object tag = view.getTag(androidx.compose.ui.d0.b.G);
        if (tag instanceof androidx.compose.runtime.p0) {
            return (androidx.compose.runtime.p0) tag;
        }
        return null;
    }

    private static final View g(View view) {
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                break;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    @NotNull
    public static final androidx.compose.runtime.c5 h(@NotNull View view) {
        if (!view.isAttachedToWindow()) {
            s0.a.i("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        View viewG = g(view);
        androidx.compose.runtime.p0 p0VarF = f(viewG);
        if (p0VarF == null) {
            return b5.f40320a.b(viewG);
        }
        if (p0VarF instanceof androidx.compose.runtime.c5) {
            return (androidx.compose.runtime.c5) p0VarF;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }

    public static /* synthetic */ void i(View view) {
    }

    public static final void j(@NotNull View view, @Nullable androidx.compose.runtime.p0 p0Var) {
        view.setTag(androidx.compose.ui.d0.b.G, p0Var);
    }
}
