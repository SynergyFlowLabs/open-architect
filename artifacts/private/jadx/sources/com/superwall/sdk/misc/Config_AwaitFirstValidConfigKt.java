package com.superwall.sdk.misc;

import com.superwall.sdk.config.models.ConfigState;
import com.superwall.sdk.models.config.Config;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConfig+AwaitFirstValidConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Config+AwaitFirstValidConfig.kt\ncom/superwall/sdk/misc/Config_AwaitFirstValidConfigKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,17:1\n32#2:18\n17#2:19\n19#2:23\n46#3:20\n51#3:22\n105#4:21\n*S KotlinDebug\n*F\n+ 1 Config+AwaitFirstValidConfig.kt\ncom/superwall/sdk/misc/Config_AwaitFirstValidConfigKt\n*L\n11#1:18\n11#1:19\n11#1:23\n11#1:20\n11#1:22\n11#1:21\n*E\n"})
public final class Config_AwaitFirstValidConfigKt {

    /* JADX INFO: renamed from: com.superwall.sdk.misc.Config_AwaitFirstValidConfigKt$awaitFirstValidConfig$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.misc.Config_AwaitFirstValidConfigKt", f = "Config+AwaitFirstValidConfig.kt", i = {}, l = {12}, m = "awaitFirstValidConfig", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Config_AwaitFirstValidConfigKt.awaitFirstValidConfig(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public static final Object awaitFirstValidConfig(@NotNull final i<? extends ConfigState> iVar, @NotNull kotlin.coroutines.d<? super Config> dVar) {
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
        Object objW0 = anonymousClass1.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(objW0);
            i<Object> iVar2 = new i<Object>() { // from class: com.superwall.sdk.misc.Config_AwaitFirstValidConfigKt$awaitFirstValidConfig$$inlined$filterIsInstance$1

                /* JADX INFO: renamed from: com.superwall.sdk.misc.Config_AwaitFirstValidConfigKt$awaitFirstValidConfig$$inlined$filterIsInstance$1$2, reason: invalid class name */
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n18#2:50\n32#2:51\n19#2:52\n*E\n"})
                public static final class AnonymousClass2<T> implements j {
                    final /* synthetic */ j $this_unsafeFlow;

                    /* JADX INFO: renamed from: com.superwall.sdk.misc.Config_AwaitFirstValidConfigKt$awaitFirstValidConfig$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    @f(c = "com.superwall.sdk.misc.Config_AwaitFirstValidConfigKt$awaitFirstValidConfig$$inlined$filterIsInstance$1$2", f = "Config+AwaitFirstValidConfig.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(kotlin.coroutines.d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(j jVar) {
                        this.$this_unsafeFlow = jVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
                    @Override // kotlinx.coroutines.flow.j
                    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
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
                        Object objL = kotlin.coroutines.intrinsics.b.l();
                        int i11 = anonymousClass1.label;
                        if (i11 == 0) {
                            ResultKt.m(obj2);
                            j jVar = this.$this_unsafeFlow;
                            if (obj instanceof ConfigState.Retrieved) {
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
                public Object collect(j<? super Object> jVar, kotlin.coroutines.d dVar2) {
                    Object objCollect = iVar.collect(new AnonymousClass2(jVar), dVar2);
                    return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
                }
            };
            anonymousClass1.label = 1;
            objW0 = k.w0(iVar2, anonymousClass1);
            if (objW0 == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objW0);
        }
        return ((ConfigState.Retrieved) objW0).getConfig();
    }
}
