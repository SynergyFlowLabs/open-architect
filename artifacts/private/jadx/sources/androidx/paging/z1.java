package androidx.paging;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z1<T> {

    public static final class a<T> extends z1<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f72800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<T> f72801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f72802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f72803d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        public a(int i10, @NotNull List<? extends T> inserted, int i11, int i12) {
            super(null);
            Intrinsics.checkNotNullParameter(inserted, "inserted");
            this.f72800a = i10;
            this.f72801b = inserted;
            this.f72802c = i11;
            this.f72803d = i12;
        }

        @NotNull
        public final List<T> a() {
            return this.f72801b;
        }

        public final int b() {
            return this.f72802c;
        }

        public final int c() {
            return this.f72803d;
        }

        public final int d() {
            return this.f72800a;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f72800a == aVar.f72800a && Intrinsics.areEqual(this.f72801b, aVar.f72801b) && this.f72802c == aVar.f72802c && this.f72803d == aVar.f72803d;
        }

        public int hashCode() {
            return Integer.hashCode(this.f72800a) + this.f72801b.hashCode() + Integer.hashCode(this.f72802c) + Integer.hashCode(this.f72803d);
        }

        @NotNull
        public String toString() {
            return StringsKt.r("PagingDataEvent.Append loaded " + this.f72801b.size() + " items (\n                    |   startIndex: " + this.f72800a + "\n                    |   first item: " + CollectionsKt.firstOrNull((List) this.f72801b) + "\n                    |   last item: " + CollectionsKt.lastOrNull((List) this.f72801b) + "\n                    |   newPlaceholdersBefore: " + this.f72802c + "\n                    |   oldPlaceholdersBefore: " + this.f72803d + "\n                    |)\n                    |", null, 1, null);
        }
    }

    public static final class b<T> extends z1<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f72804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f72805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f72806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f72807d;

        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        public b(int i10, int i11, int i12, int i13) {
            super(null);
            this.f72804a = i10;
            this.f72805b = i11;
            this.f72806c = i12;
            this.f72807d = i13;
        }

        public final int a() {
            return this.f72805b;
        }

        public final int b() {
            return this.f72806c;
        }

        public final int c() {
            return this.f72807d;
        }

        public final int d() {
            return this.f72804a;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f72804a == bVar.f72804a && this.f72805b == bVar.f72805b && this.f72806c == bVar.f72806c && this.f72807d == bVar.f72807d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.f72804a) + Integer.hashCode(this.f72805b) + Integer.hashCode(this.f72806c) + Integer.hashCode(this.f72807d);
        }

        @NotNull
        public String toString() {
            return StringsKt.r("PagingDataEvent.DropAppend dropped " + this.f72805b + " items (\n                    |   startIndex: " + this.f72804a + "\n                    |   dropCount: " + this.f72805b + "\n                    |   newPlaceholdersBefore: " + this.f72806c + "\n                    |   oldPlaceholdersBefore: " + this.f72807d + "\n                    |)\n                    |", null, 1, null);
        }
    }

    public static final class c<T> extends z1<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f72808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f72809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f72810c;

        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        public c(int i10, int i11, int i12) {
            super(null);
            this.f72808a = i10;
            this.f72809b = i11;
            this.f72810c = i12;
        }

        public final int a() {
            return this.f72808a;
        }

        public final int b() {
            return this.f72809b;
        }

        public final int c() {
            return this.f72810c;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f72808a == cVar.f72808a && this.f72809b == cVar.f72809b && this.f72810c == cVar.f72810c;
        }

        public int hashCode() {
            return Integer.hashCode(this.f72808a) + Integer.hashCode(this.f72809b) + Integer.hashCode(this.f72810c);
        }

        @NotNull
        public String toString() {
            return StringsKt.r("PagingDataEvent.DropPrepend dropped " + this.f72808a + " items (\n                    |   dropCount: " + this.f72808a + "\n                    |   newPlaceholdersBefore: " + this.f72809b + "\n                    |   oldPlaceholdersBefore: " + this.f72810c + "\n                    |)\n                    |", null, 1, null);
        }
    }

    public static final class d<T> extends z1<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<T> f72811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f72812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f72813c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        public d(@NotNull List<? extends T> inserted, int i10, int i11) {
            super(null);
            Intrinsics.checkNotNullParameter(inserted, "inserted");
            this.f72811a = inserted;
            this.f72812b = i10;
            this.f72813c = i11;
        }

        @NotNull
        public final List<T> a() {
            return this.f72811a;
        }

        public final int b() {
            return this.f72812b;
        }

        public final int c() {
            return this.f72813c;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (Intrinsics.areEqual(this.f72811a, dVar.f72811a) && this.f72812b == dVar.f72812b && this.f72813c == dVar.f72813c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f72811a.hashCode() + Integer.hashCode(this.f72812b) + Integer.hashCode(this.f72813c);
        }

        @NotNull
        public String toString() {
            return StringsKt.r("PagingDataEvent.Prepend loaded " + this.f72811a.size() + " items (\n                    |   first item: " + CollectionsKt.firstOrNull((List) this.f72811a) + "\n                    |   last item: " + CollectionsKt.lastOrNull((List) this.f72811a) + "\n                    |   newPlaceholdersBefore: " + this.f72812b + "\n                    |   oldPlaceholdersBefore: " + this.f72813c + "\n                    |)\n                    |", null, 1, null);
        }
    }

    public static final class e<T> extends z1<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final l2<T> f72814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final l2<T> f72815b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        public e(@NotNull l2<T> newList, @NotNull l2<T> previousList) {
            super(null);
            Intrinsics.checkNotNullParameter(newList, "newList");
            Intrinsics.checkNotNullParameter(previousList, "previousList");
            this.f72814a = newList;
            this.f72815b = previousList;
        }

        @NotNull
        public final l2<T> a() {
            return this.f72814a;
        }

        @NotNull
        public final l2<T> b() {
            return this.f72815b;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f72814a.i() == eVar.f72814a.i() && this.f72814a.k() == eVar.f72814a.k() && this.f72814a.getSize() == eVar.f72814a.getSize() && this.f72814a.c() == eVar.f72814a.c() && this.f72815b.i() == eVar.f72815b.i() && this.f72815b.k() == eVar.f72815b.k() && this.f72815b.getSize() == eVar.f72815b.getSize() && this.f72815b.c() == eVar.f72815b.c()) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f72814a.hashCode() + this.f72815b.hashCode();
        }

        @NotNull
        public String toString() {
            return StringsKt.r("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: " + this.f72814a.i() + "\n                    |       placeholdersAfter: " + this.f72814a.k() + "\n                    |       size: " + this.f72814a.getSize() + "\n                    |       dataCount: " + this.f72814a.c() + "\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: " + this.f72815b.i() + "\n                    |       placeholdersAfter: " + this.f72815b.k() + "\n                    |       size: " + this.f72815b.getSize() + "\n                    |       dataCount: " + this.f72815b.c() + "\n                    |   )\n                    |", null, 1, null);
        }
    }

    public /* synthetic */ z1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private z1() {
    }
}
