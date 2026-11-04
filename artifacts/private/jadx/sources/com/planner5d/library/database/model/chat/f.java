package com.planner5d.library.database.model.chat;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements va.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<i> f154135a;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.database.model.chat.DefaultProjectConversationRepository", f = "DefaultProjectConversationRepository.kt", i = {}, l = {12}, m = "getConversationId", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f154136a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f154138c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f154136a = obj;
            this.f154138c |= Integer.MIN_VALUE;
            return f.this.d(0L, 0L, this);
        }
    }

    @ij.a
    public f(@NotNull fg.e<i> projectConversationDao) {
        Intrinsics.checkNotNullParameter(projectConversationDao, "projectConversationDao");
        this.f154135a = projectConversationDao;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // va.c
    @Nullable
    public Object d(long j10, long j11, @NotNull kotlin.coroutines.d<? super String> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f154138c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f154138c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        a aVar2 = aVar;
        Object objB = aVar2.f154136a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar2.f154138c;
        if (i11 == 0) {
            ResultKt.m(objB);
            i iVar = this.f154135a.get();
            aVar2.f154138c = 1;
            objB = iVar.b(j10, j11, aVar2);
            if (objB == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objB);
        }
        return CollectionsKt.getOrNull((List) objB, 0);
    }

    @Override // va.c
    @Nullable
    public Object e(long j10, long j11, @NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objA = this.f154135a.get().a(new h(j10, j11, str), dVar);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }
}
