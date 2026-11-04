package io.intercom.android.sdk.lightcompressor;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import androidx.annotation.w0;
import com.facebook.internal.p;
import io.intercom.android.sdk.lightcompressor.compressor.Compressor;
import io.intercom.android.sdk.lightcompressor.config.AppSpecificStorageConfiguration;
import io.intercom.android.sdk.lightcompressor.config.Configuration;
import io.intercom.android.sdk.lightcompressor.config.SaveLocation;
import io.intercom.android.sdk.lightcompressor.config.SharedStorageConfiguration;
import io.intercom.android.sdk.lightcompressor.video.Result;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.io.c;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import oj.j;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nVideoCompressor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoCompressor.kt\nio/intercom/android/sdk/lightcompressor/VideoCompressor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,415:1\n1#2:416\n*E\n"})
public final class VideoCompressor implements s0 {

    @NotNull
    public static final VideoCompressor INSTANCE = new VideoCompressor();

    @Nullable
    private static p2 job;
    private final /* synthetic */ s0 $$delegate_0 = t0.b();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SaveLocation.values().length];
            try {
                iArr[SaveLocation.downloads.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SaveLocation.pictures.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.lightcompressor.VideoCompressor$doVideoCompression$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.lightcompressor.VideoCompressor$doVideoCompression$1", f = "VideoCompressor.kt", i = {}, l = {123, 150}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ AppSpecificStorageConfiguration $appSpecificStorageConfiguration;
        final /* synthetic */ Configuration $configuration;
        final /* synthetic */ Context $context;
        final /* synthetic */ int $i;
        final /* synthetic */ boolean $isStreamable;
        final /* synthetic */ CompressionListener $listener;
        final /* synthetic */ SharedStorageConfiguration $sharedStorageConfiguration;
        final /* synthetic */ i1.h<File> $streamableFile;
        final /* synthetic */ List<Uri> $uris;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Context context, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, boolean z10, Configuration configuration, int i10, i1.h<File> hVar, List<? extends Uri> list, CompressionListener compressionListener, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$context = context;
            this.$sharedStorageConfiguration = sharedStorageConfiguration;
            this.$appSpecificStorageConfiguration = appSpecificStorageConfiguration;
            this.$isStreamable = z10;
            this.$configuration = configuration;
            this.$i = i10;
            this.$streamableFile = hVar;
            this.$uris = list;
            this.$listener = compressionListener;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$sharedStorageConfiguration, this.$appSpecificStorageConfiguration, this.$isStreamable, this.$configuration, this.$i, this.$streamableFile, this.$uris, this.$listener, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0126  */
        /* JADX WARN: Code duplicated, block: B:29:0x0152  */
        /* JADX WARN: Code duplicated, block: B:30:0x0157  */
        /* JADX WARN: Code duplicated, block: B:32:0x015c  */
        /* JADX WARN: Code duplicated, block: B:34:0x0162  */
        /* JADX WARN: Type inference failed for: r2v10, types: [T, java.io.File] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            Object objQ;
            boolean z10;
            int i10;
            Object objStartCompression;
            Context context;
            Configuration configuration;
            CompressionListener compressionListener;
            SharedStorageConfiguration sharedStorageConfiguration;
            AppSpecificStorageConfiguration appSpecificStorageConfiguration;
            Result result;
            String failureMessage;
            File fileSaveVideoFile;
            String path;
            Object objL = b.l();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m(obj);
                a1 a1VarB = k.b((s0) this.L$0, null, null, new VideoCompressor$doVideoCompression$1$job$1(this.$context, this.$uris, this.$i, null), 3, null);
                this.label = 1;
                objQ = a1VarB.q(this);
                if (objQ != objL) {
                }
                return objL;
            }
            if (i11 == 1) {
                ResultKt.m(obj);
                objQ = obj;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z11 = this.Z$0;
                i10 = this.I$0;
                AppSpecificStorageConfiguration appSpecificStorageConfiguration2 = (AppSpecificStorageConfiguration) this.L$4;
                SharedStorageConfiguration sharedStorageConfiguration2 = (SharedStorageConfiguration) this.L$3;
                configuration = (Configuration) this.L$2;
                Context context2 = (Context) this.L$1;
                CompressionListener compressionListener2 = (CompressionListener) this.L$0;
                ResultKt.m(obj);
                sharedStorageConfiguration = sharedStorageConfiguration2;
                context = context2;
                z10 = z11;
                compressionListener = compressionListener2;
                objStartCompression = obj;
                appSpecificStorageConfiguration = appSpecificStorageConfiguration2;
            }
            result = (Result) objStartCompression;
            if (result.getSuccess()) {
                fileSaveVideoFile = VideoCompressor.INSTANCE.saveVideoFile(context, result.getPath(), sharedStorageConfiguration, appSpecificStorageConfiguration, kotlin.coroutines.jvm.internal.b.a(z10), configuration.getVideoNames().get(i10), kotlin.coroutines.jvm.internal.b.a(true));
                long size = result.getSize();
                if (fileSaveVideoFile != null) {
                    path = fileSaveVideoFile.getPath();
                } else {
                    path = null;
                }
                compressionListener.onSuccess(i10, size, path);
            } else {
                failureMessage = result.getFailureMessage();
                if (failureMessage == null) {
                    failureMessage = "An error has occurred!";
                }
                compressionListener.onFailure(i10, failureMessage);
            }
            return Unit.f312394a;
            String str = (String) objQ;
            VideoCompressor videoCompressor = VideoCompressor.INSTANCE;
            File fileSaveVideoFile2 = videoCompressor.saveVideoFile(this.$context, str, this.$sharedStorageConfiguration, this.$appSpecificStorageConfiguration, kotlin.coroutines.jvm.internal.b.a(this.$isStreamable), this.$configuration.getVideoNames().get(this.$i), kotlin.coroutines.jvm.internal.b.a(false));
            if (this.$isStreamable) {
                this.$streamableFile.f312751a = videoCompressor.saveVideoFile(this.$context, str, this.$sharedStorageConfiguration, this.$appSpecificStorageConfiguration, null, this.$configuration.getVideoNames().get(this.$i), kotlin.coroutines.jvm.internal.b.a(false));
            }
            if (fileSaveVideoFile2 != null) {
                CompressionListener compressionListener3 = this.$listener;
                int i12 = this.$i;
                Context context3 = this.$context;
                List<Uri> list = this.$uris;
                i1.h<File> hVar = this.$streamableFile;
                Configuration configuration2 = this.$configuration;
                SharedStorageConfiguration sharedStorageConfiguration3 = this.$sharedStorageConfiguration;
                AppSpecificStorageConfiguration appSpecificStorageConfiguration3 = this.$appSpecificStorageConfiguration;
                z10 = this.$isStreamable;
                Compressor.INSTANCE.setRunning(true);
                compressionListener3.onStart(i12);
                Uri uri = list.get(i12);
                String path2 = fileSaveVideoFile2.getPath();
                Intrinsics.checkNotNullExpressionValue(path2, "getPath(...)");
                File file = hVar.f312751a;
                String path3 = file != null ? file.getPath() : null;
                this.L$0 = compressionListener3;
                this.L$1 = context3;
                this.L$2 = configuration2;
                this.L$3 = sharedStorageConfiguration3;
                this.L$4 = appSpecificStorageConfiguration3;
                this.I$0 = i12;
                this.Z$0 = z10;
                this.label = 2;
                i10 = i12;
                objStartCompression = videoCompressor.startCompression(i10, context3, uri, path2, path3, configuration2, compressionListener3, this);
                if (objStartCompression != objL) {
                    context = context3;
                    configuration = configuration2;
                    compressionListener = compressionListener3;
                    sharedStorageConfiguration = sharedStorageConfiguration3;
                    appSpecificStorageConfiguration = appSpecificStorageConfiguration3;
                    result = (Result) objStartCompression;
                    if (result.getSuccess()) {
                        fileSaveVideoFile = VideoCompressor.INSTANCE.saveVideoFile(context, result.getPath(), sharedStorageConfiguration, appSpecificStorageConfiguration, kotlin.coroutines.jvm.internal.b.a(z10), configuration.getVideoNames().get(i10), kotlin.coroutines.jvm.internal.b.a(true));
                        long size2 = result.getSize();
                        if (fileSaveVideoFile != null) {
                            path = fileSaveVideoFile.getPath();
                        } else {
                            path = null;
                        }
                        compressionListener.onSuccess(i10, size2, path);
                    } else {
                        failureMessage = result.getFailureMessage();
                        if (failureMessage == null) {
                            failureMessage = "An error has occurred!";
                        }
                        compressionListener.onFailure(i10, failureMessage);
                    }
                }
                return objL;
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.lightcompressor.VideoCompressor$startCompression$2, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.lightcompressor.VideoCompressor$startCompression$2", f = "VideoCompressor.kt", i = {}, l = {p.f100029m}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends o implements Function2<s0, d<? super Result>, Object> {
        final /* synthetic */ Configuration $configuration;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $destPath;
        final /* synthetic */ int $index;
        final /* synthetic */ CompressionListener $listener;
        final /* synthetic */ Uri $srcUri;
        final /* synthetic */ String $streamableFile;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i10, Context context, Uri uri, String str, String str2, Configuration configuration, CompressionListener compressionListener, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$index = i10;
            this.$context = context;
            this.$srcUri = uri;
            this.$destPath = str;
            this.$streamableFile = str2;
            this.$configuration = configuration;
            this.$listener = compressionListener;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$index, this.$context, this.$srcUri, this.$destPath, this.$streamableFile, this.$configuration, this.$listener, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            Compressor compressor = Compressor.INSTANCE;
            int i11 = this.$index;
            Context context = this.$context;
            Uri uri = this.$srcUri;
            String str = this.$destPath;
            String str2 = this.$streamableFile;
            Configuration configuration = this.$configuration;
            final CompressionListener compressionListener = this.$listener;
            CompressionProgressListener compressionProgressListener = new CompressionProgressListener() { // from class: io.intercom.android.sdk.lightcompressor.VideoCompressor.startCompression.2.1
                @Override // io.intercom.android.sdk.lightcompressor.CompressionProgressListener
                public void onProgressCancelled(int i12) {
                    compressionListener.onCancelled(i12);
                }

                @Override // io.intercom.android.sdk.lightcompressor.CompressionProgressListener
                public void onProgressChanged(int i12, float f10) {
                    compressionListener.onProgress(i12, f10);
                }
            };
            this.label = 1;
            Object objCompressVideo = compressor.compressVideo(i11, context, uri, str, str2, configuration, compressionProgressListener, this);
            return objCompressVideo == objL ? objL : objCompressVideo;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Result> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private VideoCompressor() {
    }

    @n
    public static final void cancel() {
        p2 p2Var = job;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        Compressor.INSTANCE.setRunning(false);
    }

    private final void doVideoCompression(Context context, List<? extends Uri> list, boolean z10, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, Configuration configuration, CompressionListener compressionListener) {
        i1.h hVar = new i1.h();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            job = k.f(this, l1.c(), null, new AnonymousClass1(context, sharedStorageConfiguration, appSpecificStorageConfiguration, z10, configuration, i10, hVar, list, compressionListener, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final String getMediaPath(Context context, Uri uri) throws Throwable {
        Throwable th2;
        ContentResolver contentResolver = context.getContentResolver();
        ?? r10 = 0;
        try {
            try {
                uri = contentResolver.query(uri, new String[]{"_data"}, null, null, null);
                try {
                    if (uri == 0) {
                        throw new Exception();
                    }
                    int columnIndexOrThrow = uri.getColumnIndexOrThrow("_data");
                    uri.moveToFirst();
                    String string = uri.getString(columnIndexOrThrow);
                    Intrinsics.checkNotNull(string);
                    uri.close();
                    return string;
                } catch (Exception unused) {
                    File file = new File(context.getApplicationInfo().dataDir + File.separator + System.currentTimeMillis());
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i10 = inputStreamOpenInputStream.read(bArr);
                                    if (i10 <= 0) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i10);
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        c.a(inputStreamOpenInputStream, th);
                                        throw th3;
                                    }
                                }
                                Unit unit = Unit.f312394a;
                                c.a(fileOutputStream, null);
                                c.a(inputStreamOpenInputStream, null);
                            } catch (Throwable th4) {
                                try {
                                    throw th4;
                                } catch (Throwable th5) {
                                    c.a(fileOutputStream, th4);
                                    throw th5;
                                }
                            }
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                    String absolutePath = file.getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                    if (uri != 0) {
                        uri.close();
                    }
                    return absolutePath;
                }
            } catch (Throwable th7) {
                th2 = th7;
                r10 = uri;
                if (r10 != 0) {
                    throw th2;
                }
                r10.close();
                throw th2;
            }
        } catch (Exception unused2) {
            uri = 0;
        } catch (Throwable th8) {
            th2 = th8;
            if (r10 != 0) {
                throw th2;
            }
            r10.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File saveVideoFile(Context context, String str, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, Boolean bool, String str2, Boolean bool2) throws IOException {
        String str3;
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (sharedStorageConfiguration == null) {
            String strValidatedFileName = INSTANCE.validatedFileName(str2, bool);
            Intrinsics.checkNotNull(appSpecificStorageConfiguration);
            if (appSpecificStorageConfiguration.getSubFolderName() != null) {
                strValidatedFileName = appSpecificStorageConfiguration.getSubFolderName() + '/' + strValidatedFileName;
            }
            if (!new File(context.getFilesDir() + '/' + strValidatedFileName).exists()) {
                File parentFile = new File(context.getFilesDir() + '/' + strValidatedFileName).getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
            }
            return new File(context.getFilesDir(), strValidatedFileName);
        }
        VideoCompressor videoCompressor = INSTANCE;
        String strValidatedFileName2 = videoCompressor.validatedFileName(str2, bool);
        SaveLocation saveAt = sharedStorageConfiguration.getSaveAt();
        int i10 = saveAt == null ? -1 : WhenMappings.$EnumSwitchMapping$0[saveAt.ordinal()];
        if (i10 != 1) {
            str3 = i10 != 2 ? Environment.DIRECTORY_MOVIES : Environment.DIRECTORY_PICTURES;
        } else {
            str3 = Environment.DIRECTORY_DOWNLOADS;
        }
        if (sharedStorageConfiguration.getSubFolderName() != null) {
            str3 = str3 + '/' + sharedStorageConfiguration.getSubFolderName();
        }
        if (!Intrinsics.areEqual(bool2, Boolean.TRUE)) {
            return new File(context.getFilesDir(), strValidatedFileName2);
        }
        Intrinsics.checkNotNull(str3);
        videoCompressor.saveVideoInExternal(context, strValidatedFileName2, str3, file);
        new File(context.getFilesDir(), strValidatedFileName2).delete();
        return new File("/storage/emulated/0/" + str3, strValidatedFileName2);
    }

    @w0(29)
    private final void saveVideoInExternal(Context context, String str, String str2, File file) throws IOException {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "video/mp4");
        contentValues.put("relative_path", str2);
        contentValues.put("is_pending", (Integer) 1);
        Uri contentUri = MediaStore.Video.Media.getContentUri("external_primary");
        if (Intrinsics.areEqual(str2, Environment.DIRECTORY_DOWNLOADS)) {
            contentUri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        }
        Uri uriInsert = context.getContentResolver().insert(contentUri, contentValues);
        if (uriInsert != null) {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uriInsert, "rw");
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i10 = fileInputStream.read(bArr);
                                if (i10 <= 0) {
                                    break;
                                } else {
                                    fileOutputStream.write(bArr, 0, i10);
                                }
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    c.a(fileOutputStream, th);
                                    throw th2;
                                }
                            }
                            Unit unit = Unit.f312394a;
                            c.a(fileInputStream, null);
                            c.a(fileOutputStream, null);
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                c.a(fileInputStream, th3);
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                } catch (Throwable th6) {
                    try {
                        throw th6;
                    } catch (Throwable th7) {
                        c.a(parcelFileDescriptorOpenFileDescriptor, th6);
                        throw th7;
                    }
                }
            }
            c.a(parcelFileDescriptorOpenFileDescriptor, null);
            contentValues.clear();
            contentValues.put("is_pending", (Integer) 0);
            context.getContentResolver().update(uriInsert, contentValues, null, null);
        }
    }

    @j
    @n
    public static final void start(@NotNull Context context, @NotNull List<? extends Uri> uris, @NotNull Configuration configureWith, @NotNull CompressionListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(configureWith, "configureWith");
        Intrinsics.checkNotNullParameter(listener, "listener");
        start$default(context, uris, false, null, null, configureWith, listener, 28, null);
    }

    public static /* synthetic */ void start$default(Context context, List list, boolean z10, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, Configuration configuration, CompressionListener compressionListener, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        start(context, list, z10, (i10 & 8) != 0 ? null : sharedStorageConfiguration, (i10 & 16) != 0 ? null : appSpecificStorageConfiguration, configuration, compressionListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object startCompression(int i10, Context context, Uri uri, String str, String str2, Configuration configuration, CompressionListener compressionListener, d<? super Result> dVar) {
        return i.h(l1.a(), new AnonymousClass2(i10, context, uri, str, str2, configuration, compressionListener, null), dVar);
    }

    static /* synthetic */ Object startCompression$default(VideoCompressor videoCompressor, int i10, Context context, Uri uri, String str, String str2, Configuration configuration, CompressionListener compressionListener, d dVar, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            str2 = null;
        }
        return videoCompressor.startCompression(i10, context, uri, str, str2, configuration, compressionListener, dVar);
    }

    private final String validatedFileName(String str, Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            str = str + "_temp";
        }
        if (StringsKt.V2(str, io.sentry.rrweb.j.Y, false, 2, null)) {
            return str;
        }
        return str + ".mp4";
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @j
    @n
    public static final void start(@NotNull Context context, @NotNull List<? extends Uri> uris, boolean z10, @NotNull Configuration configureWith, @NotNull CompressionListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(configureWith, "configureWith");
        Intrinsics.checkNotNullParameter(listener, "listener");
        start$default(context, uris, z10, null, null, configureWith, listener, 24, null);
    }

    @j
    @n
    public static final void start(@NotNull Context context, @NotNull List<? extends Uri> uris, boolean z10, @Nullable SharedStorageConfiguration sharedStorageConfiguration, @NotNull Configuration configureWith, @NotNull CompressionListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(configureWith, "configureWith");
        Intrinsics.checkNotNullParameter(listener, "listener");
        start$default(context, uris, z10, sharedStorageConfiguration, null, configureWith, listener, 16, null);
    }

    @j
    @n
    public static final void start(@NotNull Context context, @NotNull List<? extends Uri> uris, boolean z10, @Nullable SharedStorageConfiguration sharedStorageConfiguration, @Nullable AppSpecificStorageConfiguration appSpecificStorageConfiguration, @NotNull Configuration configureWith, @NotNull CompressionListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(configureWith, "configureWith");
        Intrinsics.checkNotNullParameter(listener, "listener");
        configureWith.getVideoNames().size();
        uris.size();
        INSTANCE.doVideoCompression(context, uris, z10, sharedStorageConfiguration, appSpecificStorageConfiguration, configureWith, listener);
    }
}
