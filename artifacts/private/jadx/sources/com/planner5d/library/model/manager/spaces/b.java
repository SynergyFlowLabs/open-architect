package com.planner5d.library.model.manager.spaces;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.model.manager.x1;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.services.utility.s;
import com.planner5d.library.spaces.entity.SpacesProjectData;
import java.util.Date;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import pj.n;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nSpacesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacesManager.kt\ncom/planner5d/library/model/manager/spaces/SpacesManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1#2:208\n*E\n"})
public final class b implements x1, com.planner5d.library.spaces.data.e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f197752k = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final p0 f197753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final p f197754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.database.model.spaces.d> f197755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f197756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final w f197757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.spaces.a f197758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private String f197759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f197760j;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.SpacesManager$createSpace$4", f = "SpacesManager.kt", i = {1, 2}, l = {108, 131, 132}, m = "invokeSuspend", n = {"hash", "hash"}, s = {"L$0", "L$0"})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f197761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f197762b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.c f197764d;

        /* JADX INFO: renamed from: com.planner5d.library.model.manager.spaces.b$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.SpacesManager$createSpace$4$response$1", f = "SpacesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1609a extends o implements n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f197765a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f197766b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f197767c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f197768d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.database.model.spaces.c f197769e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1609a(b bVar, com.planner5d.library.database.model.spaces.c cVar, kotlin.coroutines.d<? super C1609a> dVar) {
                super(3, dVar);
                this.f197768d = bVar;
                this.f197769e = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f197765a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return ((com.planner5d.library.api.b) this.f197766b).m0((id.a) this.f197767c, this.f197768d.f197758h.g(this.f197769e));
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                C1609a c1609a = new C1609a(this.f197768d, this.f197769e, dVar);
                c1609a.f197766b = bVar;
                c1609a.f197767c = aVar;
                return c1609a.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.planner5d.library.database.model.spaces.c cVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f197764d = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new a(this.f197764d, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0072  */
        /* JADX WARN: Code duplicated, block: B:30:0x0086  */
        /* JADX WARN: Code duplicated, block: B:32:0x008c  */
        /* JADX WARN: Code duplicated, block: B:33:0x009e  */
        /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0120, code lost:
        
            if (r15.I(r0, true, r11) == r1) goto L54;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:29:0x0072, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:32:0x008c, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:35:0x00a2, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:36:0x00b4, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 293
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.spaces.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.spaces.b$b, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.SpacesManager", f = "SpacesManager.kt", i = {0, 0}, l = {145, 151}, m = "getSpace", n = {"this", "hash"}, s = {"L$0", "L$1"})
    static final class C1610b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f197770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f197771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f197772c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197774e;

        C1610b(kotlin.coroutines.d<? super C1610b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f197772c = obj;
            this.f197774e |= Integer.MIN_VALUE;
            return b.this.y(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.SpacesManager$getSpaceFromApi$2", f = "SpacesManager.kt", i = {1, 1}, l = {163, 179}, m = "invokeSuspend", n = {io.sentry.protocol.n.f306405g, "spaceWithAttributes"}, s = {"L$0", "L$1"})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f197775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f197776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f197777c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f197779e;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.SpacesManager$getSpaceFromApi$2$response$1", f = "SpacesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f197780a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f197781b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f197782c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f197783d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f197783d = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f197780a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return ((com.planner5d.library.api.b) this.f197781b).X((id.a) this.f197782c, this.f197783d);
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                a aVar2 = new a(this.f197783d, dVar);
                aVar2.f197781b = bVar;
                aVar2.f197782c = aVar;
                return aVar2.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f197779e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new c(this.f197779e, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v10 */
        /* JADX WARN: Type inference failed for: r11v11, types: [com.planner5d.library.model.manager.spaces.b$c, kotlin.coroutines.d] */
        /* JADX WARN: Type inference failed for: r11v12 */
        /* JADX WARN: Type inference failed for: r11v13 */
        /* JADX WARN: Type inference failed for: r11v14 */
        /* JADX WARN: Type inference failed for: r11v15 */
        /* JADX WARN: Type inference failed for: r11v16 */
        /* JADX WARN: Type inference failed for: r11v17 */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v4, types: [kotlin.coroutines.d] */
        /* JADX WARN: Type inference failed for: r11v5, types: [com.planner5d.library.model.manager.spaces.b$c] */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8, types: [com.planner5d.library.model.manager.spaces.b$c] */
        /* JADX WARN: Type inference failed for: r11v9 */
        /* JADX WARN: Type inference failed for: r14v0, types: [com.planner5d.library.api.c, com.planner5d.library.model.manager.spaces.b$c] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ?? r11;
            IllegalStateException illegalStateException;
            ?? r12;
            com.planner5d.library.api.e eVar;
            ?? r13;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f197777c;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    try {
                        com.planner5d.library.api.requests.c cVar = b.this.f197756f;
                        id.a aVarA = b.this.f197757g.a();
                        a aVar = new a(this.f197779e, null);
                        this.f197777c = 1;
                        r11 = this;
                        try {
                            obj = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, aVar, r11, 2, null);
                            r11 = r11;
                            if (obj == objL) {
                            }
                        } catch (com.planner5d.library.api.e e10) {
                            e = e10;
                            eVar = e;
                            r13 = r11;
                            timber.log.b.f381052a.f(eVar, "Error while getting space from the server, hash: " + r13.f197779e, new Object[0]);
                            return null;
                        } catch (IllegalStateException e11) {
                            e = e11;
                            illegalStateException = e;
                            r12 = r11;
                            timber.log.b.f381052a.f(illegalStateException, "Error while getting space from the server, hash: " + r12.f197779e, new Object[0]);
                            return null;
                        }
                    } catch (com.planner5d.library.api.e e12) {
                        e = e12;
                        r11 = this;
                        eVar = e;
                        r13 = r11;
                        timber.log.b.f381052a.f(eVar, "Error while getting space from the server, hash: " + r13.f197779e, new Object[0]);
                        return null;
                    } catch (IllegalStateException e13) {
                        e = e13;
                        r11 = this;
                        illegalStateException = e;
                        r12 = r11;
                        timber.log.b.f381052a.f(illegalStateException, "Error while getting space from the server, hash: " + r12.f197779e, new Object[0]);
                        return null;
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.planner5d.library.database.model.spaces.c cVar2 = (com.planner5d.library.database.model.spaces.c) this.f197776b;
                    ResultKt.m(obj);
                    return cVar2;
                }
                try {
                    ResultKt.m(obj);
                    r11 = this;
                } catch (com.planner5d.library.api.e e14) {
                    eVar = e14;
                    r13 = this;
                    timber.log.b.f381052a.f(eVar, "Error while getting space from the server, hash: " + r13.f197779e, new Object[0]);
                    return null;
                } catch (IllegalStateException e15) {
                    illegalStateException = e15;
                    r12 = this;
                    timber.log.b.f381052a.f(illegalStateException, "Error while getting space from the server, hash: " + r12.f197779e, new Object[0]);
                    return null;
                }
                com.planner5d.library.api.c cVar3 = (com.planner5d.library.api.c) obj;
                if (!cVar3.h()) {
                    com.planner5d.library.database.model.spaces.c cVarF = b.this.f197758h.f(cVar3.a());
                    b bVar = b.this;
                    r11.f197775a = cVar3;
                    r11.f197776b = cVarF;
                    r11.f197777c = 2;
                    return bVar.F(cVarF, r11) == objL ? objL : cVarF;
                }
                timber.log.b.f381052a.d("Error while getting space with hash:" + r11.f197779e + "\nMessage: " + cVar3.f(), new Object[0]);
                return null;
            } catch (JSONException e16) {
                timber.log.b.f381052a.f(e16, "Error while parsing response: " + a(), new Object[0]);
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.c> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.SpacesManager$getSpaceHash$2", f = "SpacesManager.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSpacesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacesManager.kt\ncom/planner5d/library/model/manager/spaces/SpacesManager$getSpaceHash$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1#2:208\n*E\n"})
    static final class d extends o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f197784a;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f197784a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            if (b.this.f197760j == b.this.f197757g.e()) {
                String str = b.this.f197759i;
                if (str != null) {
                    return str;
                }
            } else {
                b bVar = b.this;
                bVar.f197760j = bVar.f197757g.e();
                b.this.f197759i = null;
            }
            b bVar2 = b.this;
            this.f197784a = 1;
            Object objE = bVar2.E(this);
            return objE == objL ? objL : objE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.SpacesManager$getSpaceHashIfUserHasOneRemote$2", f = "SpacesManager.kt", i = {1, 2}, l = {com.planner5d.library.engine.input.f.b.I0, 78, com.planner5d.library.engine.input.f.b.X}, m = "invokeSuspend", n = {"hash", "hash"}, s = {"L$0", "L$0"})
    static final class e extends o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f197786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f197787b;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.SpacesManager$getSpaceHashIfUserHasOneRemote$2$response$1", f = "SpacesManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f197789a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f197790b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f197791c;

            a(kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f197789a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return ((com.planner5d.library.api.b) this.f197790b).H0((id.a) this.f197791c, true, false, 30, 1);
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                a aVar2 = new a(dVar);
                aVar2.f197790b = bVar;
                aVar2.f197791c = aVar;
                return aVar2.invokeSuspend(Unit.f312394a);
            }
        }

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new e(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
        
            if (r15.I(r0, true, r11) == r1) goto L46;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.spaces.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.SpacesManager$getSpaceLocal$2", f = "SpacesManager.kt", i = {}, l = {androidx.media2.widget.f.i.f59799s0}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f197792a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f197794c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f197794c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new f(this.f197794c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f197792a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.planner5d.library.database.model.spaces.d dVar = (com.planner5d.library.database.model.spaces.d) b.this.f197755e.get();
            String str = this.f197794c;
            this.f197792a = 1;
            Object objB = dVar.b(str, this);
            return objB == objL ? objL : objB;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.c> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.SpacesManager$obtainSpaceHashIfUserHasOne$2", f = "SpacesManager.kt", i = {}, l = {55, com.planner5d.library.engine.input.f.b.f160729t0}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f197795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f197796b;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b bVar;
            b bVar2;
            com.planner5d.library.database.model.spaces.a aVarF;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f197796b;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.database.model.spaces.d dVar = (com.planner5d.library.database.model.spaces.d) b.this.f197755e.get();
                long j10 = b.this.f197760j;
                this.f197796b = 1;
                obj = dVar.a(j10, this);
                if (obj != objL) {
                }
                return objL;
            }
            if (i10 == 1) {
                ResultKt.m(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar2 = (b) this.f197795a;
                ResultKt.m(obj);
            }
            String strO = (String) obj;
            bVar = bVar2;
            bVar.f197759i = strO;
            return b.this.f197759i;
            com.planner5d.library.database.model.spaces.c cVar = (com.planner5d.library.database.model.spaces.c) CollectionsKt.firstOrNull((List) obj);
            bVar = b.this;
            if (cVar == null || (aVarF = cVar.f()) == null || (strO = aVarF.o()) == null) {
                b bVar3 = b.this;
                this.f197795a = bVar;
                this.f197796b = 2;
                obj = bVar3.B(this);
                if (obj != objL) {
                    bVar2 = bVar;
                    String strO2 = (String) obj;
                    bVar = bVar2;
                }
                return objL;
            }
            bVar.f197759i = strO2;
            return b.this.f197759i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.spaces.SpacesManager$saveSpaceLocally$2", f = "SpacesManager.kt", i = {}, l = {androidx.media2.widget.f.i.f59773f0}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f197798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.c f197799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f197800c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(com.planner5d.library.database.model.spaces.c cVar, b bVar, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f197799b = cVar;
            this.f197800c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new h(this.f197799b, this.f197800c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f197798a;
            if (i10 == 0) {
                ResultKt.m(obj);
                this.f197799b.f().C(this.f197800c.f197757g.e());
                com.planner5d.library.database.model.spaces.d dVar = (com.planner5d.library.database.model.spaces.d) this.f197800c.f197755e.get();
                com.planner5d.library.database.model.spaces.c cVar = this.f197799b;
                this.f197798a = 1;
                if (dVar.f(cVar, this) == objL) {
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
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* synthetic */ class i extends g0 implements Function1<JSONObject, com.planner5d.library.database.model.spaces.c> {
        i(Object obj) {
            super(1, obj, com.planner5d.library.model.manager.spaces.a.class, "spaceWithAttributesFromJSON", "spaceWithAttributesFromJSON(Lorg/json/JSONObject;)Lcom/planner5d/library/database/model/spaces/SpaceWithAttributes;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final com.planner5d.library.database.model.spaces.c invoke(JSONObject p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return ((com.planner5d.library.model.manager.spaces.a) this.receiver).f(p10);
        }
    }

    @ij.a
    public b(@NotNull p0 formatter, @NotNull p sharedPreferences, @NotNull fg.e<com.planner5d.library.database.model.spaces.d> spacesDao, @NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull w userAuthorization) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(spacesDao, "spacesDao");
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f197753c = formatter;
        this.f197754d = sharedPreferences;
        this.f197755e = spacesDao;
        this.f197756f = userApiRequester;
        this.f197757g = userAuthorization;
        this.f197758h = new com.planner5d.library.model.manager.spaces.a(formatter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(kotlin.coroutines.d<? super String> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.b(), new e(null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(String str, kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.c> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.h(), new f(str, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String D(com.planner5d.library.api.c cVar) throws RuntimeException {
        if (!cVar.h()) {
            return this.f197758h.d(cVar.a());
        }
        throw new RuntimeException("Response error \nMessage:" + cVar.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E(kotlin.coroutines.d<? super String> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.h(), new g(null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F(com.planner5d.library.database.model.spaces.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(s.f229729a.h(), new h(cVar, this, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<com.planner5d.library.database.model.spaces.c> G(com.planner5d.library.api.c cVar) throws JSONException, RuntimeException {
        if (!cVar.h()) {
            return this.f197758h.e(cVar.a(), new i(this.f197758h));
        }
        throw new RuntimeException("Response error \nMessage:" + cVar.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String I() {
        return r.hasSpacesProject.f224891a + "_" + this.f197757g.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x(com.planner5d.library.database.model.spaces.c cVar, kotlin.coroutines.d<? super String> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.b(), new a(cVar, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object y(String str, kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.c> dVar) {
        C1610b c1610b;
        com.planner5d.library.database.model.spaces.c cVar;
        if (dVar instanceof C1610b) {
            c1610b = (C1610b) dVar;
            int i10 = c1610b.f197774e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1610b.f197774e = i10 - Integer.MIN_VALUE;
            } else {
                c1610b = new C1610b(dVar);
            }
        } else {
            c1610b = new C1610b(dVar);
        }
        Object objC = c1610b.f197772c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c1610b.f197774e;
        try {
            if (i11 == 0) {
                ResultKt.m(objC);
                c1610b.f197770a = this;
                c1610b.f197771b = str;
                c1610b.f197774e = 1;
                objC = C(str, c1610b);
                if (objC == objL) {
                }
                return objL;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objC);
                return objC;
            }
            str = (String) c1610b.f197771b;
            this = (b) c1610b.f197770a;
            ResultKt.m(objC);
            cVar = (com.planner5d.library.database.model.spaces.c) objC;
        } catch (Throwable th2) {
            timber.log.b.f381052a.f(th2, "Error while getting space from database, hash: " + str, new Object[0]);
            cVar = null;
        }
        if (cVar != null) {
            return cVar;
        }
        c1610b.f197770a = null;
        c1610b.f197771b = null;
        c1610b.f197774e = 2;
        Object objZ = this.z(str, c1610b);
        if (objZ != objL) {
            return objZ;
        }
        return objL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z(String str, kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.c> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.b(), new c(str, null), dVar);
    }

    @Nullable
    public final Object A(@NotNull kotlin.coroutines.d<? super String> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.h(), new d(null), dVar);
    }

    @Nullable
    public final Object H(@NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        String str = this.f197759i;
        return (str == null || str.length() == 0 || this.f197760j != this.f197757g.e()) ? this.f197754d.C(I(), false, dVar) : kotlin.coroutines.jvm.internal.b.a(true);
    }

    @Override // com.planner5d.library.spaces.data.e
    @Nullable
    public Object a(@NotNull SpacesProjectData spacesProjectData, @NotNull kotlin.coroutines.d<? super String> dVar) {
        com.planner5d.library.database.model.spaces.a aVar = new com.planner5d.library.database.model.spaces.a(0L, 0L, null, null, null, null, null, null, null, 511, null);
        aVar.w(new Date());
        aVar.B("Space " + this.f197753c.o(aVar.n()));
        aVar.u(spacesProjectData.k());
        Long lP = spacesProjectData.p();
        aVar.z(kotlin.coroutines.jvm.internal.b.f((int) (lP != null ? lP.longValue() : 0L)));
        aVar.A("USD");
        aVar.v(spacesProjectData.l());
        com.planner5d.library.database.model.spaces.b bVar = new com.planner5d.library.database.model.spaces.b(0L, 0L, null, null, null, null, 63, null);
        Integer numO = spacesProjectData.o();
        bVar.o(numO != null ? numO.toString() : null);
        Integer numQ = spacesProjectData.q();
        bVar.p(numQ != null ? numQ.toString() : null);
        Integer numM = spacesProjectData.m();
        bVar.t(numM != null ? numM.toString() : null);
        Unit unit = Unit.f312394a;
        return x(new com.planner5d.library.database.model.spaces.c(aVar, bVar), dVar);
    }
}
