package com.planner5d.library.spaces.interactor;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.rabbitmq.g;
import com.planner5d.library.rabbitmq.h;
import com.planner5d.library.services.r;
import com.planner5d.library.spaces.entity.SpaceInfoResponse;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.p;
import kotlinx.coroutines.channels.s;
import kotlinx.coroutines.channels.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class a implements fe.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f230203e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p<SpaceInfoResponse> f230204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.rabbitmq.a<SpaceInfoResponse> f230205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1698a f230206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final g f230207d;

    /* JADX INFO: renamed from: com.planner5d.library.spaces.interactor.a$a, reason: collision with other inner class name */
    public static final class C1698a implements pe.b {
        C1698a() {
        }

        @Override // pe.b
        public void a(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            timber.log.b.f381052a.x(message, new Object[0]);
            v.m0(a.this.f230204a, new SpaceInfoResponse(r.error.f224891a, null));
        }
    }

    @f(c = "com.planner5d.library.spaces.interactor.FindHouseInfoInteractor", f = "FindHouseInfoInteractor.kt", i = {0}, l = {29}, m = "findHouseInfo", n = {"this"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f230209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f230210b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f230212d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f230210b = obj;
            this.f230212d |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    @ij.a
    public a(@NotNull h uriProvider) {
        Intrinsics.checkNotNullParameter(uriProvider, "uriProvider");
        p<SpaceInfoResponse> pVarD = s.d(0, null, null, 7, null);
        this.f230204a = pVarD;
        com.planner5d.library.rabbitmq.a<SpaceInfoResponse> aVar = new com.planner5d.library.rabbitmq.a<>(SpaceInfoResponse.class, pVarD);
        this.f230205b = aVar;
        C1698a c1698a = new C1698a();
        this.f230206c = c1698a;
        this.f230207d = new g(aVar.b(), c1698a, uriProvider);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // fe.a
    @Nullable
    public Object a(@NotNull String str, @NotNull kotlin.coroutines.d<? super p<SpaceInfoResponse>> dVar) throws Exception {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f230212d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f230212d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f230210b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f230212d;
        if (i11 == 0) {
            ResultKt.m(obj);
            g gVar = this.f230207d;
            bVar.f230209a = this;
            bVar.f230212d = 1;
            if (gVar.n(str, bVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (a) bVar.f230209a;
            ResultKt.m(obj);
        }
        return this.f230204a;
    }
}
