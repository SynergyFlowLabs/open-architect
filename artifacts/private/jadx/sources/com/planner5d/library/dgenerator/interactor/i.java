package com.planner5d.library.dgenerator.interactor;

import com.planner5d.library.services.utility.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements nb.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.database.manager.a f160435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ce.c f160436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n0 f160437c;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.interactor.GetTranslatedRoomStyleNameInteractor$getTranslatedRoomStyleName$2", f = "GetTranslatedRoomStyleNameInteractor.kt", i = {}, l = {19, 19}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nGetTranslatedRoomStyleNameInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetTranslatedRoomStyleNameInteractor.kt\ncom/planner5d/library/dgenerator/interactor/GetTranslatedRoomStyleNameInteractor$getTranslatedRoomStyleName$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f160438a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f160440c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f160440c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return i.this.new a(this.f160440c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        
            if (r8 == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r6 = 7
                int r1 = r7.f160438a
                r2 = 2
                r3 = 1
                r6 = r3
                if (r1 == 0) goto L26
                if (r1 == r3) goto L22
                r6 = 2
                if (r1 != r2) goto L16
                r6 = 2
                kotlin.ResultKt.m(r8)
                goto L52
            L16:
                r6 = 6
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                r6 = 6
                java.lang.String r8 = "r/s/oetet//rsoemv/haeu ec//rw  t nlnouoei cok/i lib"
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L22:
                kotlin.ResultKt.m(r8)
                goto L3d
            L26:
                kotlin.ResultKt.m(r8)
                com.planner5d.library.dgenerator.interactor.i r8 = com.planner5d.library.dgenerator.interactor.i.this
                com.planner5d.library.database.manager.a r8 = com.planner5d.library.dgenerator.interactor.i.b(r8)
                long r4 = r7.f160440c
                r7.f160438a = r3
                r6 = 6
                java.lang.Object r8 = r8.h(r4, r7)
                r6 = 5
                if (r8 != r0) goto L3d
                r6 = 5
                goto L50
            L3d:
                com.planner5d.library.database.model.RoomStyle r8 = (com.planner5d.library.database.model.RoomStyle) r8
                if (r8 == 0) goto L56
                com.planner5d.library.dgenerator.interactor.i r1 = com.planner5d.library.dgenerator.interactor.i.this
                r6 = 4
                ce.c r1 = com.planner5d.library.dgenerator.interactor.i.c(r1)
                r7.f160438a = r2
                java.lang.Object r8 = r1.a(r8, r7)
                if (r8 != r0) goto L52
            L50:
                r6 = 5
                return r0
            L52:
                r6 = 2
                java.lang.String r8 = (java.lang.String) r8
                return r8
            L56:
                r6 = 2
                r7 = 0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.dgenerator.interactor.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public i(@NotNull com.planner5d.library.database.manager.a databaseManager, @NotNull ce.c translateRoomStyleUseCase) {
        Intrinsics.checkNotNullParameter(databaseManager, "databaseManager");
        Intrinsics.checkNotNullParameter(translateRoomStyleUseCase, "translateRoomStyleUseCase");
        this.f160435a = databaseManager;
        this.f160436b = translateRoomStyleUseCase;
        this.f160437c = s.f229729a.h();
    }

    @Override // nb.e
    @Nullable
    public Object a(long j10, @NotNull kotlin.coroutines.d<? super String> dVar) {
        return kotlinx.coroutines.i.h(this.f160437c, new a(j10, null), dVar);
    }
}
