package coil.memory;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.x;
import coil.util.l;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface MemoryCache {

    @SourceDebugExtension({"SMAP\nMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryCache.kt\ncoil/memory/MemoryCache$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1#2:217\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f87545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f87546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f87547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f87548d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f87549e = true;

        public a(@NotNull Context context) {
            this.f87545a = context;
            this.f87546b = l.g(context);
        }

        @NotNull
        public final MemoryCache a() {
            g aVar;
            h fVar = this.f87549e ? new f() : new coil.memory.b();
            if (this.f87548d) {
                double d10 = this.f87546b;
                int iE = d10 > 0.0d ? l.e(this.f87545a, d10) : this.f87547c;
                aVar = iE > 0 ? new e(iE, fVar) : new coil.memory.a(fVar);
            } else {
                aVar = new coil.memory.a(fVar);
            }
            return new d(aVar, fVar);
        }

        @NotNull
        public final a b(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("size must be >= 0.");
            }
            this.f87546b = 0.0d;
            this.f87547c = i10;
            return this;
        }

        @NotNull
        public final a c(@x(from = 0.0d, to = 1.0d) double d10) {
            if (0.0d > d10 || d10 > 1.0d) {
                throw new IllegalArgumentException("size must be in the range [0.0, 1.0].");
            }
            this.f87547c = 0;
            this.f87546b = d10;
            return this;
        }

        @NotNull
        public final a d(boolean z10) {
            this.f87548d = z10;
            return this;
        }

        @NotNull
        public final a e(boolean z10) {
            this.f87549e = z10;
            return this;
        }
    }

    int a();

    void b(int i10);

    void clear();

    boolean d(@NotNull Key key);

    @Nullable
    b e(@NotNull Key key);

    void f(@NotNull Key key, @NotNull b bVar);

    int getSize();

    @NotNull
    Set<Key> r();

    @SourceDebugExtension({"SMAP\nMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryCache.kt\ncoil/memory/MemoryCache$Key\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,216:1\n216#2,2:217\n*S KotlinDebug\n*F\n+ 1 MemoryCache.kt\ncoil/memory/MemoryCache$Key\n*L\n86#1:217,2\n*E\n"})
    public static final class Key implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f87543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Map<String, String> f87544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final b f87542c = new b(null);

        @oj.f
        @Deprecated
        @NotNull
        public static final Parcelable.Creator<Key> CREATOR = new a();

        public static final class a implements Parcelable.Creator<Key> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Key createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                Intrinsics.checkNotNull(string);
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 < i10; i11++) {
                    String string2 = parcel.readString();
                    Intrinsics.checkNotNull(string2);
                    String string3 = parcel.readString();
                    Intrinsics.checkNotNull(string3);
                    linkedHashMap.put(string2, string3);
                }
                return new Key(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Key[] newArray(int i10) {
                return new Key[i10];
            }
        }

        private static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public Key(@NotNull String str, @NotNull Map<String, String> map) {
            this.f87543a = str;
            this.f87544b = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Key b(Key key, String str, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = key.f87543a;
            }
            if ((i10 & 2) != 0) {
                map = key.f87544b;
            }
            return key.a(str, map);
        }

        @NotNull
        public final Key a(@NotNull String str, @NotNull Map<String, String> map) {
            return new Key(str, map);
        }

        @NotNull
        public final Map<String, String> c() {
            return this.f87544b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NotNull
        public final String e() {
            return this.f87543a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Key) {
                Key key = (Key) obj;
                if (Intrinsics.areEqual(this.f87543a, key.f87543a) && Intrinsics.areEqual(this.f87544b, key.f87544b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f87543a.hashCode() * 31) + this.f87544b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Key(key=" + this.f87543a + ", extras=" + this.f87544b + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i10) {
            parcel.writeString(this.f87543a);
            parcel.writeInt(this.f87544b.size());
            for (Map.Entry<String, String> entry : this.f87544b.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                parcel.writeString(key);
                parcel.writeString(value);
            }
        }

        public /* synthetic */ Key(String str, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? MapsKt.emptyMap() : map);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Bitmap f87550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Map<String, Object> f87551b;

        public b(@NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map) {
            this.f87550a = bitmap;
            this.f87551b = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b b(b bVar, Bitmap bitmap, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bitmap = bVar.f87550a;
            }
            if ((i10 & 2) != 0) {
                map = bVar.f87551b;
            }
            return bVar.a(bitmap, map);
        }

        @NotNull
        public final b a(@NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map) {
            return new b(bitmap, map);
        }

        @NotNull
        public final Bitmap c() {
            return this.f87550a;
        }

        @NotNull
        public final Map<String, Object> d() {
            return this.f87551b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Intrinsics.areEqual(this.f87550a, bVar.f87550a) && Intrinsics.areEqual(this.f87551b, bVar.f87551b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f87550a.hashCode() * 31) + this.f87551b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Value(bitmap=" + this.f87550a + ", extras=" + this.f87551b + ')';
        }

        public /* synthetic */ b(Bitmap bitmap, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(bitmap, (i10 & 2) != 0 ? MapsKt.emptyMap() : map);
        }
    }
}
