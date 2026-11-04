package com.planner5d.library.widget.tooltip;

import java.util.Iterator;
import kotlin.enums.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public enum a {
    BOTTOM(0),
    TOP(1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f258857a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f258856f = c.c(k());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C1749a f258852b = new C1749a(null);

    /* JADX INFO: renamed from: com.planner5d.library.widget.tooltip.a$a, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nPointerPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerPosition.kt\ncom/planner5d/library/widget/tooltip/PointerPosition$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,12:1\n1#2:13\n*E\n"})
    public static final class C1749a {
        public /* synthetic */ C1749a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

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
            } while (next.l() != i10);
            a aVar = next;
            return aVar == null ? a.BOTTOM : aVar;
        }

        private C1749a() {
        }
    }

    a(int i10) {
        this.f258857a = i10;
    }

    @NotNull
    public static kotlin.enums.a<a> n() {
        return f258856f;
    }

    public final int l() {
        return this.f258857a;
    }
}
