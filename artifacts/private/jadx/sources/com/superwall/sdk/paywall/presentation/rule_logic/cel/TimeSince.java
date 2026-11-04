package com.superwall.sdk.paywall.presentation.rule_logic.cel;

import com.superwall.sdk.models.config.ComputedPropertyRequest;
import com.superwall.sdk.storage.core_data.CoreDataManager;
import kotlin.ResultKt;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface TimeSince {

    public static final class DefaultImpls {
        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
        @Nullable
        public static Object invoke(@NotNull TimeSince timeSince, @NotNull CoreDataManager coreDataManager, @NotNull d<? super Integer> dVar) {
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
            Object computedPropertySinceEvent = anonymousClass1.result;
            Object objL = b.l();
            int i11 = anonymousClass1.label;
            if (i11 == 0) {
                ResultKt.m(computedPropertySinceEvent);
                ComputedPropertyRequest computedPropertyRequest = new ComputedPropertyRequest(timeSince.getPropertyRequest(), timeSince.getEvent());
                anonymousClass1.label = 1;
                computedPropertySinceEvent = coreDataManager.getComputedPropertySinceEvent(null, computedPropertyRequest, anonymousClass1);
                if (computedPropertySinceEvent == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(computedPropertySinceEvent);
            }
            Integer num = (Integer) computedPropertySinceEvent;
            return kotlin.coroutines.jvm.internal.b.f(num != null ? num.intValue() : 0);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.rule_logic.cel.TimeSince$invoke$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.rule_logic.cel.TimeSince$DefaultImpls", f = "SuperscriptExposedFunction.kt", i = {}, l = {136}, m = "invoke", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.invoke(null, null, this);
        }
    }

    @NotNull
    String getEvent();

    @NotNull
    ComputedPropertyRequest.ComputedPropertyRequestType getPropertyRequest();

    @Nullable
    Object invoke(@NotNull CoreDataManager coreDataManager, @NotNull d<? super Integer> dVar);
}
