package io.intercom.android.sdk.survey.ui.models;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.TimeFormatter;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.ranges.r;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.locationtech.jts.geom.l;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class Answer {
    public static final int $stable = 0;

    @w0(parameters = 1)
    public static final class DateTimeAnswer extends Answer {
        public static final int $stable = 0;
        private final long date;
        private final int hours;
        private final int minutes;

        public DateTimeAnswer(long j10, int i10, int i11) {
            super(null);
            this.date = j10;
            this.hours = i10;
            this.minutes = i11;
        }

        public static /* synthetic */ DateTimeAnswer copy$default(DateTimeAnswer dateTimeAnswer, long j10, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                j10 = dateTimeAnswer.date;
            }
            if ((i12 & 2) != 0) {
                i10 = dateTimeAnswer.hours;
            }
            if ((i12 & 4) != 0) {
                i11 = dateTimeAnswer.minutes;
            }
            return dateTimeAnswer.copy(j10, i10, i11);
        }

        private final String formatTime(int i10) {
            String str = new DecimalFormat("00").format(Integer.valueOf(r.u(i10, 0)));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }

        public final long component1() {
            return this.date;
        }

        public final int component2() {
            return this.hours;
        }

        public final int component3() {
            return this.minutes;
        }

        @NotNull
        public final DateTimeAnswer copy(long j10, int i10, int i11) {
            return new DateTimeAnswer(j10, i10, i11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DateTimeAnswer)) {
                return false;
            }
            DateTimeAnswer dateTimeAnswer = (DateTimeAnswer) obj;
            return this.date == dateTimeAnswer.date && this.hours == dateTimeAnswer.hours && this.minutes == dateTimeAnswer.minutes;
        }

        @NotNull
        public final String getAnswer() {
            return getDateAsString() + l.f338158h + formatTime(this.hours) + AbstractJsonLexerKt.COLON + formatTime(this.minutes) + ":00Z";
        }

        public final long getDate() {
            return this.date;
        }

        @NotNull
        public final String getDateAsString() {
            long j10 = this.date;
            if (j10 == -1) {
                return "";
            }
            String timeInMillisAsDate = TimeFormatter.formatTimeInMillisAsDate(j10, "YYYY-MM-dd");
            Intrinsics.checkNotNullExpressionValue(timeInMillisAsDate, "formatTimeInMillisAsDate(...)");
            return timeInMillisAsDate;
        }

        public final int getHours() {
            return this.hours;
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.date);
            sb2.append(this.hours);
            sb2.append(this.minutes);
            return sb2.toString().length();
        }

        @NotNull
        public final String getLocalTime() {
            int i10;
            int i11 = this.hours;
            if (i11 == -1 || (i10 = this.minutes) == -1) {
                return "";
            }
            String fromUtcTime = TimeFormatter.formatFromUtcTime(i11, i10);
            Intrinsics.checkNotNullExpressionValue(fromUtcTime, "formatFromUtcTime(...)");
            return fromUtcTime;
        }

        public final int getMinutes() {
            return this.minutes;
        }

        public int hashCode() {
            return (((Long.hashCode(this.date) * 31) + Integer.hashCode(this.hours)) * 31) + Integer.hashCode(this.minutes);
        }

        @NotNull
        public String toString() {
            return "DateTimeAnswer(date=" + this.date + ", hours=" + this.hours + ", minutes=" + this.minutes + ')';
        }
    }

    @w0(parameters = 0)
    public static final class MediaAnswer extends Answer {
        public static final int $stable = 8;

        @NotNull
        private final List<MediaItem> mediaItems;

        @w0(parameters = 0)
        public static abstract class FileUploadError {
            public static final int $stable = 8;

            @NotNull
            private final List<StringProvider.StringRes> errorMessages;

            @w0(parameters = 1)
            public static final class FileLimitExceeded extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FileLimitExceeded(@NotNull List<StringProvider.StringRes> message) {
                    super(message, null);
                    Intrinsics.checkNotNullParameter(message, "message");
                }
            }

            @w0(parameters = 1)
            public static final class FileTooLarge extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FileTooLarge(@NotNull List<StringProvider.StringRes> message) {
                    super(message, null);
                    Intrinsics.checkNotNullParameter(message, "message");
                }
            }

            @w0(parameters = 1)
            public static final class UnsupportedFileType extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UnsupportedFileType(@NotNull List<StringProvider.StringRes> message) {
                    super(message, null);
                    Intrinsics.checkNotNullParameter(message, "message");
                }
            }

            @w0(parameters = 1)
            public static final class UploadFailed extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UploadFailed(@NotNull List<StringProvider.StringRes> message) {
                    super(message, null);
                    Intrinsics.checkNotNullParameter(message, "message");
                }
            }

            public /* synthetic */ FileUploadError(List list, DefaultConstructorMarker defaultConstructorMarker) {
                this(list);
            }

            @NotNull
            public final List<StringProvider.StringRes> getErrorMessages() {
                return this.errorMessages;
            }

            private FileUploadError(List<StringProvider.StringRes> list) {
                this.errorMessages = list;
            }
        }

        @w0(parameters = 1)
        public static abstract class FileUploadStatus {
            public static final int $stable = 0;

            @w0(parameters = 0)
            public static final class Error extends FileUploadStatus {
                public static final int $stable = 8;

                @NotNull
                private final FileUploadError error;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Error(@NotNull FileUploadError error) {
                    super(null);
                    Intrinsics.checkNotNullParameter(error, "error");
                    this.error = error;
                }

                public static /* synthetic */ Error copy$default(Error error, FileUploadError fileUploadError, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        fileUploadError = error.error;
                    }
                    return error.copy(fileUploadError);
                }

                @NotNull
                public final FileUploadError component1() {
                    return this.error;
                }

                @NotNull
                public final Error copy(@NotNull FileUploadError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    return new Error(error);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Error) && Intrinsics.areEqual(this.error, ((Error) obj).error);
                }

                @NotNull
                public final FileUploadError getError() {
                    return this.error;
                }

                public int hashCode() {
                    return this.error.hashCode();
                }

                @NotNull
                public String toString() {
                    return "Error(error=" + this.error + ')';
                }
            }

            @w0(parameters = 1)
            public static final class None extends FileUploadStatus {
                public static final int $stable = 0;

                @NotNull
                public static final None INSTANCE = new None();

                private None() {
                    super(null);
                }
            }

            @w0(parameters = 1)
            public static final class Queued extends FileUploadStatus {
                public static final int $stable = 0;

                @NotNull
                public static final Queued INSTANCE = new Queued();

                private Queued() {
                    super(null);
                }
            }

            @w0(parameters = 1)
            public static final class Success extends FileUploadStatus {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: id, reason: collision with root package name */
                private final int f293421id;

                public Success(int i10) {
                    super(null);
                    this.f293421id = i10;
                }

                public static /* synthetic */ Success copy$default(Success success, int i10, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        i10 = success.f293421id;
                    }
                    return success.copy(i10);
                }

                public final int component1() {
                    return this.f293421id;
                }

                @NotNull
                public final Success copy(int i10) {
                    return new Success(i10);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Success) && this.f293421id == ((Success) obj).f293421id;
                }

                public final int getId() {
                    return this.f293421id;
                }

                public int hashCode() {
                    return Integer.hashCode(this.f293421id);
                }

                @NotNull
                public String toString() {
                    return "Success(id=" + this.f293421id + ')';
                }
            }

            @w0(parameters = 1)
            public static final class Uploading extends FileUploadStatus {
                public static final int $stable = 0;

                @NotNull
                public static final Uploading INSTANCE = new Uploading();

                private Uploading() {
                    super(null);
                }
            }

            public /* synthetic */ FileUploadStatus(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private FileUploadStatus() {
            }
        }

        @w0(parameters = 0)
        @SourceDebugExtension({"SMAP\nAnswer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Answer.kt\nio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,143:1\n85#2:144\n117#2,2:145\n85#2:147\n*S KotlinDebug\n*F\n+ 1 Answer.kt\nio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem\n*L\n106#1:144\n106#1:145,2\n107#1:147\n*E\n"})
        public static final class MediaItem {
            public static final int $stable = 8;

            @NotNull
            private final n3 _uploadStatus$delegate;

            @NotNull
            private final MediaData.Media data;

            @NotNull
            private final n7 uploadStatus$delegate;

            public MediaItem(@NotNull MediaData.Media data) {
                Intrinsics.checkNotNullParameter(data, "data");
                this.data = data;
                this._uploadStatus$delegate = d7.g(FileUploadStatus.None.INSTANCE, null, 2, null);
                this.uploadStatus$delegate = w6.e(new Function0() { // from class: bi.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Answer.MediaAnswer.MediaItem.uploadStatus_delegate$lambda$0(this.f82328a);
                    }
                });
            }

            public static /* synthetic */ MediaItem copy$default(MediaItem mediaItem, MediaData.Media media, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    media = mediaItem.data;
                }
                return mediaItem.copy(media);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private final FileUploadStatus get_uploadStatus() {
                return (FileUploadStatus) this._uploadStatus$delegate.getValue();
            }

            private final void set_uploadStatus(FileUploadStatus fileUploadStatus) {
                this._uploadStatus$delegate.setValue(fileUploadStatus);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final FileUploadStatus uploadStatus_delegate$lambda$0(MediaItem this$0) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return this$0.get_uploadStatus();
            }

            @NotNull
            public final MediaData.Media component1() {
                return this.data;
            }

            @NotNull
            public final MediaItem copy(@NotNull MediaData.Media data) {
                Intrinsics.checkNotNullParameter(data, "data");
                return new MediaItem(data);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MediaItem) && Intrinsics.areEqual(this.data, ((MediaItem) obj).data);
            }

            @NotNull
            public final MediaData.Media getData() {
                return this.data;
            }

            @NotNull
            public final FileUploadStatus getUploadStatus() {
                return (FileUploadStatus) this.uploadStatus$delegate.getValue();
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public final void setUploadStatus(@NotNull FileUploadStatus uploadStatus) {
                Intrinsics.checkNotNullParameter(uploadStatus, "uploadStatus");
                set_uploadStatus(uploadStatus);
            }

            @NotNull
            public String toString() {
                return "MediaItem(data=" + this.data + ')';
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaAnswer(@NotNull List<MediaItem> mediaItems) {
            super(null);
            Intrinsics.checkNotNullParameter(mediaItems, "mediaItems");
            this.mediaItems = mediaItems;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MediaAnswer copy$default(MediaAnswer mediaAnswer, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = mediaAnswer.mediaItems;
            }
            return mediaAnswer.copy(list);
        }

        @NotNull
        public final List<MediaItem> component1() {
            return this.mediaItems;
        }

        @NotNull
        public final MediaAnswer copy(@NotNull List<MediaItem> mediaItems) {
            Intrinsics.checkNotNullParameter(mediaItems, "mediaItems");
            return new MediaAnswer(mediaItems);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MediaAnswer) && Intrinsics.areEqual(this.mediaItems, ((MediaAnswer) obj).mediaItems);
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            return this.mediaItems.size();
        }

        @NotNull
        public final List<MediaItem> getMediaItems() {
            return this.mediaItems;
        }

        public int hashCode() {
            return this.mediaItems.hashCode();
        }

        @NotNull
        public String toString() {
            return "MediaAnswer(mediaItems=" + this.mediaItems + ')';
        }
    }

    @w0(parameters = 0)
    public static final class MultipleAnswer extends Answer {
        public static final int $stable = 8;

        @NotNull
        private final Set<String> answers;

        @NotNull
        private final OtherAnswer otherAnswer;

        @w0(parameters = 1)
        public static abstract class OtherAnswer {
            public static final int $stable = 0;

            @w0(parameters = 1)
            public static final class NotSelected extends OtherAnswer {
                public static final int $stable = 0;

                @NotNull
                public static final NotSelected INSTANCE = new NotSelected();

                private NotSelected() {
                    super(null);
                }
            }

            @w0(parameters = 1)
            public static final class SelectedNoText extends OtherAnswer {
                public static final int $stable = 0;

                @NotNull
                public static final SelectedNoText INSTANCE = new SelectedNoText();

                private SelectedNoText() {
                    super(null);
                }
            }

            @w0(parameters = 1)
            public static final class SelectedWithText extends OtherAnswer {
                public static final int $stable = 0;

                @NotNull
                private final String text;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SelectedWithText(@NotNull String text) {
                    super(null);
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.text = text;
                }

                public static /* synthetic */ SelectedWithText copy$default(SelectedWithText selectedWithText, String str, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = selectedWithText.text;
                    }
                    return selectedWithText.copy(str);
                }

                @NotNull
                public final String component1() {
                    return this.text;
                }

                @NotNull
                public final SelectedWithText copy(@NotNull String text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    return new SelectedWithText(text);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof SelectedWithText) && Intrinsics.areEqual(this.text, ((SelectedWithText) obj).text);
                }

                @NotNull
                public final String getText() {
                    return this.text;
                }

                public int hashCode() {
                    return this.text.hashCode();
                }

                @Override // io.intercom.android.sdk.survey.ui.models.Answer.MultipleAnswer.OtherAnswer
                @NotNull
                public String toString() {
                    return this.text;
                }
            }

            public /* synthetic */ OtherAnswer(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public String toString() {
                return "";
            }

            private OtherAnswer() {
            }
        }

        public /* synthetic */ MultipleAnswer(Set set, OtherAnswer otherAnswer, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(set, (i10 & 2) != 0 ? OtherAnswer.NotSelected.INSTANCE : otherAnswer);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultipleAnswer copy$default(MultipleAnswer multipleAnswer, Set set, OtherAnswer otherAnswer, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                set = multipleAnswer.answers;
            }
            if ((i10 & 2) != 0) {
                otherAnswer = multipleAnswer.otherAnswer;
            }
            return multipleAnswer.copy(set, otherAnswer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence getLength$lambda$1(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }

        @NotNull
        public final Set<String> component1() {
            return this.answers;
        }

        @NotNull
        public final OtherAnswer component2() {
            return this.otherAnswer;
        }

        @NotNull
        public final MultipleAnswer copy(@NotNull Set<String> answers, @NotNull OtherAnswer otherAnswer) {
            Intrinsics.checkNotNullParameter(answers, "answers");
            Intrinsics.checkNotNullParameter(otherAnswer, "otherAnswer");
            return new MultipleAnswer(answers, otherAnswer);
        }

        @NotNull
        public final Answer copyWithAnswerToggled(@NotNull String answer) {
            Intrinsics.checkNotNullParameter(answer, "answer");
            Set mutableSet = CollectionsKt.toMutableSet(this.answers);
            if (this.answers.contains(answer)) {
                mutableSet.remove(answer);
            } else {
                mutableSet.add(answer);
            }
            return (mutableSet.isEmpty() && (this.otherAnswer instanceof OtherAnswer.NotSelected)) ? NoAnswer.ResetNoAnswer.INSTANCE : copy$default(this, mutableSet, null, 2, null);
        }

        @NotNull
        public final Answer copyWithOther(@NotNull OtherAnswer otherAnswer) {
            Intrinsics.checkNotNullParameter(otherAnswer, "otherAnswer");
            return (this.answers.isEmpty() && (otherAnswer instanceof OtherAnswer.NotSelected)) ? NoAnswer.ResetNoAnswer.INSTANCE : copy$default(this, null, otherAnswer, 1, null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultipleAnswer)) {
                return false;
            }
            MultipleAnswer multipleAnswer = (MultipleAnswer) obj;
            return Intrinsics.areEqual(this.answers, multipleAnswer.answers) && Intrinsics.areEqual(this.otherAnswer, multipleAnswer.otherAnswer);
        }

        @NotNull
        /* JADX INFO: renamed from: getAnswers, reason: collision with other method in class */
        public final Set<String> m473getAnswers() {
            return this.answers;
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            return CollectionsKt.joinToString$default(this.answers, null, null, null, 0, null, new Function1() { // from class: bi.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Answer.MultipleAnswer.getLength$lambda$1((String) obj);
                }
            }, 31, null).length();
        }

        @NotNull
        public final OtherAnswer getOtherAnswer() {
            return this.otherAnswer;
        }

        public int hashCode() {
            return (this.answers.hashCode() * 31) + this.otherAnswer.hashCode();
        }

        @NotNull
        public String toString() {
            return "MultipleAnswer(answers=" + this.answers + ", otherAnswer=" + this.otherAnswer + ')';
        }

        @NotNull
        public final List<String> getAnswers() {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            listCreateListBuilder.addAll(CollectionsKt.toList(this.answers));
            OtherAnswer otherAnswer = this.otherAnswer;
            if (!Intrinsics.areEqual(otherAnswer, OtherAnswer.NotSelected.INSTANCE)) {
                if (Intrinsics.areEqual(otherAnswer, OtherAnswer.SelectedNoText.INSTANCE)) {
                    listCreateListBuilder.add("Other");
                } else {
                    if (!(otherAnswer instanceof OtherAnswer.SelectedWithText)) {
                        throw new k0();
                    }
                    listCreateListBuilder.add(((OtherAnswer.SelectedWithText) this.otherAnswer).getText());
                }
            }
            return CollectionsKt.build(listCreateListBuilder);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultipleAnswer(@NotNull Set<String> answers, @NotNull OtherAnswer otherAnswer) {
            super(null);
            Intrinsics.checkNotNullParameter(answers, "answers");
            Intrinsics.checkNotNullParameter(otherAnswer, "otherAnswer");
            this.answers = answers;
            this.otherAnswer = otherAnswer;
        }
    }

    @w0(parameters = 1)
    public static abstract class NoAnswer extends Answer {
        public static final int $stable = 0;

        @w0(parameters = 1)
        public static final class InitialNoAnswer extends NoAnswer {
            public static final int $stable = 0;

            @NotNull
            public static final InitialNoAnswer INSTANCE = new InitialNoAnswer();

            private InitialNoAnswer() {
                super(null);
            }
        }

        @w0(parameters = 1)
        public static final class ResetNoAnswer extends NoAnswer {
            public static final int $stable = 0;

            @NotNull
            public static final ResetNoAnswer INSTANCE = new ResetNoAnswer();

            private ResetNoAnswer() {
                super(null);
            }
        }

        public /* synthetic */ NoAnswer(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            return 0;
        }

        private NoAnswer() {
            super(null);
        }
    }

    @w0(parameters = 1)
    public static final class SingleAnswer extends Answer {
        public static final int $stable = 0;

        @NotNull
        private final String answer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SingleAnswer(@NotNull String answer) {
            super(null);
            Intrinsics.checkNotNullParameter(answer, "answer");
            this.answer = answer;
        }

        public static /* synthetic */ SingleAnswer copy$default(SingleAnswer singleAnswer, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = singleAnswer.answer;
            }
            return singleAnswer.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.answer;
        }

        @NotNull
        public final SingleAnswer copy(@NotNull String answer) {
            Intrinsics.checkNotNullParameter(answer, "answer");
            return new SingleAnswer(answer);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof SingleAnswer) && Intrinsics.areEqual(this.answer, ((SingleAnswer) obj).answer)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final String getAnswer() {
            return this.answer;
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            return this.answer.length();
        }

        public int hashCode() {
            return this.answer.hashCode();
        }

        @NotNull
        public String toString() {
            return "SingleAnswer(answer=" + this.answer + ')';
        }
    }

    public /* synthetic */ Answer(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getLength();

    private Answer() {
    }
}
