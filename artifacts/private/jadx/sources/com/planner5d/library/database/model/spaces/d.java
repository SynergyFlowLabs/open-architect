package com.planner5d.library.database.model.spaces;

import androidx.room.i0;
import androidx.room.l;
import androidx.room.o2;
import androidx.room.x0;
import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@l
public abstract class d {

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.database.model.spaces.SpacesDao", f = "SpacesDao.kt", i = {0, 0, 1, 1}, l = {14, 15, 17}, m = "saveSpace$suspendImpl", n = {"$this", "data", "$this", "data"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f154219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f154220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f154221c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f154223e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f154221c = obj;
            this.f154223e |= Integer.MIN_VALUE;
            return d.g(d.this, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a6, code lost:
    
        if (r10.d(r9, r0) == r1) goto L28;
     */
    @androidx.room.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object g(com.planner5d.library.database.model.spaces.d r9, com.planner5d.library.database.model.spaces.c r10, kotlin.coroutines.d<? super kotlin.Unit> r11) {
        /*
            java.lang.String r8 = "Androeed.ru"
            boolean r0 = r11 instanceof com.planner5d.library.database.model.spaces.d.a
            if (r0 == 0) goto L16
            r0 = r11
            com.planner5d.library.database.model.spaces.d$a r0 = (com.planner5d.library.database.model.spaces.d.a) r0
            int r1 = r0.f154223e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f154223e = r1
            r8 = 5
            goto L1b
        L16:
            com.planner5d.library.database.model.spaces.d$a r0 = new com.planner5d.library.database.model.spaces.d$a
            r0.<init>(r11)
        L1b:
            java.lang.Object r11 = r0.f154221c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f154223e
            r3 = 3
            r4 = 6
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L57
            if (r2 == r5) goto L4a
            if (r2 == r4) goto L3e
            r8 = 5
            if (r2 != r3) goto L34
            kotlin.ResultKt.m(r11)
            goto La9
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r8 = 4
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            r8 = 2
            throw r9
        L3e:
            java.lang.Object r9 = r0.f154220b
            com.planner5d.library.database.model.spaces.c r9 = (com.planner5d.library.database.model.spaces.c) r9
            java.lang.Object r10 = r0.f154219a
            com.planner5d.library.database.model.spaces.d r10 = (com.planner5d.library.database.model.spaces.d) r10
            kotlin.ResultKt.m(r11)
            goto L86
        L4a:
            java.lang.Object r9 = r0.f154220b
            r10 = r9
            com.planner5d.library.database.model.spaces.c r10 = (com.planner5d.library.database.model.spaces.c) r10
            java.lang.Object r9 = r0.f154219a
            com.planner5d.library.database.model.spaces.d r9 = (com.planner5d.library.database.model.spaces.d) r9
            kotlin.ResultKt.m(r11)
            goto L6d
        L57:
            kotlin.ResultKt.m(r11)
            com.planner5d.library.database.model.spaces.a r11 = r10.f()
            r0.f154219a = r9
            r8 = 0
            r0.f154220b = r10
            r0.f154223e = r5
            java.lang.Object r11 = r9.e(r11, r0)
            r8 = 4
            if (r11 != r1) goto L6d
            goto La8
        L6d:
            r8 = 4
            java.lang.Number r11 = (java.lang.Number) r11
            long r5 = r11.longValue()
            r0.f154219a = r9
            r8 = 4
            r0.f154220b = r10
            r0.f154223e = r4
            r8 = 3
            java.lang.Object r11 = r9.c(r5, r0)
            if (r11 != r1) goto L83
            goto La8
        L83:
            r7 = r10
            r10 = r9
            r9 = r7
        L86:
            r8 = 7
            java.lang.Number r11 = (java.lang.Number) r11
            r8 = 0
            long r4 = r11.longValue()
            com.planner5d.library.database.model.spaces.b r11 = r9.e()
            r11.r(r4)
            com.planner5d.library.database.model.spaces.b r9 = r9.e()
            r11 = 3
            r11 = 0
            r0.f154219a = r11
            r0.f154220b = r11
            r8 = 5
            r0.f154223e = r3
            java.lang.Object r9 = r10.d(r9, r0)
            if (r9 != r1) goto La9
        La8:
            return r1
        La9:
            kotlin.Unit r9 = kotlin.Unit.f312394a
            r8 = 2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.database.model.spaces.d.g(com.planner5d.library.database.model.spaces.d, com.planner5d.library.database.model.spaces.c, kotlin.coroutines.d):java.lang.Object");
    }

    @x0("SELECT * FROM space WHERE user_id = :userId")
    @o2
    @Nullable
    public abstract Object a(long j10, @NotNull kotlin.coroutines.d<? super List<c>> dVar);

    @x0("SELECT * FROM space WHERE space.hash = :hash")
    @o2
    @Nullable
    public abstract Object b(@NotNull String str, @NotNull kotlin.coroutines.d<? super c> dVar);

    @x0("SELECT id FROM space WHERE rowid = :rowId")
    @Nullable
    protected abstract Object c(long j10, @NotNull kotlin.coroutines.d<? super Long> dVar);

    @i0(onConflict = 1)
    @Nullable
    protected abstract Object d(@NotNull b bVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @i0(onConflict = 1)
    @Nullable
    protected abstract Object e(@NotNull com.planner5d.library.database.model.spaces.a aVar, @NotNull kotlin.coroutines.d<? super Long> dVar);

    @o2
    @Nullable
    public Object f(@NotNull c cVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return g(this, cVar, dVar);
    }
}
