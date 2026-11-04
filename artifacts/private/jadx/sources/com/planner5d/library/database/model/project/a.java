package com.planner5d.library.database.model.project;

import java.util.Iterator;
import kotlin.enums.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public enum a {
    Unknown(0),
    NotSubmitted(1),
    Submitted(8);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @f
    public final int f154201a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f154200g = c.c(k());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C1534a f154195b = new C1534a(null);

    /* JADX INFO: renamed from: com.planner5d.library.database.model.project.a$a, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nContestProjectStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestProjectStatus.kt\ncom/planner5d/library/database/model/project/ContestProjectStatus$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,14:1\n1#2:15\n*E\n"})
    public static final class C1534a {
        public /* synthetic */ C1534a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @NotNull
        public final a a(int i10) {
            a next;
            Iterator<a> it = a.n().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.f154201a != i10);
            a aVar = next;
            return aVar == null ? a.Unknown : aVar;
        }

        private C1534a() {
        }
    }

    a(int i10) {
        this.f154201a = i10;
    }

    @n
    @NotNull
    public static final a l(int i10) {
        return f154195b.a(i10);
    }

    @NotNull
    public static kotlin.enums.a<a> n() {
        return f154200g;
    }
}
