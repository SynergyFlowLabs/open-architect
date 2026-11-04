package com.planner5d.library.widget;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface q {

    public static final class a {

        /* JADX INFO: renamed from: com.planner5d.library.widget.q$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.CountDownTimer$createCountDownJob$1", f = "CountDownTimer.kt", i = {0}, l = {18}, m = "invokeSuspend", n = {"secondsLeft"}, s = {"I$0"})
        static final class C1747a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f258630a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f258631b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f258632c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ q f258633d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f258634e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1747a(int i10, q qVar, Function0<Unit> function0, kotlin.coroutines.d<? super C1747a> dVar) {
                super(2, dVar);
                this.f258632c = i10;
                this.f258633d = qVar;
                this.f258634e = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1747a(this.f258632c, this.f258633d, this.f258634e, dVar);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0030  */
            /* JADX WARN: Code duplicated, block: B:13:0x003f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003d -> B:15:0x0041). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r5 = 6
                    int r1 = r6.f258631b
                    r5 = 5
                    r2 = 1
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L16
                    r5 = 5
                    int r1 = r6.f258630a
                    r5 = 7
                    kotlin.ResultKt.m(r7)
                    r5 = 1
                    goto L41
                L16:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    r5 = 6
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L1f:
                    kotlin.ResultKt.m(r7)
                    r5 = 0
                    int r7 = r6.f258632c
                    r1 = r7
                    r1 = r7
                L27:
                    com.planner5d.library.widget.q r7 = r6.f258633d
                    r5 = 2
                    int r7 = r7.doEverySecond(r1)
                    if (r7 <= 0) goto L44
                    r6.f258630a = r1
                    r5 = 2
                    r6.f258631b = r2
                    r3 = 1000(0x3e8, double:4.94E-321)
                    r3 = 1000(0x3e8, double:4.94E-321)
                    java.lang.Object r7 = kotlinx.coroutines.d1.b(r3, r6)
                    if (r7 != r0) goto L41
                    r5 = 1
                    return r0
                L41:
                    int r1 = r1 + (-1)
                    goto L27
                L44:
                    r5 = 3
                    kotlin.jvm.functions.Function0<kotlin.Unit> r6 = r6.f258634e
                    r6.invoke()
                    r5 = 6
                    kotlin.Unit r6 = kotlin.Unit.f312394a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.q.a.C1747a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1747a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @NotNull
        public static p2 a(@NotNull q qVar, int i10, @NotNull Function0<Unit> onTimeRanOut) {
            Intrinsics.checkNotNullParameter(onTimeRanOut, "onTimeRanOut");
            qVar.cancelCountdown();
            return kotlinx.coroutines.k.f(qVar.getScope(), null, null, new C1747a(i10, qVar, onTimeRanOut, null), 3, null);
        }

        public static void b(@NotNull q qVar) {
            p2.a.b(qVar.getScopeJob(), null, 1, null);
        }

        public static int c(@NotNull q qVar, int i10) {
            return i10;
        }

        public static void d(@NotNull q qVar, int i10, @NotNull Function0<Unit> onTimeRanOut) {
            Intrinsics.checkNotNullParameter(onTimeRanOut, "onTimeRanOut");
        }
    }

    void cancelCountdown();

    @NotNull
    p2 createCountDownJob(int i10, @NotNull Function0<Unit> function0);

    void destroy();

    int doEverySecond(int i10);

    @NotNull
    kotlinx.coroutines.s0 getScope();

    @NotNull
    kotlinx.coroutines.a0 getScopeJob();

    void startCountdown(int i10, @NotNull Function0<Unit> function0);
}
