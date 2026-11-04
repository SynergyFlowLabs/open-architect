package com.planner5d.library.activity.fragment.dialog.authentication.onelink;

import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.utility.c2;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class w implements dagger.internal.h<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f131966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<ErrorMessageParser> f131967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<c2> f131968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f131969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f131970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.legal.model.manager.a> f131971f;

    public w(ij.c<com.planner5d.library.application.b> cVar, ij.c<ErrorMessageParser> cVar2, ij.c<c2> cVar3, ij.c<com.planner5d.library.model.manager.config.p> cVar4, ij.c<com.planner5d.library.modules.user.user.t> cVar5, ij.c<com.planner5d.library.legal.model.manager.a> cVar6) {
        this.f131966a = cVar;
        this.f131967b = cVar2;
        this.f131968c = cVar3;
        this.f131969d = cVar4;
        this.f131970e = cVar5;
        this.f131971f = cVar6;
    }

    public static w a(ij.c<com.planner5d.library.application.b> cVar, ij.c<ErrorMessageParser> cVar2, ij.c<c2> cVar3, ij.c<com.planner5d.library.model.manager.config.p> cVar4, ij.c<com.planner5d.library.modules.user.user.t> cVar5, ij.c<com.planner5d.library.legal.model.manager.a> cVar6) {
        return new w(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static v c(com.planner5d.library.application.b bVar, ErrorMessageParser errorMessageParser, c2 c2Var, com.planner5d.library.model.manager.config.p pVar, com.planner5d.library.modules.user.user.t tVar, com.planner5d.library.legal.model.manager.a aVar) {
        return new v(bVar, errorMessageParser, c2Var, pVar, tVar, aVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f131966a.get(), this.f131967b.get(), this.f131968c.get(), this.f131969d.get(), this.f131970e.get(), this.f131971f.get());
    }
}
