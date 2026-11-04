package io.intercom.android.sdk.helpcenter.sections;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@b0
public final class Author {
    public static final int $stable = 0;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final Avatar avatar;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f291620id;

    @NotNull
    private final String name;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<Author> serializer() {
            return Author$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Author(int i10, String str, String str2, Avatar avatar, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, Author$$serializer.INSTANCE.getDescriptor());
        }
        this.f291620id = str;
        if ((i10 & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i10 & 4) != 0) {
            this.avatar = avatar;
            return;
        }
        this.avatar = new Avatar((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ Author copy$default(Author author, String str, String str2, Avatar avatar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = author.f291620id;
        }
        if ((i10 & 2) != 0) {
            str2 = author.name;
        }
        if ((i10 & 4) != 0) {
            avatar = author.avatar;
        }
        return author.copy(str, str2, avatar);
    }

    @a0("avatar")
    public static /* synthetic */ void getAvatar$annotations() {
    }

    @a0("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @a0("display_name")
    public static /* synthetic */ void getName$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n
    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Author author, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, author.f291620id);
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.areEqual(author.name, "")) {
            eVar.encodeStringElement(serialDescriptor, 1, author.name);
        }
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 2)) {
            if (Intrinsics.areEqual(author.avatar, new Avatar((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
                return;
            }
        }
        eVar.encodeSerializableElement(serialDescriptor, 2, Avatar$$serializer.INSTANCE, author.avatar);
    }

    @NotNull
    public final String component1() {
        return this.f291620id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final Avatar component3() {
        return this.avatar;
    }

    @NotNull
    public final Author copy(@NotNull String id2, @NotNull String name, @NotNull Avatar avatar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        return new Author(id2, name, avatar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Author)) {
            return false;
        }
        Author author = (Author) obj;
        return Intrinsics.areEqual(this.f291620id, author.f291620id) && Intrinsics.areEqual(this.name, author.name) && Intrinsics.areEqual(this.avatar, author.avatar);
    }

    @NotNull
    public final Avatar getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final String getId() {
        return this.f291620id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.f291620id.hashCode() * 31) + this.name.hashCode()) * 31) + this.avatar.hashCode();
    }

    @NotNull
    public String toString() {
        return "Author(id=" + this.f291620id + ", name=" + this.name + ", avatar=" + this.avatar + ')';
    }

    public Author(@NotNull String id2, @NotNull String name, @NotNull Avatar avatar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        this.f291620id = id2;
        this.name = name;
        this.avatar = avatar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Author(String str, String str2, Avatar avatar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? new Avatar((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : avatar);
    }
}
