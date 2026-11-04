package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class FirstMessageUtilsKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1", f = "FirstMessageUtils.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFirstMessageUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirstMessageUtils.kt\nio/intercom/android/sdk/utilities/FirstMessageUtilsKt$handleFirstMessageToast$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,56:1\n32#2:57\n17#2:58\n19#2:62\n46#3:59\n51#3:61\n105#4:60\n*S KotlinDebug\n*F\n+ 1 FirstMessageUtils.kt\nio/intercom/android/sdk/utilities/FirstMessageUtilsKt$handleFirstMessageToast$1\n*L\n26#1:57\n26#1:58\n26#1:62\n26#1:59\n26#1:61\n26#1:60\n*E\n"})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ IntercomDataLayer $dataLayer;
        final /* synthetic */ Twig $twig;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(IntercomDataLayer intercomDataLayer, Twig twig, Context context, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$dataLayer = intercomDataLayer;
            this.$twig = twig;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$dataLayer, this.$twig, this.$context, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                final o0<IntercomEvent> event = this.$dataLayer.getEvent();
                i<Object> iVar = new i<Object>() { // from class: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,218:1\n18#2:219\n32#2:220\n19#2:221\n*E\n"})
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @f(c = "io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "FirstMessageUtils.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(d dVar) {
                                super(dVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                        @Override // kotlinx.coroutines.flow.j
                        @Nullable
                        public final Object emit(Object obj, @NotNull d dVar) {
                            AnonymousClass1 anonymousClass1;
                            if (dVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) dVar;
                                int i10 = anonymousClass1.label;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(dVar);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(dVar);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object objL = b.l();
                            int i11 = anonymousClass1.label;
                            if (i11 == 0) {
                                ResultKt.m(obj2);
                                j jVar = this.$this_unsafeFlow;
                                if (obj instanceof IntercomEvent.BaseResponseReceived) {
                                    anonymousClass1.label = 1;
                                    if (jVar.emit(obj, anonymousClass1) == objL) {
                                        return objL;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.m(obj2);
                            }
                            return Unit.f312394a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.i
                    @Nullable
                    public Object collect(@NotNull j<? super Object> jVar, @NotNull d dVar) {
                        Object objCollect = event.collect(new AnonymousClass2(jVar), dVar);
                        return objCollect == b.l() ? objCollect : Unit.f312394a;
                    }
                };
                C20511 c20511 = new C20511(this.$twig, this.$context);
                this.label = 1;
                if (iVar.collect(c20511, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }

        /* JADX INFO: renamed from: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1, reason: invalid class name and collision with other inner class name */
        static final class C20511<T> implements j {
            final /* synthetic */ Context $context;
            final /* synthetic */ Twig $twig;

            /* JADX INFO: renamed from: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1$1, reason: invalid class name and collision with other inner class name */
            @f(c = "io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1$1", f = "FirstMessageUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C20521 extends o implements Function2<s0, d<? super Unit>, Object> {
                final /* synthetic */ Context $context;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C20521(Context context, d<? super C20521> dVar) {
                    super(2, dVar);
                    this.$context = context;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final d<Unit> create(Object obj, d<?> dVar) {
                    return new C20521(this.$context, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    b.l();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    FirstMessageUtilsKt.showFirstMessageToast(this.$context);
                    return Unit.f312394a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
                    return ((C20521) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            C20511(Twig twig, Context context) {
                this.$twig = twig;
                this.$context = context;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v0, types: [io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1, io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1<T>, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v1, types: [io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1] */
            /* JADX WARN: Type inference failed for: r6v10 */
            /* JADX WARN: Type inference failed for: r6v11 */
            /* JADX WARN: Type inference failed for: r6v5 */
            public final Object emit(IntercomEvent.BaseResponseReceived baseResponseReceived, d<? super Unit> dVar) {
                FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1 firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1;
                if (dVar instanceof FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1) {
                    firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1 = (FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1) dVar;
                    int i10 = firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.label;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.label = i10 - Integer.MIN_VALUE;
                    } else {
                        firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1 = new FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1(this, dVar);
                    }
                } else {
                    firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1 = new FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1(this, dVar);
                }
                Object obj = firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.result;
                Object objL = b.l();
                int i11 = firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.label;
                try {
                    if (i11 == 0) {
                        ResultKt.m(obj);
                        if (baseResponseReceived.getBaseResponse().getConfig().isFirstRequest()) {
                            this.$twig.i(this.$context.getString(R.string.intercom_android_activated_message), new Object[0]);
                            a3 a3VarE = l1.e();
                            C20521 c20521 = new C20521(this.$context, null);
                            firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.L$0 = this;
                            firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.label = 1;
                            Object objH = kotlinx.coroutines.i.h(a3VarE, c20521, firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1);
                            this = objH;
                            if (objH == objL) {
                                return objL;
                            }
                        }
                        return Unit.f312394a;
                    }
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z10 = (C20511<T>) ((C20511) firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.L$0);
                    ResultKt.m(obj);
                    this = z10;
                } catch (Exception e10) {
                    this.$twig.internal("Couldn't show first message toast: " + e10.getMessage());
                }
                return Unit.f312394a;
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
                return emit((IntercomEvent.BaseResponseReceived) obj, (d<? super Unit>) dVar);
            }
        }
    }

    public static final void handleFirstMessageToast(@NotNull s0 applicationScope, @NotNull Twig twig, @NotNull Context context, @NotNull IntercomDataLayer dataLayer) {
        Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
        Intrinsics.checkNotNullParameter(twig, "twig");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        k.f(applicationScope, null, null, new AnonymousClass1(dataLayer, twig, context, null), 3, null);
    }

    public static final void showFirstMessageToast(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.intercom_onboarding_layout, (ViewGroup) null);
        Toast toast = new Toast(context);
        toast.setGravity(17, 0, 0);
        toast.setDuration(1);
        toast.setView(viewInflate);
        toast.show();
    }
}
