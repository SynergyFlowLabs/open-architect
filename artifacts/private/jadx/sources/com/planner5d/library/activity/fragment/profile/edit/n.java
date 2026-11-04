package com.planner5d.library.activity.fragment.profile.edit;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.manager.statistics.events.n2;
import com.planner5d.library.modules.user.user.g1;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.modules.user.user.z;
import com.planner5d.library.services.utility.s;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class n extends f2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f134632k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f134633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final t f134634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final z f134635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final g1 f134636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.helper.imagechooser.j f134637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.j f134638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final id.a f134639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f134640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final c1<List<ProfileEditItem>> f134641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final z1 f134642j;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.profile.edit.ProfileEditViewModel$loadOptions$1", f = "ProfileEditViewModel.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f134643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f134644b;

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.profile.edit.n$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.profile.edit.ProfileEditViewModel$loadOptions$1$1", f = "ProfileEditViewModel.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
        static final class C1477a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super List<? extends ProfileEditItem>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f134646a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f134647b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f134648c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f134649d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f134650e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f134651f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ n f134652g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1477a(n nVar, kotlin.coroutines.d<? super C1477a> dVar) {
                super(2, dVar);
                this.f134652g = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1477a(this.f134652g, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<? extends ProfileEditItem>> dVar) {
                return invoke2(s0Var, (kotlin.coroutines.d<? super List<ProfileEditItem>>) dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                List listCreateListBuilder;
                Object objG;
                List list;
                String str;
                int i10;
                int i11;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i12 = this.f134651f;
                if (i12 == 0) {
                    ResultKt.m(obj);
                    n nVar = this.f134652g;
                    listCreateListBuilder = CollectionsKt.createListBuilder();
                    ProfileEditItem.ProfileEditItemType profileEditItemType = ProfileEditItem.ProfileEditItemType.Name;
                    int i13 = com.planner5d.library.f.h.f167686na;
                    id.a aVar = nVar.f134639g;
                    listCreateListBuilder.add(new ProfileEditItem(profileEditItemType, i13, aVar != null ? aVar.f287076b : null, com.planner5d.library.f.s.Iv, null, false, 48, null));
                    ProfileEditItem.ProfileEditItemType profileEditItemType2 = ProfileEditItem.ProfileEditItemType.Email;
                    int i14 = com.planner5d.library.f.h.V7;
                    id.a aVar2 = nVar.f134639g;
                    listCreateListBuilder.add(new ProfileEditItem(profileEditItemType2, i14, aVar2 != null ? aVar2.f287079e : null, com.planner5d.library.f.s.Ev, null, false, 48, null));
                    id.a aVar3 = nVar.f134639g;
                    String str2 = aVar3 != null ? aVar3.f287079e : null;
                    if (str2 != null && !StringsKt.w3(str2) && !nVar.f134638f.a(com.planner5d.library.model.manager.config.f.SignInWithCode)) {
                        listCreateListBuilder.add(new ProfileEditItem(null, com.planner5d.library.f.h.f167742q9, nVar.f134633a.getString(com.planner5d.library.f.s.vt), com.planner5d.library.f.s.wt, null, false, 48, null));
                    }
                    if (nVar.h0()) {
                        int i15 = com.planner5d.library.f.h.f167701o6;
                        String string = nVar.f134633a.getString(com.planner5d.library.f.s.SC);
                        int i16 = com.planner5d.library.f.s.QC;
                        g1 g1Var = nVar.f134636d;
                        id.a aVar4 = nVar.f134639g;
                        this.f134646a = listCreateListBuilder;
                        this.f134647b = string;
                        this.f134648c = listCreateListBuilder;
                        this.f134649d = i16;
                        this.f134650e = i15;
                        this.f134651f = 1;
                        objG = g1Var.g(aVar4, this);
                        if (objG == objL) {
                            return objL;
                        }
                        list = listCreateListBuilder;
                        str = string;
                        i10 = i16;
                        i11 = i15;
                    }
                    return CollectionsKt.build(listCreateListBuilder);
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i17 = this.f134650e;
                int i18 = this.f134649d;
                list = (List) this.f134648c;
                String str3 = (String) this.f134647b;
                List list2 = (List) this.f134646a;
                ResultKt.m(obj);
                i11 = i17;
                i10 = i18;
                str = str3;
                listCreateListBuilder = list2;
                objG = obj;
                list.add(new ProfileEditItem(null, i11, str, i10, ArraysKt.toList((Object[]) objG), false, 32, null));
                return CollectionsKt.build(listCreateListBuilder);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super List<ProfileEditItem>> dVar) {
                return ((C1477a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            c1 c1Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f134644b;
            if (i10 == 0) {
                ResultKt.m(obj);
                c1<List<ProfileEditItem>> c1VarF0 = n.this.f0();
                z1 z1Var = n.this.f134642j;
                C1477a c1477a = new C1477a(n.this, null);
                this.f134643a = c1VarF0;
                this.f134644b = 1;
                Object objH = kotlinx.coroutines.i.h(z1Var, c1477a, this);
                if (objH == objL) {
                    return objL;
                }
                c1Var = c1VarF0;
                obj = objH;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1Var = (c1) this.f134643a;
                ResultKt.m(obj);
            }
            c1Var.r(obj);
            n.this.d0().r(kotlin.coroutines.jvm.internal.b.a(false));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class b extends com.planner5d.library.services.rx.e<id.a> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f134654e;

        b(Function0<Unit> function0) {
            this.f134654e = function0;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            timber.log.b.f381052a.f(th2, "Failed to refresh user info", new Object[0]);
            n.this.d0().r(Boolean.FALSE);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            timber.log.b.f381052a.a("Refreshed user info", new Object[0]);
            n.this.d0().r(Boolean.FALSE);
            this.f134654e.invoke();
        }
    }

    public static final class c extends com.planner5d.library.services.rx.e<Bitmap> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f134656e;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.profile.edit.ProfileEditViewModel$requestImageChooser$1$onNext$1", f = "ProfileEditViewModel.kt", i = {}, l = {102, com.planner5d.library.engine.input.f.b.f160733u1}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f134657a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f134658b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bitmap f134659c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f134660d;

            /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.profile.edit.n$c$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.profile.edit.ProfileEditViewModel$requestImageChooser$1$onNext$1$1", f = "ProfileEditViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C1478a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f134661a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ n f134662b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Bitmap f134663c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f134664d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1478a(n nVar, Bitmap bitmap, Function0<Unit> function0, kotlin.coroutines.d<? super C1478a> dVar) {
                    super(2, dVar);
                    this.f134662b = nVar;
                    this.f134663c = bitmap;
                    this.f134664d = function0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit m(n nVar, Function0 function0) {
                    nVar.j0(function0);
                    return Unit.f312394a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C1478a(this.f134662b, this.f134663c, this.f134664d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f134661a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    final n nVar = this.f134662b;
                    Bitmap bitmap = this.f134663c;
                    final Function0<Unit> function0 = this.f134664d;
                    nVar.l0(bitmap, new Function0() { // from class: com.planner5d.library.activity.fragment.profile.edit.o
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return n.c.a.C1478a.m(nVar, function0);
                        }
                    });
                    return Unit.f312394a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C1478a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n nVar, Bitmap bitmap, Function0<Unit> function0, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f134658b = nVar;
                this.f134659c = bitmap;
                this.f134660d = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f134658b, this.f134659c, this.f134660d, dVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
            
                if (kotlinx.coroutines.i.h(r1, r3, r8) == r0) goto L20;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    r7 = 1
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r8.f134657a
                    r2 = 2
                    r3 = 2
                    r3 = 1
                    if (r1 == 0) goto L24
                    r7 = 2
                    if (r1 == r3) goto L1f
                    if (r1 != r2) goto L16
                    r7 = 3
                    kotlin.ResultKt.m(r9)
                    goto L5e
                L16:
                    r7 = 6
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L1f:
                    r7 = 3
                    kotlin.ResultKt.m(r9)
                    goto L3a
                L24:
                    r7 = 3
                    kotlin.ResultKt.m(r9)
                    com.planner5d.library.activity.fragment.profile.edit.n r9 = r8.f134658b
                    com.planner5d.library.modules.user.user.z r9 = com.planner5d.library.activity.fragment.profile.edit.n.Y(r9)
                    r7 = 5
                    android.graphics.Bitmap r1 = r8.f134659c
                    r8.f134657a = r3
                    java.lang.Object r9 = r9.d(r1, r8)
                    if (r9 != r0) goto L3a
                    goto L5d
                L3a:
                    r7 = 3
                    android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
                    r7 = 0
                    if (r9 != 0) goto L43
                    kotlin.Unit r8 = kotlin.Unit.f312394a
                    return r8
                L43:
                    com.planner5d.library.services.utility.s r1 = com.planner5d.library.services.utility.s.f229729a
                    r7 = 3
                    kotlinx.coroutines.a3 r1 = r1.a()
                    com.planner5d.library.activity.fragment.profile.edit.n$c$a$a r3 = new com.planner5d.library.activity.fragment.profile.edit.n$c$a$a
                    com.planner5d.library.activity.fragment.profile.edit.n r4 = r8.f134658b
                    r7 = 0
                    kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r8.f134660d
                    r6 = 0
                    r3.<init>(r4, r9, r5, r6)
                    r8.f134657a = r2
                    java.lang.Object r8 = kotlinx.coroutines.i.h(r1, r3, r8)
                    if (r8 != r0) goto L5e
                L5d:
                    return r0
                L5e:
                    kotlin.Unit r8 = kotlin.Unit.f312394a
                    r7 = 1
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.profile.edit.n.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        c(Function0<Unit> function0) {
            this.f134656e = function0;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            timber.log.b.f381052a.f(th2, "Failed to choose profile image", new Object[0]);
            n.this.d0().r(Boolean.FALSE);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(Bitmap value) {
            Intrinsics.checkNotNullParameter(value, "value");
            int i10 = 2 | 2;
            kotlinx.coroutines.k.f(g2.a(n.this), s.f229729a.d(), null, new a(n.this, value, this.f134656e, null), 2, null);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            timber.log.b.f381052a.a("Profile image chosen", new Object[0]);
            n.this.d0().r(Boolean.FALSE);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.profile.edit.ProfileEditViewModel$saveUserImageToServer$1$1", f = "ProfileEditViewModel.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134665a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f134667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bitmap f134668d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f134669e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(id.a aVar, Bitmap bitmap, Function0<Unit> function0, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f134667c = aVar;
            this.f134668d = bitmap;
            this.f134669e = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n.this.new d(this.f134667c, this.f134668d, this.f134669e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f134665a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    z zVar = n.this.f134635c;
                    id.a aVar = this.f134667c;
                    com.planner5d.library.application.b bVar = n.this.f134633a;
                    Bitmap bitmap = this.f134668d;
                    this.f134665a = 1;
                    if (zVar.f(aVar, bVar, bitmap, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                timber.log.b.f381052a.a("Profile image saved", new Object[0]);
                n2.f217166b.f0();
                n.this.d0().r(kotlin.coroutines.jvm.internal.b.a(false));
                this.f134669e.invoke();
            } catch (Exception e10) {
                timber.log.b.f381052a.f(e10, "Failed to save profile image", new Object[0]);
                n.this.d0().r(kotlin.coroutines.jvm.internal.b.a(false));
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public n(@NotNull com.planner5d.library.application.b context, @NotNull t userAuthorization, @NotNull z userAvatar, @NotNull g1 userSocial, @NotNull com.planner5d.library.activity.helper.imagechooser.j helperImageChooser, @NotNull com.planner5d.library.model.manager.config.j featureConfigManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(userAvatar, "userAvatar");
        Intrinsics.checkNotNullParameter(userSocial, "userSocial");
        Intrinsics.checkNotNullParameter(helperImageChooser, "helperImageChooser");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        this.f134633a = context;
        this.f134634b = userAuthorization;
        this.f134635c = userAvatar;
        this.f134636d = userSocial;
        this.f134637e = helperImageChooser;
        this.f134638f = featureConfigManager;
        this.f134639g = userAuthorization.a();
        this.f134640h = new c1<>(Boolean.FALSE);
        this.f134641i = new c1<>(CollectionsKt.emptyList());
        this.f134642j = s.f229729a.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h0() {
        return this.f134638f.a(com.planner5d.library.model.manager.config.f.AuthenticationSocialGoogle) || this.f134638f.a(com.planner5d.library.model.manager.config.f.Facebook);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(Function0<Unit> function0) {
        if (this.f134639g == null) {
            return;
        }
        this.f134640h.r(Boolean.TRUE);
        this.f134634b.g(this.f134639g).subscribe((Subscriber<? super id.a>) new b(function0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(Bitmap bitmap, Function0<Unit> function0) {
        this.f134640h.r(Boolean.TRUE);
        id.a aVarA = this.f134634b.a();
        if (aVarA != null) {
            kotlinx.coroutines.k.f(g2.a(this), null, null, new d(aVarA, bitmap, function0, null), 3, null);
        }
    }

    @NotNull
    public final c1<Boolean> d0() {
        return this.f134640h;
    }

    @NotNull
    public final c1<List<ProfileEditItem>> f0() {
        return this.f134641i;
    }

    public final void g0(int i10, @NotNull com.planner5d.library.services.bitmaploader.target.a target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f134635c.a(this.f134639g, i10, target);
    }

    public final void i0() {
        this.f134640h.r(Boolean.TRUE);
        kotlinx.coroutines.k.f(g2.a(this), null, null, new a(null), 3, null);
    }

    public final void k0(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        n2.f217166b.X0();
        this.f134640h.r(Boolean.TRUE);
        this.f134637e.E(1024, false).observeOn(com.planner5d.library.services.rx.c.f224934d).subscribe((Subscriber<? super Bitmap>) new c(listener));
    }
}
