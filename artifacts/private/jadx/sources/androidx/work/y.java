package androidx.work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends o0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final b f77457h = new b(null);

    public static final class a extends o0.a<a, y> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Class<? extends u> workerClass) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        }

        @Override // androidx.work.o0.a
        @NotNull
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public y c() {
            if (d() && h().f76992j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new y(this);
        }

        @Override // androidx.work.o0.a
        @NotNull
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public a g() {
            return this;
        }

        @NotNull
        public final a C(@NotNull Class<? extends p> inputMerger) {
            Intrinsics.checkNotNullParameter(inputMerger, "inputMerger");
            androidx.work.impl.model.v vVarH = h();
            String name = inputMerger.getName();
            Intrinsics.checkNotNullExpressionValue(name, "inputMerger.name");
            vVarH.f76986d = name;
            return this;
        }
    }

    @SourceDebugExtension({"SMAP\nOneTimeWorkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequest$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n1549#2:110\n1620#2,3:111\n*S KotlinDebug\n*F\n+ 1 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequest$Companion\n*L\n91#1:110\n91#1:111,3\n*E\n"})
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final y a(@NotNull Class<? extends u> workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            return new a(workerClass).b();
        }

        @oj.n
        @NotNull
        public final List<y> b(@NotNull List<? extends Class<? extends u>> workerClasses) {
            Intrinsics.checkNotNullParameter(workerClasses, "workerClasses");
            List<? extends Class<? extends u>> list = workerClasses;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new a((Class) it.next()).b());
            }
            return arrayList;
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@NotNull a builder) {
        super(builder.e(), builder.h(), builder.f());
        Intrinsics.checkNotNullParameter(builder, "builder");
    }

    @oj.n
    @NotNull
    public static final y e(@NotNull Class<? extends u> cls) {
        return f77457h.a(cls);
    }

    @oj.n
    @NotNull
    public static final List<y> f(@NotNull List<? extends Class<? extends u>> list) {
        return f77457h.b(list);
    }
}
