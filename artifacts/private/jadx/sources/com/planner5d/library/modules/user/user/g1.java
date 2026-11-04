package com.planner5d.library.modules.user.user;

import com.planner5d.library.modules.user.auth.SocialAuthType;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Response;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nUserSocial.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserSocial.kt\ncom/planner5d/library/modules/user/user/UserSocial\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n37#2,2:146\n37#2,2:148\n1#3:150\n*S KotlinDebug\n*F\n+ 1 UserSocial.kt\ncom/planner5d/library/modules/user/user/UserSocial\n*L\n29#1:146,2\n55#1:148,2\n*E\n"})
public final class g1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f223089e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<t> f223090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f223091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f223092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.j f223093d;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f223094a;

        static {
            int[] iArr = new int[SocialAuthType.values().length];
            try {
                iArr[SocialAuthType.Facebook.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SocialAuthType.Google.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SocialAuthType.Code.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f223094a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserSocial", f = "UserSocial.kt", i = {}, l = {138}, m = "createRequestLink", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f223096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f223097c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f223098d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f223100f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223098d = obj;
            this.f223100f |= Integer.MIN_VALUE;
            return g1.this.e(null, null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserSocial", f = "UserSocial.kt", i = {0, 0}, l = {31}, m = "getUserSocialConnections", n = {"this", "services"}, s = {"L$0", "L$1"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f223102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f223103c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223105e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223103c = obj;
            this.f223105e |= Integer.MIN_VALUE;
            return g1.this.g(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserSocial$getUserSocialConnections$response$1", f = "UserSocial.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f223107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f223108c;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(3, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f223106a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return ((com.planner5d.library.api.b) this.f223107b).t((id.a) this.f223108c);
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f223107b = bVar;
            dVar2.f223108c = aVar;
            return dVar2.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserSocial", f = "UserSocial.kt", i = {0, 0}, l = {66}, m = "link", n = {"this", androidx.core.app.w.Q0}, s = {"L$0", "L$1"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f223110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f223111c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223113e;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223111c = obj;
            this.f223113e |= Integer.MIN_VALUE;
            return g1.this.h(null, null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserSocial$link$2", f = "UserSocial.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f223115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f223116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ id.a f223117d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g1 f223118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ SocialAuthType f223119f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f223120g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f223121h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f223122i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(id.a aVar, g1 g1Var, SocialAuthType socialAuthType, String str, String str2, String str3, kotlin.coroutines.d<? super f> dVar) {
            super(3, dVar);
            this.f223117d = aVar;
            this.f223118e = g1Var;
            this.f223119f = socialAuthType;
            this.f223120g = str;
            this.f223121h = str2;
            this.f223122i = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Exception {
            com.planner5d.library.api.b bVar;
            id.a aVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223115b;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.api.b bVar2 = (com.planner5d.library.api.b) this.f223116c;
                id.a aVar2 = this.f223117d;
                g1 g1Var = this.f223118e;
                SocialAuthType socialAuthType = this.f223119f;
                String str = this.f223120g;
                String str2 = this.f223121h;
                String str3 = this.f223122i;
                this.f223116c = bVar2;
                this.f223114a = aVar2;
                this.f223115b = 1;
                Object objE = g1Var.e(aVar2, socialAuthType, str, str2, str3, this);
                if (objE == objL) {
                    return objL;
                }
                obj = objE;
                bVar = bVar2;
                aVar = aVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (id.a) this.f223114a;
                bVar = (com.planner5d.library.api.b) this.f223116c;
                ResultKt.m(obj);
            }
            return bVar.k0(aVar, (JSONObject) obj);
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            f fVar = new f(this.f223117d, this.f223118e, this.f223119f, this.f223120g, this.f223121h, this.f223122i, dVar);
            fVar.f223116c = bVar;
            return fVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserSocial", f = "UserSocial.kt", i = {}, l = {115}, m = "requestSignIn", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f223123a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f223125c;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223123a = obj;
            this.f223125c |= Integer.MIN_VALUE;
            return g1.this.i(null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserSocial$requestSignIn$2", f = "UserSocial.kt", i = {}, l = {me.relex.circleindicator.a.f332619e, 118}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f223127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f223128c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ id.a f223130e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ SocialAuthType f223131f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f223132g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f223133h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f223134i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(id.a aVar, SocialAuthType socialAuthType, String str, String str2, String str3, kotlin.coroutines.d<? super h> dVar) {
            super(3, dVar);
            this.f223130e = aVar;
            this.f223131f = socialAuthType;
            this.f223132g = str;
            this.f223133h = str2;
            this.f223134i = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Exception {
            com.planner5d.library.api.b bVar;
            Object objV;
            com.planner5d.library.api.b bVar2;
            String str;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223127b;
            if (i10 == 0) {
                ResultKt.m(obj);
                bVar = (com.planner5d.library.api.b) this.f223128c;
                t tVar = (t) g1.this.f223090a.get();
                this.f223128c = bVar;
                this.f223127b = 1;
                objV = tVar.V(this);
                if (objV == objL) {
                }
                return objL;
            }
            if (i10 == 1) {
                com.planner5d.library.api.b bVar3 = (com.planner5d.library.api.b) this.f223128c;
                ResultKt.m(obj);
                objV = obj;
                bVar = bVar3;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f223126a;
                bVar2 = (com.planner5d.library.api.b) this.f223128c;
                ResultKt.m(obj);
            }
            return bVar2.M0(str, (JSONObject) obj);
            String str2 = (String) objV;
            g1 g1Var = g1.this;
            id.a aVar = this.f223130e;
            SocialAuthType socialAuthType = this.f223131f;
            String str3 = this.f223132g;
            String str4 = this.f223133h;
            String str5 = this.f223134i;
            this.f223128c = bVar;
            this.f223126a = str2;
            this.f223127b = 2;
            Object objE = g1Var.e(aVar, socialAuthType, str3, str4, str5, this);
            if (objE != objL) {
                com.planner5d.library.api.b bVar4 = bVar;
                obj = objE;
                bVar2 = bVar4;
                str = str2;
                return bVar2.M0(str, (JSONObject) obj);
            }
            return objL;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            h hVar = g1.this.new h(this.f223130e, this.f223131f, this.f223132g, this.f223133h, this.f223134i, dVar);
            hVar.f223128c = bVar;
            return hVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserSocial$unlink$2", f = "UserSocial.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160711n0}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ id.a f223136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g1 f223137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ id.e f223138d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserSocial$unlink$2$1", f = "UserSocial.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f223139a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f223140b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f223141c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ id.e f223142d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(id.e eVar, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f223142d = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f223139a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return ((com.planner5d.library.api.b) this.f223140b).O((id.a) this.f223141c, this.f223142d.f().getService());
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                a aVar2 = new a(this.f223142d, dVar);
                aVar2.f223140b = bVar;
                aVar2.f223141c = aVar;
                return aVar2.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(id.a aVar, g1 g1Var, id.e eVar, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f223136b = aVar;
            this.f223137c = g1Var;
            this.f223138d = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new i(this.f223136b, this.f223137c, this.f223138d, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x008a  */
        /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws ErrorMessageException {
            i iVar;
            Throwable th2;
            com.planner5d.library.api.e eVar;
            int iF;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223135a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    if (this.f223136b == null) {
                        throw new ErrorMessageException(com.planner5d.library.f.s.f169515wb, new String[0]);
                    }
                    try {
                        com.planner5d.library.api.requests.c cVar = this.f223137c.f223091b;
                        id.a aVar = this.f223136b;
                        a aVar2 = new a(this.f223138d, null);
                        this.f223135a = 1;
                        iVar = this;
                        try {
                            obj = com.planner5d.library.api.requests.c.g(cVar, aVar, null, aVar2, iVar, 2, null);
                            if (obj == objL) {
                                return objL;
                            }
                        } catch (com.planner5d.library.api.e e10) {
                            e = e10;
                            eVar = e;
                            iF = iVar.f223137c.f(eVar);
                            if (iF == 6001) {
                                throw new ErrorMessageException(eVar, com.planner5d.library.f.s.Za, iVar.f223138d.f().getService());
                            }
                            throw new ErrorMessageException(eVar, com.planner5d.library.f.s.Ya, iVar.f223138d.f().getService(), String.valueOf(iF));
                        } catch (Throwable th3) {
                            th = th3;
                            th2 = th;
                            throw new ErrorMessageException(th2, com.planner5d.library.f.s.Ya, iVar.f223138d.f().getService(), "U");
                        }
                    } catch (com.planner5d.library.api.e e11) {
                        e = e11;
                        iVar = this;
                        eVar = e;
                        iF = iVar.f223137c.f(eVar);
                        if (iF == 6001) {
                            throw new ErrorMessageException(eVar, com.planner5d.library.f.s.Za, iVar.f223138d.f().getService());
                        }
                        throw new ErrorMessageException(eVar, com.planner5d.library.f.s.Ya, iVar.f223138d.f().getService(), String.valueOf(iF));
                    } catch (Throwable th4) {
                        th = th4;
                        iVar = this;
                        th2 = th;
                        throw new ErrorMessageException(th2, com.planner5d.library.f.s.Ya, iVar.f223138d.f().getService(), "U");
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        ResultKt.m(obj);
                        iVar = this;
                    } catch (com.planner5d.library.api.e e12) {
                        eVar = e12;
                        iVar = this;
                        iF = iVar.f223137c.f(eVar);
                        if (iF == 6001) {
                            throw new ErrorMessageException(eVar, com.planner5d.library.f.s.Za, iVar.f223138d.f().getService());
                        }
                        throw new ErrorMessageException(eVar, com.planner5d.library.f.s.Ya, iVar.f223138d.f().getService(), String.valueOf(iF));
                    } catch (Throwable th5) {
                        th2 = th5;
                        iVar = this;
                        throw new ErrorMessageException(th2, com.planner5d.library.f.s.Ya, iVar.f223138d.f().getService(), "U");
                    }
                }
                return Unit.f312394a;
            } catch (ErrorMessageException e13) {
                throw e13;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public g1(@NotNull fg.e<t> userAuthorization, @NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.model.manager.config.j featureConfigManager) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        this.f223090a = userAuthorization;
        this.f223091b = userApiRequester;
        this.f223092c = application;
        this.f223093d = featureConfigManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object e(id.a aVar, SocialAuthType socialAuthType, String str, String str2, String str3, kotlin.coroutines.d<? super JSONObject> dVar) throws Exception {
        b bVar;
        String str4;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f223100f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f223100f = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f223098d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f223100f;
        if (i11 == 0) {
            ResultKt.m(obj);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("provider", socialAuthType.getService());
            jSONObject3.put("from", com.planner5d.library.api.f.a().f142267e);
            jSONObject3.put(io.sentry.protocol.z.b.f306542i, this.f223092c.getPackageName());
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("id", str);
            jSONObject4.put(net.openid.appauth.x.f333313b, str2);
            if (str3 != null) {
                jSONObject4.put("name", str3);
            }
            Unit unit = Unit.f312394a;
            jSONObject3.put("data", jSONObject4);
            if (aVar == null) {
                return jSONObject3;
            }
            t tVar = this.f223090a.get();
            bVar.f223095a = jSONObject3;
            bVar.f223096b = "automerge";
            bVar.f223097c = jSONObject3;
            bVar.f223100f = 1;
            Object objX = tVar.X(aVar, bVar);
            if (objX == objL) {
                return objL;
            }
            str4 = "automerge";
            jSONObject = jSONObject3;
            obj = objX;
            jSONObject2 = jSONObject;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jSONObject2 = (JSONObject) bVar.f223097c;
            str4 = (String) bVar.f223096b;
            jSONObject = (JSONObject) bVar.f223095a;
            ResultKt.m(obj);
        }
        jSONObject2.put(str4, !((Boolean) obj).booleanValue());
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f(com.planner5d.library.api.e eVar) {
        Throwable cause = eVar.getCause();
        if (cause != null) {
            Integer numValueOf = cause instanceof com.planner5d.library.api.d ? Integer.valueOf(((com.planner5d.library.api.d) cause).b().c()) : null;
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        Response<com.planner5d.library.api.c> responseB = eVar.b();
        if (responseB != null) {
            return responseB.code();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Nullable
    public final Object g(@Nullable id.a aVar, @NotNull kotlin.coroutines.d<? super id.e[]> dVar) {
        c cVar;
        g1 g1Var;
        SocialAuthType[] socialAuthTypeArr;
        com.planner5d.library.api.c cVar2;
        JSONObject jSONObject;
        String string;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f223105e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f223105e = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        c cVar3 = cVar;
        Object obj = cVar3.f223103c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar3.f223105e;
        if (i11 == 0) {
            ResultKt.m(obj);
            SocialAuthType[] socialAuthTypeArr2 = (SocialAuthType[]) SocialAuthType.getEntries().toArray(new SocialAuthType[0]);
            try {
                com.planner5d.library.api.requests.c cVar4 = this.f223091b;
                d dVar2 = new d(null);
                cVar3.f223101a = this;
                cVar3.f223102b = socialAuthTypeArr2;
                cVar3.f223105e = 1;
                Object objG = com.planner5d.library.api.requests.c.g(cVar4, aVar, null, dVar2, cVar3, 2, null);
                if (objG == objL) {
                    return objL;
                }
                g1Var = this;
                socialAuthTypeArr = socialAuthTypeArr2;
                obj = objG;
            } catch (Throwable unused) {
                g1Var = this;
                socialAuthTypeArr = socialAuthTypeArr2;
                cVar2 = null;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            socialAuthTypeArr = (SocialAuthType[]) cVar3.f223102b;
            g1Var = (g1) cVar3.f223101a;
            try {
                ResultKt.m(obj);
            } catch (Throwable unused2) {
                cVar2 = null;
            }
        }
        cVar2 = (com.planner5d.library.api.c) obj;
        ArrayList arrayList = new ArrayList();
        if (cVar2 == null || (jSONObject = cVar2.a()) == null) {
            jSONObject = new JSONObject();
        }
        for (SocialAuthType socialAuthType : socialAuthTypeArr) {
            try {
                string = (!jSONObject.has(socialAuthType.getService()) || jSONObject.isNull(socialAuthType.getService())) ? null : jSONObject.getString(socialAuthType.getService());
            } catch (JSONException unused3) {
            }
            int i12 = a.f223094a[socialAuthType.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new kotlin.k0();
                    }
                } else if (g1Var.f223093d.a(com.planner5d.library.model.manager.config.f.AuthenticationSocialGoogle)) {
                    arrayList.add(new id.e(socialAuthType, string));
                }
            } else if (g1Var.f223093d.a(com.planner5d.library.model.manager.config.f.Facebook)) {
                arrayList.add(new id.e(socialAuthType, string));
            }
        }
        return arrayList.toArray(new id.e[0]);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Nullable
    public final Object h(@Nullable id.a aVar, @NotNull SocialAuthType socialAuthType, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws ErrorMessageException {
        e eVar;
        SocialAuthType socialAuthType2;
        g1 g1Var;
        int iF;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f223113e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f223113e = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        e eVar2 = eVar;
        Object objG = eVar2.f223111c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar2.f223113e;
        try {
            if (i11 == 0) {
                ResultKt.m(objG);
                if (aVar == null) {
                    throw new ErrorMessageException(com.planner5d.library.f.s.f169515wb, new String[0]);
                }
                try {
                    com.planner5d.library.api.requests.c cVar = this.f223091b;
                    f fVar = new f(aVar, this, socialAuthType, str, str2, str3, null);
                    eVar2.f223109a = this;
                    eVar2.f223110b = socialAuthType;
                    eVar2.f223113e = 1;
                    objG = com.planner5d.library.api.requests.c.g(cVar, aVar, null, fVar, eVar2, 2, null);
                    if (objG == objL) {
                        return objL;
                    }
                    g1Var = this;
                    socialAuthType2 = socialAuthType;
                    return Unit.f312394a;
                } catch (com.planner5d.library.api.e e10) {
                    e = e10;
                    g1Var = this;
                    socialAuthType2 = socialAuthType;
                    iF = g1Var.f(e);
                    if (iF != 6002) {
                    }
                    throw new ErrorMessageException(e, com.planner5d.library.f.s.Xa, socialAuthType2.getService(), String.valueOf(iF));
                } catch (Throwable th2) {
                    th = th2;
                    socialAuthType2 = socialAuthType;
                    throw new ErrorMessageException(th, com.planner5d.library.f.s.Wa, socialAuthType2.getService(), androidx.exifinterface.media.a.f51379e5);
                }
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SocialAuthType socialAuthType3 = (SocialAuthType) eVar2.f223110b;
            g1 g1Var2 = (g1) eVar2.f223109a;
            try {
                ResultKt.m(objG);
                socialAuthType2 = socialAuthType3;
                g1Var = g1Var2;
                try {
                    return Unit.f312394a;
                } catch (com.planner5d.library.api.e e11) {
                    e = e11;
                    iF = g1Var.f(e);
                    if (iF != 6002 || iF == 6003) {
                        throw new ErrorMessageException(e, com.planner5d.library.f.s.Xa, socialAuthType2.getService(), String.valueOf(iF));
                    }
                    throw new ErrorMessageException(e, com.planner5d.library.f.s.Wa, socialAuthType2.getService(), androidx.exifinterface.media.a.T4 + iF);
                } catch (Throwable th3) {
                    th = th3;
                    throw new ErrorMessageException(th, com.planner5d.library.f.s.Wa, socialAuthType2.getService(), androidx.exifinterface.media.a.f51379e5);
                }
            } catch (com.planner5d.library.api.e e12) {
                e = e12;
                socialAuthType2 = socialAuthType3;
                g1Var = g1Var2;
                iF = g1Var.f(e);
                if (iF != 6002) {
                }
                throw new ErrorMessageException(e, com.planner5d.library.f.s.Xa, socialAuthType2.getService(), String.valueOf(iF));
            } catch (Throwable th4) {
                th = th4;
                socialAuthType2 = socialAuthType3;
                throw new ErrorMessageException(th, com.planner5d.library.f.s.Wa, socialAuthType2.getService(), androidx.exifinterface.media.a.f51379e5);
            }
        } catch (ErrorMessageException e13) {
            throw e13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Nullable
    public final Object i(@NotNull SocialAuthType socialAuthType, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) throws Exception {
        g gVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f223125c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f223125c = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        g gVar2 = gVar;
        Object objG = gVar2.f223123a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar2.f223125c;
        if (i11 == 0) {
            ResultKt.m(objG);
            id.a aVarA = this.f223090a.get().a();
            com.planner5d.library.api.requests.c cVar = this.f223091b;
            h hVar = new h(aVarA, socialAuthType, str, str2, str3, null);
            gVar2.f223125c = 1;
            objG = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, hVar, gVar2, 2, null);
            if (objG == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objG);
        }
        Intrinsics.checkNotNull(objG);
        return objG;
    }

    @Nullable
    public final Object j(@Nullable id.a aVar, @NotNull id.e eVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new i(aVar, this, eVar, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }
}
