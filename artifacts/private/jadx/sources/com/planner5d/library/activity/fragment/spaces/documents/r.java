package com.planner5d.library.activity.fragment.spaces.documents;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public enum r {
    COLOR_1(com.planner5d.library.f.C1549f.f166309d4, com.planner5d.library.services.r.colorPurple.f224891a),
    COLOR_2(com.planner5d.library.f.C1549f.f166333e4, com.planner5d.library.services.r.colorBlue.f224891a),
    COLOR_3(com.planner5d.library.f.C1549f.f166357f4, com.planner5d.library.services.r.colorGreen.f224891a),
    COLOR_4(com.planner5d.library.f.C1549f.f166381g4, com.planner5d.library.services.r.colorPink.f224891a),
    COLOR_5(com.planner5d.library.f.C1549f.f166405h4, com.planner5d.library.services.r.colorYellow.f224891a);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f136244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f136245b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f136243j = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f136236c = new a(null);

    @SourceDebugExtension({"SMAP\nFolderColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FolderColor.kt\ncom/planner5d/library/activity/fragment/spaces/documents/FolderColor$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1#2:28\n295#3,2:29\n*S KotlinDebug\n*F\n+ 1 FolderColor.kt\ncom/planner5d/library/activity/fragment/spaces/documents/FolderColor$Companion\n*L\n23#1:29,2\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final r a(@Nullable com.planner5d.library.database.model.spaces.documents.c cVar) {
            List<String> listT;
            Object obj;
            if (cVar != null && (listT = cVar.t()) != null) {
                Iterator<T> it = listT.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (StringsKt.V2((String) next, "color", false, 2, null)) {
                        obj = next;
                        break;
                    }
                }
                String str = (String) obj;
                if (str != null) {
                    return b(str);
                }
            }
            return r.COLOR_1;
        }

        @NotNull
        public final r b(@NotNull String tag) {
            r next;
            Intrinsics.checkNotNullParameter(tag, "tag");
            Iterator<r> it = r.l().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(next.o(), tag));
            r rVar = next;
            return rVar != null ? rVar : r.COLOR_1;
        }

        private a() {
        }
    }

    r(int i10, String str) {
        this.f136244a = i10;
        this.f136245b = str;
    }

    @NotNull
    public static kotlin.enums.a<r> l() {
        return f136243j;
    }

    public final int n() {
        return this.f136244a;
    }

    @NotNull
    public final String o() {
        return this.f136245b;
    }
}
