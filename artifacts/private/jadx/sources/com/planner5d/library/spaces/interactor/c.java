package com.planner5d.library.spaces.interactor;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.rabbitmq.g;
import com.planner5d.library.rabbitmq.h;
import com.planner5d.library.services.r;
import com.planner5d.library.spaces.entity.ProjectInfoResponse;
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
public final class c implements fe.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f230214e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p<ProjectInfoResponse> f230215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.rabbitmq.a<ProjectInfoResponse> f230216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f230217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final g f230218d;

    public static final class a implements pe.b {
        a() {
        }

        @Override // pe.b
        public void a(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            timber.log.b.f381052a.x(message, new Object[0]);
            int i10 = 4 << 0;
            v.m0(c.this.f230215a, new ProjectInfoResponse(r.error.f224891a, null));
        }
    }

    @f(c = "com.planner5d.library.spaces.interactor.FindProjectInteractor", f = "FindProjectInteractor.kt", i = {0}, l = {29}, m = "findProjectInfo", n = {"this"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f230220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f230221b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f230223d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f230221b = obj;
            this.f230223d |= Integer.MIN_VALUE;
            return c.this.a(null, this);
        }
    }

    @ij.a
    public c(@NotNull h uriProvider) {
        Intrinsics.checkNotNullParameter(uriProvider, "uriProvider");
        p<ProjectInfoResponse> pVarD = s.d(0, null, null, 7, null);
        this.f230215a = pVarD;
        com.planner5d.library.rabbitmq.a<ProjectInfoResponse> aVar = new com.planner5d.library.rabbitmq.a<>(ProjectInfoResponse.class, pVarD);
        this.f230216b = aVar;
        a aVar2 = new a();
        this.f230217c = aVar2;
        this.f230218d = new g(aVar.b(), aVar2, uriProvider);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // fe.b
    @Nullable
    public Object a(@NotNull String str, @NotNull kotlin.coroutines.d<? super p<ProjectInfoResponse>> dVar) throws Exception {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f230223d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f230223d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f230221b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f230223d;
        if (i11 == 0) {
            ResultKt.m(obj);
            g gVar = this.f230218d;
            bVar.f230220a = this;
            bVar.f230223d = 1;
            if (gVar.n(str, bVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (c) bVar.f230220a;
            ResultKt.m(obj);
        }
        return this.f230215a;
    }
}
