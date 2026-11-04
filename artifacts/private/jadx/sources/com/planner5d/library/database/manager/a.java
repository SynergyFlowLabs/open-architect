package com.planner5d.library.database.manager;

import androidx.annotation.m1;
import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;
import com.planner5d.library.database.model.AutoStyle;
import com.planner5d.library.database.model.AutoStyleImage;
import com.planner5d.library.database.model.RoomStyle;
import com.planner5d.library.model.manager.x1;
import com.planner5d.library.services.utility.s;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements x1 {

    /* JADX INFO: renamed from: com.planner5d.library.database.manager.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.database.manager.DesignGeneratorDatabaseManager$deleteAutoStyle$2", f = "DesignGeneratorDatabaseManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C1531a extends o implements Function2<s0, kotlin.coroutines.d<? super List<AutoStyle>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f154040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f154041b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1531a(long j10, kotlin.coroutines.d<? super C1531a> dVar) {
            super(2, dVar);
            this.f154041b = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C1531a(this.f154041b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f154040a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return new Delete().from(AutoStyle.class).where("id = " + this.f154041b).execute();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<AutoStyle>> dVar) {
            return ((C1531a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.database.manager.DesignGeneratorDatabaseManager$deleteAutoStyleImages$2", f = "DesignGeneratorDatabaseManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super List<AutoStyleImage>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f154042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f154043b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f154043b = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f154043b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f154042a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return new Delete().from(AutoStyleImage.class).where("auto_style = " + this.f154043b).execute();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<AutoStyleImage>> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.database.manager.DesignGeneratorDatabaseManager$getAutoStyle$2", f = "DesignGeneratorDatabaseManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super AutoStyle>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f154044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f154045b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f154045b = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f154045b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f154044a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return new Select().from(AutoStyle.class).where("id = " + this.f154045b).executeSingle();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super AutoStyle> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.database.manager.DesignGeneratorDatabaseManager", f = "DesignGeneratorDatabaseManager.kt", i = {}, l = {38}, m = "getAutoStyleImages", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f154046a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f154048c;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f154046a = obj;
            this.f154048c |= Integer.MIN_VALUE;
            return a.this.d(0L, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.database.manager.DesignGeneratorDatabaseManager$getAutoStyleImages$2", f = "DesignGeneratorDatabaseManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends o implements Function2<s0, kotlin.coroutines.d<? super List<AutoStyleImage>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f154049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f154050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f154051c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, String str, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f154050b = j10;
            this.f154051c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f154050b, this.f154051c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f154049a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return new Select().from(AutoStyleImage.class).where("auto_style = ? AND room_style_id = ?", kotlin.coroutines.jvm.internal.b.g(this.f154050b), this.f154051c).orderBy("room_style_id").execute();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<AutoStyleImage>> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.database.manager.DesignGeneratorDatabaseManager$getRoomStyleByRemoteId$2", f = "DesignGeneratorDatabaseManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends o implements Function2<s0, kotlin.coroutines.d<? super RoomStyle>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f154052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f154053b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j10, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f154053b = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(this.f154053b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f154052a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return new Select().from(RoomStyle.class).where("remote_id = ?", kotlin.coroutines.jvm.internal.b.g(this.f154053b)).executeSingle();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super RoomStyle> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.database.manager.DesignGeneratorDatabaseManager", f = "DesignGeneratorDatabaseManager.kt", i = {}, l = {55}, m = "getRoomStyles", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f154054a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f154056c;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f154054a = obj;
            this.f154056c |= Integer.MIN_VALUE;
            return a.this.i(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.database.manager.DesignGeneratorDatabaseManager$getRoomStyles$2", f = "DesignGeneratorDatabaseManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends o implements Function2<s0, kotlin.coroutines.d<? super List<RoomStyle>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f154057a;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new h(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f154057a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return new Select().from(RoomStyle.class).orderBy("created DESC").execute();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<RoomStyle>> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.database.manager.DesignGeneratorDatabaseManager", f = "DesignGeneratorDatabaseManager.kt", i = {}, l = {24}, m = "saveAutoStyle", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f154058a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f154060c;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f154058a = obj;
            this.f154060c |= Integer.MIN_VALUE;
            return a.this.j(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.database.manager.DesignGeneratorDatabaseManager$saveAutoStyle$2", f = "DesignGeneratorDatabaseManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends o implements Function2<s0, kotlin.coroutines.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f154061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AutoStyle f154062b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(AutoStyle autoStyle, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f154062b = autoStyle;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new j(this.f154062b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f154061a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return this.f154062b.save();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Long> dVar) {
            return ((j) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.database.manager.DesignGeneratorDatabaseManager", f = "DesignGeneratorDatabaseManager.kt", i = {}, l = {29}, m = "saveAutoStyleImage", n = {}, s = {})
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f154063a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f154065c;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f154063a = obj;
            this.f154065c |= Integer.MIN_VALUE;
            return a.this.k(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.database.manager.DesignGeneratorDatabaseManager$saveAutoStyleImage$2", f = "DesignGeneratorDatabaseManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends o implements Function2<s0, kotlin.coroutines.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f154066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AutoStyle f154067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f154068c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Long f154069d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(AutoStyle autoStyle, String str, Long l10, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f154067b = autoStyle;
            this.f154068c = str;
            this.f154069d = l10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new l(this.f154067b, this.f154068c, this.f154069d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f154066a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            AutoStyleImage autoStyleImage = new AutoStyleImage();
            AutoStyle autoStyle = this.f154067b;
            String str = this.f154068c;
            Long l10 = this.f154069d;
            autoStyleImage.w(autoStyle);
            autoStyleImage.y(str);
            autoStyleImage.x(l10);
            return autoStyleImage.save();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Long> dVar) {
            return ((l) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.database.manager.DesignGeneratorDatabaseManager", f = "DesignGeneratorDatabaseManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.D0}, m = "saveRoomStyle", n = {}, s = {})
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f154070a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f154072c;

        m(kotlin.coroutines.d<? super m> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f154070a = obj;
            this.f154072c |= Integer.MIN_VALUE;
            return a.this.l(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.database.manager.DesignGeneratorDatabaseManager$saveRoomStyle$2", f = "DesignGeneratorDatabaseManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends o implements Function2<s0, kotlin.coroutines.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f154073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RoomStyle f154074b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(RoomStyle roomStyle, kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
            this.f154074b = roomStyle;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new n(this.f154074b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f154073a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return this.f154074b.save();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Long> dVar) {
            return ((n) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public a() {
    }

    @Nullable
    public final Object a(long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        int i10 = 2 | 0;
        Object objH = kotlinx.coroutines.i.h(s.f229729a.h(), new C1531a(j10, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Nullable
    public final Object b(long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(s.f229729a.h(), new b(j10, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Nullable
    public final Object c(long j10, @NotNull kotlin.coroutines.d<? super AutoStyle> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.h(), new c(j10, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object d(long j10, @NotNull String str, @NotNull kotlin.coroutines.d<? super List<AutoStyleImage>> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f154048c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f154048c = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objH = dVar2.f154046a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f154048c;
        if (i11 == 0) {
            ResultKt.m(objH);
            z1 z1VarH = s.f229729a.h();
            int i12 = 4 ^ 0;
            e eVar = new e(j10, str, null);
            dVar2.f154048c = 1;
            objH = kotlinx.coroutines.i.h(z1VarH, eVar, dVar2);
            if (objH == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objH);
        }
        Intrinsics.checkNotNullExpressionValue(objH, "withContext(...)");
        return objH;
    }

    @m1
    @NotNull
    public final List<AutoStyle> f() {
        List<AutoStyle> listExecute = new Select().from(AutoStyle.class).orderBy("created DESC").execute();
        Intrinsics.checkNotNullExpressionValue(listExecute, "execute(...)");
        return listExecute;
    }

    @Nullable
    public final Object h(long j10, @NotNull kotlin.coroutines.d<? super RoomStyle> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.h(), new f(j10, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object i(@NotNull kotlin.coroutines.d<? super List<RoomStyle>> dVar) {
        g gVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f154056c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f154056c = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object objH = gVar.f154054a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f154056c;
        if (i11 == 0) {
            ResultKt.m(objH);
            z1 z1VarH = s.f229729a.h();
            h hVar = new h(null);
            gVar.f154056c = 1;
            objH = kotlinx.coroutines.i.h(z1VarH, hVar, gVar);
            if (objH == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objH);
        }
        Intrinsics.checkNotNullExpressionValue(objH, "withContext(...)");
        return objH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @m1
    @Nullable
    public final Object j(@NotNull AutoStyle autoStyle, @NotNull kotlin.coroutines.d<? super Long> dVar) {
        i iVar;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i10 = iVar.f154060c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f154060c = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        Object objH = iVar.f154058a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = iVar.f154060c;
        if (i11 == 0) {
            ResultKt.m(objH);
            z1 z1VarH = s.f229729a.h();
            j jVar = new j(autoStyle, null);
            iVar.f154060c = 1;
            objH = kotlinx.coroutines.i.h(z1VarH, jVar, iVar);
            if (objH == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objH);
        }
        Intrinsics.checkNotNullExpressionValue(objH, "withContext(...)");
        return objH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object k(@NotNull AutoStyle autoStyle, @NotNull String str, @Nullable Long l10, @NotNull kotlin.coroutines.d<? super Long> dVar) {
        k kVar;
        if (dVar instanceof k) {
            kVar = (k) dVar;
            int i10 = kVar.f154065c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f154065c = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(dVar);
            }
        } else {
            kVar = new k(dVar);
        }
        Object objH = kVar.f154063a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = kVar.f154065c;
        if (i11 == 0) {
            ResultKt.m(objH);
            z1 z1VarH = s.f229729a.h();
            l lVar = new l(autoStyle, str, l10, null);
            kVar.f154065c = 1;
            objH = kotlinx.coroutines.i.h(z1VarH, lVar, kVar);
            if (objH == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objH);
        }
        Intrinsics.checkNotNullExpressionValue(objH, "withContext(...)");
        return objH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object l(@NotNull RoomStyle roomStyle, @NotNull kotlin.coroutines.d<? super Long> dVar) {
        m mVar;
        if (dVar instanceof m) {
            mVar = (m) dVar;
            int i10 = mVar.f154072c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f154072c = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new m(dVar);
            }
        } else {
            mVar = new m(dVar);
        }
        Object objH = mVar.f154070a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = mVar.f154072c;
        if (i11 == 0) {
            ResultKt.m(objH);
            z1 z1VarH = s.f229729a.h();
            n nVar = new n(roomStyle, null);
            mVar.f154072c = 1;
            objH = kotlinx.coroutines.i.h(z1VarH, nVar, mVar);
            if (objH == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objH);
        }
        Intrinsics.checkNotNullExpressionValue(objH, "withContext(...)");
        return objH;
    }
}
