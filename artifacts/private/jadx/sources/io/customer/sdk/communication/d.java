package io.customer.sdk.communication;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.p2;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public /* synthetic */ class a<T> extends g0 implements Function2<T, kotlin.coroutines.d<? super Unit>, Object>, n {
        public a(Object obj) {
            super(2, obj, Intrinsics.a.class, "suspendConversion0", "subscribe$suspendConversion0(Lkotlin/jvm/functions/Function1;Lio/customer/sdk/communication/Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX WARN: Incorrect types in method signature: (TT;Lkotlin/coroutines/d<-Lkotlin/Unit;>;)Ljava/lang/Object; */
        public final Object invoke(io.customer.sdk.communication.a aVar, kotlin.coroutines.d dVar) {
            return d.c((Function1) this.receiver, aVar, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            return invoke((io.customer.sdk.communication.a) obj, (kotlin.coroutines.d) dVar);
        }
    }

    public static final /* synthetic */ <T extends io.customer.sdk.communication.a> p2 b(b bVar, Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        kotlin.reflect.d<T> dVarD = j1.d(io.customer.sdk.communication.a.class);
        Intrinsics.needClassReification();
        return bVar.c(dVarD, new a(action));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object c(Function1 function1, io.customer.sdk.communication.a aVar, kotlin.coroutines.d dVar) {
        function1.invoke(aVar);
        return Unit.f312394a;
    }
}
