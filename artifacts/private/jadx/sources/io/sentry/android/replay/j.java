package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.runtime.internal.w0;
import io.sentry.m1;
import io.sentry.n8;
import io.sentry.o8;
import io.sentry.p4;
import io.sentry.y7;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nReplayCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplayCache.kt\nio/sentry/android/replay/ReplayCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,466:1\n1#2:467\n1#2:470\n230#3,2:468\n739#4,4:471\n*S KotlinDebug\n*F\n+ 1 ReplayCache.kt\nio/sentry/android/replay/ReplayCache\n*L\n283#1:470\n283#1:468,2\n284#1:471,4\n*E\n"})
public final class j implements Closeable {

    @NotNull
    public static final String X = "replay.id";

    @NotNull
    public static final String Y = "replay.type";

    @NotNull
    public static final String Z = "replay.screen-at-start";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final a f304921l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f304922m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f304923n = ".ongoing_segment";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final String f304924o = "config.height";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final String f304925p0 = "replay.recording";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    public static final String f304926p1 = "segment.id";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final String f304927s = "config.width";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final String f304928t = "config.frame-rate";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final String f304929v = "config.bit-rate";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final String f304930w = "segment.timestamp";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n8 f304931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.protocol.v f304932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f304933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f304934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f304935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f304936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private io.sentry.android.replay.video.d f304937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final f0 f304938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final List<k> f304939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap<String, String> f304940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final f0 f304941k;

