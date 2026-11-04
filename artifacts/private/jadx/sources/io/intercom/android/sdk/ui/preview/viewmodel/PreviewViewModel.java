package io.intercom.android.sdk.ui.preview.viewmodel;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.webkit.URLUtil;
import android.widget.Toast;
import androidx.compose.runtime.internal.w0;
import androidx.exifinterface.media.a;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.j2;
import androidx.lifecycle.m2;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt;
import io.intercom.android.sdk.ui.preview.data.DeleteType;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.model.PreviewUiState;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.io.c;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPreviewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewViewModel.kt\nio/intercom/android/sdk/ui/preview/viewmodel/PreviewViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,438:1\n226#2,5:439\n226#2,5:445\n1#3:444\n*S KotlinDebug\n*F\n+ 1 PreviewViewModel.kt\nio/intercom/android/sdk/ui/preview/viewmodel/PreviewViewModel\n*L\n66#1:439,5\n411#1:445,5\n*E\n"})
public final class PreviewViewModel extends f2 {

    @NotNull
    private final k0<PreviewUiState> _state;

    @Nullable
    private p2 downloadJob;

    @NotNull
    private final IntercomPreviewArgs previewArgs;

    @NotNull
    private final z0<PreviewUiState> state;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PreviewViewModel create$intercom_sdk_ui_release(@NotNull m2 owner, @NotNull IntercomPreviewArgs previewArgs) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(previewArgs, "previewArgs");
            return (PreviewViewModel) new j2(owner, factory$intercom_sdk_ui_release(previewArgs)).c(PreviewViewModel.class);
        }

        @NotNull
        public final j2.c factory$intercom_sdk_ui_release(@NotNull final IntercomPreviewArgs previewArgs) {
            Intrinsics.checkNotNullParameter(previewArgs, "previewArgs");
            return new j2.c() { // from class: io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$Companion$factory$1
                @Override // androidx.lifecycle.j2.c
                public <T extends f2> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    return new PreviewViewModel(previewArgs);
                }
            };
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$saveDocument$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$saveDocument$1", f = "PreviewViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ IntercomPreviewFile.NetworkFile $file;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(IntercomPreviewFile.NetworkFile networkFile, Context context, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$file = networkFile;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return PreviewViewModel.this.new AnonymousClass1(this.$file, this.$context, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            PreviewViewModel.this.saveFileOnApi29Above(this.$file.getUrl(), this.$file.getMimeType(), this.$context);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$saveImage$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$saveImage$1", f = "PreviewViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C28401 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ IntercomPreviewFile.NetworkFile $file;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28401(IntercomPreviewFile.NetworkFile networkFile, Context context, d<? super C28401> dVar) {
            super(2, dVar);
            this.$file = networkFile;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return PreviewViewModel.this.new C28401(this.$file, this.$context, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Bitmap bitmapPrepareBitmap = PreviewViewModel.this.prepareBitmap(this.$file.getUrl());
            if (bitmapPrepareBitmap == null) {
                PreviewViewModel.this.showFileSaveFailed(this.$context);
                return Unit.f312394a;
            }
            PreviewViewModel.this.saveImageOnApi29Above(bitmapPrepareBitmap, this.$file.getUrl(), this.$file.getMimeType(), this.$context);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C28401) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$saveVideo$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$saveVideo$1", f = "PreviewViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C28411 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ IntercomPreviewFile.NetworkFile $file;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28411(IntercomPreviewFile.NetworkFile networkFile, Context context, d<? super C28411> dVar) {
            super(2, dVar);
            this.$file = networkFile;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return PreviewViewModel.this.new C28411(this.$file, this.$context, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            PreviewViewModel.this.saveVideoOnApi29Above(this.$file.getUrl(), this.$file.getMimeType(), this.$context);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C28411) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$showFileSaveFailed$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$showFileSaveFailed$1", f = "PreviewViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C28421 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        int label;
        final /* synthetic */ PreviewViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28421(Context context, PreviewViewModel previewViewModel, d<? super C28421> dVar) {
            super(2, dVar);
            this.$context = context;
            this.this$0 = previewViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C28421(this.$context, this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Toast.makeText(this.$context, ((PreviewUiState) this.this$0._state.getValue()).getSaveFailedText(), 0).show();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C28421) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$showFileSaveSuccess$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$showFileSaveSuccess$1", f = "PreviewViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C28431 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        int label;
        final /* synthetic */ PreviewViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28431(Context context, PreviewViewModel previewViewModel, d<? super C28431> dVar) {
            super(2, dVar);
            this.$context = context;
            this.this$0 = previewViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C28431(this.$context, this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Toast.makeText(this.$context, ((PreviewUiState) this.this$0._state.getValue()).getFileSavedText(), 0).show();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C28431) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public PreviewViewModel(@NotNull IntercomPreviewArgs previewArgs) {
        Intrinsics.checkNotNullParameter(previewArgs, "previewArgs");
        this.previewArgs = previewArgs;
        int i10 = 2 << 0;
        k0<PreviewUiState> k0VarA = b1.a(new PreviewUiState(null, 0, false, false, null, false, null, null, null, 511, null));
        this._state = k0VarA;
        this.state = k0VarA;
        k0VarA.setValue(new PreviewUiState(previewArgs.getUris(), 0, showDeleteAction(previewArgs.getUris().size()), previewArgs.getShowSendCTA(), previewArgs.getCtaText(), previewArgs.getDownloadState().getShowDownloadAction(), previewArgs.getDownloadState().getFileSavingText(), previewArgs.getDownloadState().getFileSavedText(), previewArgs.getDownloadState().getSaveFailedText(), 2, null));
    }

    @androidx.annotation.w0(29)
    private final String getNonExistingFileNameFromUrl(String str, Uri uri, String str2, Context context) throws IOException {
        String strGuessFileName = URLUtil.guessFileName(str, null, str2);
        Intrinsics.checkNotNull(strGuessFileName);
        List listSplit$default = StringsKt.split$default(strGuessFileName, new String[]{"."}, false, 2, 2, null);
        int i10 = 0;
        String str3 = (String) CollectionsKt.getOrNull(listSplit$default, 0);
        if (str3 == null) {
            str3 = "fileName";
        }
        Pair pair = TuplesKt.to(str3, CollectionsKt.getOrNull(listSplit$default, 1));
        String str4 = (String) pair.component1();
        String str5 = (String) pair.component2();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_display_name"}, "_display_name LIKE ? AND _display_name LIKE ?", new String[]{str4 + '%', "%." + str5}, null);
        if (cursorQuery != null) {
            try {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_display_name");
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndexOrThrow);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    arrayList.add(string);
                }
                Unit unit = Unit.f312394a;
                c.a(cursorQuery, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    c.a(cursorQuery, th2);
                    throw th3;
                }
            }
        }
        while (true) {
            i10++;
            if (!arrayList.contains(strGuessFileName)) {
                Intrinsics.checkNotNull(strGuessFileName);
                return strGuessFileName;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4 + " (" + i10 + ')');
            if (str5 != null) {
                sb2.append('.' + str5);
            }
            strGuessFileName = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(strGuessFileName, "toString(...)");
        }
    }

    private final String getNonExistingFileNameFromUrlLegacy(String str, File file, String str2) {
        String strGuessFileName = URLUtil.guessFileName(str, null, str2);
        Intrinsics.checkNotNull(strGuessFileName);
        List listSplit$default = StringsKt.split$default(strGuessFileName, new String[]{"."}, false, 2, 2, null);
        int i10 = 0;
        String str3 = (String) CollectionsKt.getOrNull(listSplit$default, 0);
        if (str3 == null) {
            str3 = "fileName";
        }
        Pair pair = TuplesKt.to(str3, CollectionsKt.getOrNull(listSplit$default, 1));
        String str4 = (String) pair.component1();
        String str5 = (String) pair.component2();
        while (true) {
            i10++;
            if (!new File(file, strGuessFileName).exists()) {
                Intrinsics.checkNotNull(strGuessFileName);
                return strGuessFileName;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4 + " (" + i10 + ')');
            if (str5 != null) {
                sb2.append('.' + str5);
            }
            strGuessFileName = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(strGuessFileName, "toString(...)");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap prepareBitmap(String str) {
        int i10;
        try {
            int iP = new a(((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection())).getInputStream()).p(a.D, 1);
            if (iP == 3) {
                i10 = 180;
            } else if (iP != 6) {
                i10 = iP != 8 ? 0 : 270;
            } else {
                i10 = 90;
            }
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection())).getInputStream());
            Intrinsics.checkNotNull(bitmapDecodeStream);
            return rotate(bitmapDecodeStream, i10);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private final Bitmap rotate(Bitmap bitmap, float f10) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    private final void saveDocument(IntercomPreviewFile.NetworkFile networkFile, Context context) {
        this.downloadJob = k.f(g2.a(this), l1.c(), null, new AnonymousClass1(networkFile, context, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveFileLegacy(String str, String str2, Context context, String str3) throws IOException {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(str3);
        externalStoragePublicDirectory.mkdir();
        Intrinsics.checkNotNull(externalStoragePublicDirectory);
        saveFileToStream(str, new FileOutputStream(new File(externalStoragePublicDirectory, getNonExistingFileNameFromUrlLegacy(str, externalStoragePublicDirectory, str2))));
        showFileSaveSuccess(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.w0(29)
    public final void saveFileOnApi29Above(String str, String str2, Context context) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            Uri EXTERNAL_CONTENT_URI = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
            Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
            String nonExistingFileNameFromUrl = getNonExistingFileNameFromUrl(str, EXTERNAL_CONTENT_URI, str2, context);
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", nonExistingFileNameFromUrl);
            contentValues.put("mime_type", str2);
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
            ContentResolver contentResolver = context.getContentResolver();
            Uri uriInsert = contentResolver.insert(MediaStore.Files.getContentUri("external"), contentValues);
            if (uriInsert == null || (parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uriInsert, "w")) == null) {
                return;
            }
            saveFileToStream(str, new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()));
            parcelFileDescriptorOpenFileDescriptor.close();
            contentValues.clear();
            contentResolver.update(uriInsert, contentValues, null, null);
            showFileSaveSuccess(context);
        } catch (Exception e10) {
            e10.printStackTrace();
            showFileSaveFailed(context);
        }
    }

    private final void saveFileToStream(String str, OutputStream outputStream) throws IOException {
        InputStream inputStream = ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection())).getInputStream();
        if (inputStream != null) {
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 <= 0) {
                    break;
                } else {
                    outputStream.write(bArr, 0, i10);
                }
            }
            inputStream.close();
        }
        outputStream.close();
    }

    private final void saveImage(IntercomPreviewFile.NetworkFile networkFile, Context context) {
        this.downloadJob = k.f(g2.a(this), l1.c(), null, new C28401(networkFile, context, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveImageLegacy(Bitmap bitmap, String str, String str2, Context context) throws IOException {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        externalStoragePublicDirectory.mkdir();
        Intrinsics.checkNotNull(externalStoragePublicDirectory);
        saveImageToStream(bitmap, new FileOutputStream(new File(externalStoragePublicDirectory, getNonExistingFileNameFromUrlLegacy(str, externalStoragePublicDirectory, str2))));
        showFileSaveSuccess(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.w0(29)
    public final void saveImageOnApi29Above(Bitmap bitmap, String str, String str2, Context context) {
        OutputStream outputStreamOpenOutputStream;
        try {
            Uri EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
            String nonExistingFileNameFromUrl = getNonExistingFileNameFromUrl(str, EXTERNAL_CONTENT_URI, str2, context);
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", nonExistingFileNameFromUrl);
            contentValues.put("mime_type", str2);
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
            contentValues.put("is_pending", (Integer) 1);
            Uri uriInsert = context.getContentResolver().insert(EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert == null || (outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriInsert)) == null) {
                return;
            }
            saveImageToStream(bitmap, outputStreamOpenOutputStream);
            contentValues.clear();
            contentValues.put("is_pending", (Integer) 0);
            context.getContentResolver().update(uriInsert, contentValues, null, null);
            showFileSaveSuccess(context);
        } catch (Exception e10) {
            e10.printStackTrace();
            showFileSaveFailed(context);
        }
    }

    private final void saveImageToStream(Bitmap bitmap, OutputStream outputStream) throws IOException {
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
        outputStream.close();
    }

    private final void saveVideo(IntercomPreviewFile.NetworkFile networkFile, Context context) {
        this.downloadJob = k.f(g2.a(this), l1.c(), null, new C28411(networkFile, context, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.w0(29)
    public final void saveVideoOnApi29Above(String str, String str2, Context context) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            Uri EXTERNAL_CONTENT_URI = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
            String nonExistingFileNameFromUrl = getNonExistingFileNameFromUrl(str, EXTERNAL_CONTENT_URI, str2, context);
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", nonExistingFileNameFromUrl);
            contentValues.put("mime_type", str2);
            contentValues.put("relative_path", Environment.DIRECTORY_MOVIES);
            contentValues.put("is_pending", (Integer) 1);
            ContentResolver contentResolver = context.getContentResolver();
            Uri uriInsert = contentResolver.insert(EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert == null || (parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uriInsert, "w")) == null) {
                return;
            }
            saveFileToStream(str, new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()));
            parcelFileDescriptorOpenFileDescriptor.close();
            contentValues.clear();
            contentValues.put("is_pending", (Integer) 0);
            contentResolver.update(uriInsert, contentValues, null, null);
            showFileSaveSuccess(context);
        } catch (Exception e10) {
            e10.printStackTrace();
            showFileSaveFailed(context);
        }
    }

    private final boolean showDeleteAction(int i10) {
        DeleteType deleteType = this.previewArgs.getDeleteType();
        if (Intrinsics.areEqual(deleteType, DeleteType.None.INSTANCE)) {
            return false;
        }
        if (Intrinsics.areEqual(deleteType, DeleteType.Delete.INSTANCE)) {
            return true;
        }
        if (Intrinsics.areEqual(deleteType, DeleteType.Remove.INSTANCE)) {
            return i10 > 1;
        }
        throw new kotlin.k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFileSaveFailed(Context context) {
        k.f(g2.a(this), l1.e(), null, new C28421(context, this, null), 2, null);
    }

    private final void showFileSaveSuccess(Context context) {
        k.f(g2.a(this), l1.e(), null, new C28431(context, this, null), 2, null);
    }

    @NotNull
    public final z0<PreviewUiState> getState$intercom_sdk_ui_release() {
        return this.state;
    }

    public final void onDeleteClicked$intercom_sdk_ui_release(@NotNull IntercomPreviewFile file) {
        PreviewUiState value;
        PreviewUiState previewUiState;
        List listMinus;
        Intrinsics.checkNotNullParameter(file, "file");
        k0<PreviewUiState> k0Var = this._state;
        do {
            value = k0Var.getValue();
            previewUiState = value;
            listMinus = CollectionsKt.minus(previewUiState.getFiles(), file);
        } while (!k0Var.compareAndSet(value, PreviewUiState.copy$default(previewUiState, listMinus, 0, showDeleteAction(listMinus.size()), false, null, false, null, null, null, 506, null)));
    }

    public final void onPageNavigated$intercom_sdk_ui_release(int i10) {
        k0<PreviewUiState> k0Var = this._state;
        while (true) {
            PreviewUiState value = k0Var.getValue();
            int i11 = i10;
            if (k0Var.compareAndSet(value, PreviewUiState.copy$default(value, null, i11, false, false, null, false, null, null, null, 509, null))) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public final void saveFile$intercom_sdk_ui_release(@NotNull IntercomPreviewFile file, @NotNull Context context) {
        boolean z10;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(context, "context");
        p2 p2Var = this.downloadJob;
        if (p2Var != null) {
            z10 = p2Var.isActive();
        }
        if (!(file instanceof IntercomPreviewFile.NetworkFile) || z10) {
            return;
        }
        Toast.makeText(context, this._state.getValue().getFileSavingText(), 0).show();
        String mimeType = file.getMimeType(context);
        if (ContentTypeExtensionKt.isImage(mimeType)) {
            saveImage((IntercomPreviewFile.NetworkFile) file, context);
        } else if (ContentTypeExtensionKt.isVideo(mimeType)) {
            saveVideo((IntercomPreviewFile.NetworkFile) file, context);
        } else {
            saveDocument((IntercomPreviewFile.NetworkFile) file, context);
        }
    }
}
