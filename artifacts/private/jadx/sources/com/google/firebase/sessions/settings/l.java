package com.google.firebase.sessions.settings;

import android.util.Log;
import androidx.annotation.l1;
import androidx.compose.animation.core.z1;
import com.google.firebase.sessions.d1;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import kotlin.x;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@ij.f
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f125138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final d1 f125139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.datastore.core.l<SessionConfigs> f125140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AtomicReference<SessionConfigs> f125141d;

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$1", f = "SettingsCache.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160725s}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f125142a;

        /* JADX INFO: renamed from: com.google.firebase.sessions.settings.l$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1192a implements kotlinx.coroutines.flow.j, c0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AtomicReference<SessionConfigs> f125144a;

            C1192a(AtomicReference<SessionConfigs> atomicReference) {
                this.f125144a = atomicReference;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(SessionConfigs sessionConfigs, kotlin.coroutines.d<? super Unit> dVar) {
                Object objM = a.m(this.f125144a, sessionConfigs, dVar);
                return objM == kotlin.coroutines.intrinsics.b.l() ? objM : Unit.f312394a;
            }

            @Override // kotlin.jvm.internal.c0
            public final x<?> b() {
                return new kotlin.jvm.internal.a(2, this.f125144a, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof kotlinx.coroutines.flow.j) && (obj instanceof c0)) {
                    return Intrinsics.areEqual(b(), ((c0) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object m(AtomicReference atomicReference, SessionConfigs sessionConfigs, kotlin.coroutines.d dVar) {
            atomicReference.set(sessionConfigs);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f125142a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i data = l.this.f125140c.getData();
                C1192a c1192a = new C1192a(l.this.f125141d);
                this.f125142a = 1;
                if (data.collect(c1192a, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCacheImpl", f = "SettingsCache.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160745y1}, m = "removeConfigs$com_google_firebase_firebase_sessions", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f125145a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f125147c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f125145a = obj;
            this.f125147c |= Integer.MIN_VALUE;
            return l.this.i(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$removeConfigs$2", f = "SettingsCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<SessionConfigs, kotlin.coroutines.d<? super SessionConfigs>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f125148a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f125148a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return h.f125127a.K();
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SessionConfigs sessionConfigs, kotlin.coroutines.d<? super SessionConfigs> dVar) {
            return ((c) create(sessionConfigs, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$sessionConfigs$1", f = "SettingsCache.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends o implements Function2<s0, kotlin.coroutines.d<? super SessionConfigs>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f125149a;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f125149a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            kotlinx.coroutines.flow.i data = l.this.f125140c.getData();
            this.f125149a = 1;
            Object objW0 = kotlinx.coroutines.flow.k.w0(data, this);
            return objW0 == objL ? objL : objW0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super SessionConfigs> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCacheImpl", f = "SettingsCache.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160718p1}, m = "updateConfigs", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f125151a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f125153c;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f125151a = obj;
            this.f125153c |= Integer.MIN_VALUE;
            return l.this.a(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$2", f = "SettingsCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends o implements Function2<SessionConfigs, kotlin.coroutines.d<? super SessionConfigs>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f125154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SessionConfigs f125155b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(SessionConfigs sessionConfigs, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f125155b = sessionConfigs;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(this.f125155b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f125154a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return this.f125155b;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SessionConfigs sessionConfigs, kotlin.coroutines.d<? super SessionConfigs> dVar) {
            return ((f) create(sessionConfigs, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public l(@d8.a @NotNull CoroutineContext backgroundDispatcher, @NotNull d1 timeProvider, @NotNull androidx.datastore.core.l<SessionConfigs> sessionConfigsDataStore) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.f125138a = backgroundDispatcher;
        this.f125139b = timeProvider;
        this.f125140c = sessionConfigsDataStore;
        this.f125141d = new AtomicReference<>();
        kotlinx.coroutines.k.f(t0.a(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    private final SessionConfigs h() {
        if (this.f125141d.get() == null) {
            z1.a(this.f125141d, null, kotlinx.coroutines.j.b(null, new d(null), 1, null));
        }
        SessionConfigs sessionConfigs = this.f125141d.get();
        Intrinsics.checkNotNullExpressionValue(sessionConfigs, "get(...)");
        return sessionConfigs;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.google.firebase.sessions.settings.k
    @Nullable
    public Object a(@NotNull SessionConfigs sessionConfigs, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f125153c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f125153c = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f125151a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f125153c;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                androidx.datastore.core.l<SessionConfigs> lVar = this.f125140c;
                f fVar = new f(sessionConfigs, null);
                eVar.f125153c = 1;
                if (lVar.a(fVar, eVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
        } catch (IOException e10) {
            e10.toString();
        }
        return Unit.f312394a;
    }

    @Override // com.google.firebase.sessions.settings.k
    @Nullable
    public Integer b() {
        return h().k();
    }

    @Override // com.google.firebase.sessions.settings.k
    @Nullable
    public Double c() {
        return h().j();
    }

    @Override // com.google.firebase.sessions.settings.k
    public boolean d() {
        Long lI = h().i();
        Integer numH = h().h();
        return lI == null || numH == null || this.f125139b.b().e() - lI.longValue() >= ((long) numH.intValue());
    }

    @Override // com.google.firebase.sessions.settings.k
    @Nullable
    public Boolean e() {
        return h().l();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @l1
    @Nullable
    public final Object i(@NotNull kotlin.coroutines.d<Object> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f125147c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f125147c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f125145a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f125147c;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            androidx.datastore.core.l<SessionConfigs> lVar = this.f125140c;
            c cVar = new c(null);
            bVar.f125147c = 1;
            Object objA = lVar.a(cVar, bVar);
            return objA == objL ? objL : objA;
        } catch (IOException e10) {
            return kotlin.coroutines.jvm.internal.b.f(Log.w(com.google.firebase.sessions.n.f125059d, "Failed to remove config values: " + e10));
        }
    }
}