    @SourceDebugExtension({"SMAP\nReplayCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplayCache.kt\nio/sentry/android/replay/ReplayCache$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,466:1\n1#2:467\n1#2:470\n230#3,2:468\n739#4,4:471\n1002#5,2:475\n1045#5:477\n*S KotlinDebug\n*F\n+ 1 ReplayCache.kt\nio/sentry/android/replay/ReplayCache$Companion\n*L\n338#1:470\n338#1:468,2\n339#1:471,4\n409#1:475,2\n442#1:477\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: io.sentry.android.replay.j$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ReplayCache.kt\nio/sentry/android/replay/ReplayCache$Companion\n*L\n1#1,328:1\n409#2:329\n*E\n"})
        public static final class C2217a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return kotlin.comparisons.a.l(Long.valueOf(((k) t10).h()), Long.valueOf(((k) t11).h()));
            }
        }

        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ReplayCache.kt\nio/sentry/android/replay/ReplayCache$Companion\n*L\n1#1,328:1\n442#2:329\n*E\n"})
        public static final class b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return kotlin.comparisons.a.l(Long.valueOf(((io.sentry.rrweb.b) t10).e()), Long.valueOf(((io.sentry.rrweb.b) t11).e()));
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean b(j jVar, File file, String str) throws Exception {
            Intrinsics.checkNotNull(str);
            if (StringsKt.M1(str, ".jpg", false, 2, null)) {
                File file2 = new File(file, str);
                Long lC1 = StringsKt.c1(kotlin.io.l.d0(file2));
                if (lC1 != null) {
                    j.e(jVar, file2, lC1.longValue(), null, 4, null);
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.sentry.android.replay.d d(a aVar, n8 n8Var, io.sentry.protocol.v vVar, Function1 function1, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                function1 = null;
            }
            return aVar.c(n8Var, vVar, function1);
        }

        /* JADX WARN: Code duplicated, block: B:90:0x0219  */
        @Nullable
        public final io.sentry.android.replay.d c(@NotNull n8 options, @NotNull io.sentry.protocol.v replayId, @Nullable Function1<? super io.sentry.protocol.v, j> function1) throws IOException {
            Date dateE;
            o8.c cVarValueOf;
            io.sentry.android.replay.d dVar;
            final j jVar;
            List listEmptyList;
            String str = "";
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(replayId, "replayId");
            File fileE = e(options, replayId);
            File file = new File(fileE, j.f304923n);
            if (!file.exists()) {
                options.getLogger().c(y7.DEBUG, "No ongoing segment found for replay: %s", replayId);
                io.sentry.util.i.a(fileE);
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charsets.UTF_8), 8192);
            try {
                Iterator<String> it = kotlin.io.x.h(bufferedReader).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    List listSplit$default = StringsKt.split$default(it.next(), new String[]{"="}, false, 2, 2, null);
                    Pair pair = TuplesKt.to((String) listSplit$default.get(0), (String) listSplit$default.get(1));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                kotlin.io.c.a(bufferedReader, null);
                String str2 = (String) linkedHashMap.get(j.f304924o);
                Integer intOrNull = str2 != null ? StringsKt.toIntOrNull(str2) : null;
                String str3 = (String) linkedHashMap.get(j.f304927s);
                Integer intOrNull2 = str3 != null ? StringsKt.toIntOrNull(str3) : null;
                String str4 = (String) linkedHashMap.get(j.f304928t);
                Integer intOrNull3 = str4 != null ? StringsKt.toIntOrNull(str4) : null;
                String str5 = (String) linkedHashMap.get(j.f304929v);
                Integer intOrNull4 = str5 != null ? StringsKt.toIntOrNull(str5) : null;
                String str6 = (String) linkedHashMap.get(j.f304926p1);
                Integer intOrNull5 = str6 != null ? StringsKt.toIntOrNull(str6) : null;
                try {
                    String str7 = (String) linkedHashMap.get(j.f304930w);
                    if (str7 == null) {
                        str7 = "";
                    }
                    dateE = io.sentry.p.f(str7);
                } catch (Throwable unused) {
                    dateE = null;
                }
                try {
                    String str8 = (String) linkedHashMap.get(j.Y);
                    if (str8 != null) {
                        str = str8;
                    }
                    cVarValueOf = o8.c.valueOf(str);
                } catch (Throwable unused2) {
                    cVarValueOf = null;
                }
                if (intOrNull == null || intOrNull2 == null || intOrNull3 == null || intOrNull4 == null || intOrNull5 == null) {
                    dVar = null;
                } else {
                    dVar = null;
                    if (intOrNull5.intValue() != -1 && dateE != null && cVarValueOf != null) {
                        w wVar = new w(intOrNull2.intValue(), intOrNull.intValue(), 1.0f, 1.0f, intOrNull3.intValue(), intOrNull4.intValue());
                        if (function1 == null || (jVar = function1.invoke(replayId)) == null) {
                            jVar = new j(options, replayId);
                        }
                        File fileT = jVar.t();
                        if (fileT != null) {
                            fileT.listFiles(new FilenameFilter() { // from class: io.sentry.android.replay.i
                                @Override // java.io.FilenameFilter
                                public final boolean accept(File file2, String str9) {
                                    return j.a.b(jVar, file2, str9);
                                }
                            });
                        }
                        if (jVar.q().isEmpty()) {
                            options.getLogger().c(y7.DEBUG, "No frames found for replay: %s, deleting the replay", replayId);
                            io.sentry.util.i.a(fileE);
                            return null;
                        }
                        List<k> listQ = jVar.q();
                        if (listQ.size() > 1) {
                            CollectionsKt.sortWith(listQ, new C2217a());
                        }
                        o8.c cVar = o8.c.SESSION;
                        int iIntValue = cVarValueOf == cVar ? intOrNull5.intValue() : 0;
                        if (cVarValueOf != cVar) {
                            dateE = io.sentry.p.e(((k) CollectionsKt.first((List) jVar.q())).h());
                            Intrinsics.checkNotNull(dateE);
                        }
                        Date date = dateE;
                        long jH = (((k) CollectionsKt.last((List) jVar.q())).h() - date.getTime()) + ((long) (1000 / intOrNull3.intValue()));
                        String str9 = (String) linkedHashMap.get(j.f304925p0);
                        if (str9 != null) {
                            p4 p4Var = (p4) options.getSerializer().c(new StringReader(str9), p4.class);
                            if ((p4Var != null ? p4Var.a() : null) != null) {
                                List<? extends io.sentry.rrweb.b> listA = p4Var.a();
                                Intrinsics.checkNotNull(listA);
                                listEmptyList = new LinkedList(listA);
                            } else {
                                listEmptyList = null;
                            }
                            if (listEmptyList == null) {
                                listEmptyList = CollectionsKt.emptyList();
                            }
                        } else {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        return new io.sentry.android.replay.d(wVar, jVar, date, iIntValue, jH, cVarValueOf, (String) linkedHashMap.get(j.Z), CollectionsKt.sortedWith(listEmptyList, new b()));
                    }
                }
                options.getLogger().c(y7.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", replayId);
                io.sentry.util.i.a(fileE);
                return dVar;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(bufferedReader, th2);
                    throw th3;
                }
            }
        }

        @Nullable
        public final File e(@NotNull n8 options, @NotNull io.sentry.protocol.v replayId) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(replayId, "replayId");
            String cacheDirPath = options.getCacheDirPath();
            if (cacheDirPath == null || cacheDirPath.length() == 0) {
                options.getLogger().c(y7.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                return null;
            }
            String cacheDirPath2 = options.getCacheDirPath();
            Intrinsics.checkNotNull(cacheDirPath2);
            File file = new File(cacheDirPath2, "replay_" + replayId);
            file.mkdirs();
            return file;
        }

        private a() {
        }
    }

    static final class b extends l0 implements Function0<File> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final File invoke() throws IOException {
            if (j.this.t() == null) {
                return null;
            }
            File file = new File(j.this.t(), j.f304923n);
            if (!file.exists()) {
                file.createNewFile();
            }
            return file;
        }
    }

    static final class c extends l0 implements Function1<Map.Entry<String, String>, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f304943a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Map.Entry<String, String> entry) {
            Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
            return entry.getKey() + '=' + entry.getValue();
        }
    }

    static final class d extends l0 implements Function0<File> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            return j.f304921l.e(j.this.f304931a, j.this.f304932b);
        }
    }

    static final class e extends l0 implements Function1<k, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f304945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f304946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i1.h<String> f304947c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, j jVar, i1.h<String> hVar) {
            super(1);
            this.f304945a = j10;
            this.f304946b = jVar;
            this.f304947c = hVar;
        }

        /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.String] */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(k it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.h() < this.f304945a) {
                this.f304946b.l(it.g());
                return Boolean.TRUE;
            }
            i1.h<String> hVar = this.f304947c;
            if (hVar.f312751a == null) {
                hVar.f312751a = it.f();
            }
            return Boolean.FALSE;
        }
    }

    public j(@NotNull n8 options, @NotNull io.sentry.protocol.v replayId) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        this.f304931a = options;
        this.f304932b = replayId;
        this.f304933c = new AtomicBoolean(false);
        this.f304934d = new io.sentry.util.a();
        this.f304935e = new io.sentry.util.a();
        this.f304936f = new io.sentry.util.a();
        this.f304938h = g0.c(new d());
        this.f304939i = new ArrayList();
        this.f304940j = new LinkedHashMap<>();
        this.f304941k = g0.c(new b());
    }

    public static /* synthetic */ void e(j jVar, File file, long j10, String str, int i10, Object obj) throws Exception {
        if ((i10 & 4) != 0) {
            str = null;
            int i11 = 6 >> 0;
        }
        jVar.d(file, j10, str);
    }

    public static /* synthetic */ void g(j jVar, Bitmap bitmap, long j10, String str, int i10, Object obj) throws Exception {
        if ((i10 & 4) != 0) {
            str = null;
        }
        jVar.f(bitmap, j10, str);
    }

    public static /* synthetic */ io.sentry.android.replay.c j(j jVar, long j10, long j11, int i10, int i11, int i12, int i13, int i14, File file, int i15, Object obj) {
        int i16;
        File file2;
        if ((i15 & 128) != 0) {
            File fileT = jVar.t();
            StringBuilder sb2 = new StringBuilder();
            i16 = i10;
            sb2.append(i16);
            sb2.append(".mp4");
            file2 = new File(fileT, sb2.toString());
        } else {
            i16 = i10;
            file2 = file;
        }
        return jVar.h(j10, j11, i16, i11, i12, i13, i14, file2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(File file) {
        try {
            if (file.delete()) {
                return;
            }
            this.f304931a.getLogger().c(y7.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th2) {
            this.f304931a.getLogger().b(y7.ERROR, th2, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    private final boolean m(k kVar) {
        if (kVar == null) {
            return false;
        }
        try {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(kVar.g().getAbsolutePath());
            m1 m1VarA = this.f304934d.a();
            try {
                io.sentry.android.replay.video.d dVar = this.f304937g;
                if (dVar != null) {
                    Intrinsics.checkNotNull(bitmapDecodeFile);
                    dVar.b(bitmapDecodeFile);
                    Unit unit = Unit.f312394a;
                }
                kotlin.jdk7.a.c(m1VarA, null);
                bitmapDecodeFile.recycle();
                return true;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.jdk7.a.c(m1VarA, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            this.f304931a.getLogger().a(y7.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th4);
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        m1 m1VarA = this.f304934d.a();
        try {
            io.sentry.android.replay.video.d dVar = this.f304937g;
            if (dVar != null) {
                dVar.j();
            }
            this.f304937g = null;
            Unit unit = Unit.f312394a;
            kotlin.jdk7.a.c(m1VarA, null);
            this.f304933c.set(true);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jdk7.a.c(m1VarA, th2);
                throw th3;
            }
        }
    }

    public final void d(@NotNull File screenshot, long j10, @Nullable String str) throws Exception {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        k kVar = new k(screenshot, j10, str);
        m1 m1VarA = this.f304936f.a();
        try {
            this.f304939i.add(kVar);
            Unit unit = Unit.f312394a;
            kotlin.jdk7.a.c(m1VarA, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jdk7.a.c(m1VarA, th2);
                throw th3;
            }
        }
    }

    public final void f(@NotNull Bitmap bitmap, long j10, @Nullable String str) throws Exception {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (t() == null || bitmap.isRecycled()) {
            return;
        }
        File fileT = t();
        if (fileT != null) {
            fileT.mkdirs();
        }
        File file = new File(t(), j10 + ".jpg");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, this.f304931a.getSessionReplay().h().screenshotQuality, fileOutputStream);
            fileOutputStream.flush();
            Unit unit = Unit.f312394a;
            kotlin.io.c.a(fileOutputStream, null);
            d(file, j10, str);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    @Nullable
    public final io.sentry.android.replay.c h(long j10, long j11, int i10, int i11, int i12, int i13, int i14, @NotNull File videoFile) throws Exception {
        m1 m1Var;
        int i15;
        Intrinsics.checkNotNullParameter(videoFile, "videoFile");
        if (videoFile.exists() && videoFile.length() > 0) {
            videoFile.delete();
        }
        m1 m1VarA = this.f304936f.a();
        try {
            List<k> arrayList = this.f304939i.isEmpty() ? new ArrayList() : CollectionsKt.toMutableList((Collection) this.f304939i);
            kotlin.jdk7.a.c(m1VarA, null);
            if (arrayList.isEmpty()) {
                this.f304931a.getLogger().c(y7.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
                return null;
            }
            m1 m1VarA2 = this.f304934d.a();
            try {
                m1Var = m1VarA2;
                try {
                    io.sentry.android.replay.video.d dVar = new io.sentry.android.replay.video.d(this.f304931a, new io.sentry.android.replay.video.a(videoFile, i12, i11, i13, i14, null, 32, null), null, 4, null);
                    dVar.k();
                    kotlin.jdk7.a.c(m1Var, null);
                    this.f304937g = dVar;
                    long j12 = ((long) 1000) / ((long) i13);
                    Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
                    long j13 = j11 + j10;
                    kotlin.ranges.l lVarC1 = kotlin.ranges.r.C1(kotlin.ranges.r.f2(j11, j13), j12);
                    long jL = lVarC1.l();
                    long jM = lVarC1.m();
                    long jN = lVarC1.n();
                    if ((jN <= 0 || jL > jM) && (jN >= 0 || jM > jL)) {
                        i15 = 0;
                    } else {
                        long j14 = jL;
                        int i16 = 0;
                        while (true) {
                            for (k kVar : arrayList) {
                                long j15 = j14 + j12;
                                long jH = kVar.h();
                                if (j14 <= jH && jH <= j15) {
                                    objFirstOrNull = kVar;
                                    break;
                                }
                                if (kVar.h() > j15) {
                                    break;
                                }
                            }
                            if (m((k) objFirstOrNull)) {
                                i16++;
                            } else if (objFirstOrNull != null) {
                                l(((k) objFirstOrNull).g());
                                m1 m1VarA3 = this.f304936f.a();
                                try {
                                    r1.a(this.f304939i).remove(objFirstOrNull);
                                    kotlin.jdk7.a.c(m1VarA3, null);
                                    arrayList.remove(objFirstOrNull);
                                    objFirstOrNull = null;
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        kotlin.jdk7.a.c(m1VarA3, th2);
                                        throw th3;
                                    }
                                }
                            }
                            if (j14 == jM) {
                                break;
                            }
                            j14 += jN;
                        }
                        i15 = i16;
                    }
                    if (i15 == 0) {
                        this.f304931a.getLogger().c(y7.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                        l(videoFile);
                        return null;
                    }
                    m1 m1VarA4 = this.f304934d.a();
                    try {
                        io.sentry.android.replay.video.d dVar2 = this.f304937g;
                        if (dVar2 != null) {
                            dVar2.j();
                        }
                        io.sentry.android.replay.video.d dVar3 = this.f304937g;
                        long jC = dVar3 != null ? dVar3.c() : 0L;
                        this.f304937g = null;
                        Unit unit = Unit.f312394a;
                        kotlin.jdk7.a.c(m1VarA4, null);
                        y(j13);
                        return new io.sentry.android.replay.c(videoFile, i15, jC);
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            kotlin.jdk7.a.c(m1VarA4, th4);
                            throw th5;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    Throwable th7 = th;
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        kotlin.jdk7.a.c(m1Var, th7);
                        throw th8;
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                m1Var = m1VarA2;
            }
        } catch (Throwable th10) {
            try {
                throw th10;
            } catch (Throwable th11) {
                kotlin.jdk7.a.c(m1VarA, th10);
                throw th11;
            }
        }
    }

    @Nullable
    public final Long o() throws Exception {
        m1 m1VarA = this.f304936f.a();
        try {
            k kVar = (k) CollectionsKt.firstOrNull((List) this.f304939i);
            Long lValueOf = kVar != null ? Long.valueOf(kVar.h()) : null;
            kotlin.jdk7.a.c(m1VarA, null);
            return lValueOf;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jdk7.a.c(m1VarA, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public final List<k> q() {
        return this.f304939i;
    }

    @Nullable
    public final File r() {
        return (File) this.f304941k.getValue();
    }

    @Nullable
    public final File t() {
        return (File) this.f304938h.getValue();
    }

    public final void x(@NotNull String key, @Nullable String str) throws Exception {
        File fileR;
        File fileR2;
        Intrinsics.checkNotNullParameter(key, "key");
        m1 m1VarA = this.f304935e.a();
        try {
            if (this.f304933c.get()) {
                kotlin.jdk7.a.c(m1VarA, null);
                return;
            }
            File fileR3 = r();
            if ((fileR3 == null || !fileR3.exists()) && (fileR = r()) != null) {
                fileR.createNewFile();
            }
            if (this.f304940j.isEmpty() && (fileR2 = r()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileR2), Charsets.UTF_8), 8192);
                try {
                    Sequence<String> sequenceH = kotlin.io.x.h(bufferedReader);
                    LinkedHashMap<String, String> linkedHashMap = this.f304940j;
                    Iterator<String> it = sequenceH.iterator();
                    while (it.hasNext()) {
                        List listSplit$default = StringsKt.split$default(it.next(), new String[]{"="}, false, 2, 2, null);
                        Pair pair = TuplesKt.to((String) listSplit$default.get(0), (String) listSplit$default.get(1));
                        linkedHashMap.put((String) pair.getFirst(), (String) pair.getSecond());
                    }
                    kotlin.io.c.a(bufferedReader, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.io.c.a(bufferedReader, th2);
                        throw th3;
                    }
                }
            }
            if (str == null) {
                this.f304940j.remove(key);
            } else {
                this.f304940j.put(key, str);
            }
            File fileR4 = r();
            if (fileR4 != null) {
                Set<Map.Entry<String, String>> setEntrySet = this.f304940j.entrySet();
                Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
                kotlin.io.l.I(fileR4, CollectionsKt.joinToString$default(setEntrySet, "\n", null, null, 0, null, c.f304943a, 30, null), null, 2, null);
                Unit unit = Unit.f312394a;
            }
            kotlin.jdk7.a.c(m1VarA, null);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                kotlin.jdk7.a.c(m1VarA, th4);
                throw th5;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final String y(long j10) throws Exception {
        i1.h hVar = new i1.h();
        m1 m1VarA = this.f304936f.a();
        try {
            CollectionsKt.removeAll((List) this.f304939i, (Function1) new e(j10, this, hVar));
            kotlin.jdk7.a.c(m1VarA, null);
            return (String) hVar.f312751a;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jdk7.a.c(m1VarA, th2);
                throw th3;
            }
        }
    }
}
