package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.blocks.lib.BlockType;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
public class Link implements Parcelable {
    public static final Parcelable.Creator<Link> CREATOR = new Parcelable.Creator<Link>() { // from class: io.intercom.android.sdk.blocks.lib.models.Link.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Link createFromParcel(Parcel parcel) {
            return new Link(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Link[] newArray(int i10) {
            return new Link[i10];
        }
    };
    private final String articleId;
    private final Author author;
    private final Map<String, String> data;
    private final String description;
    private final Image image;
    private final String linkType;
    private final String siteName;
    private final String text;
    private final String title;
    private final BlockType type;
    private final String url;

    public static final class Builder {
        String articleId;
        Author author;
        Map<String, String> data;
        String description;
        Image image;
        String linkType;
        String siteName;
        String text;
        String title;
        String type;
        String url;

        public Link build() {
            return new Link(this);
        }

        public Builder withArticleId(String str) {
            this.articleId = str;
            return this;
        }

        public Builder withAuthor(Author author) {
            this.author = author;
            return this;
        }

        public Builder withData(Map<String, String> map) {
            this.data = map;
            return this;
        }

        public Builder withDescription(String str) {
            this.description = str;
            return this;
        }

        public Builder withImage(Image image) {
            this.image = image;
            return this;
        }

        public Builder withLinkType(String str) {
            this.linkType = str;
            return this;
        }

        public Builder withSiteName(String str) {
            this.siteName = str;
            return this;
        }

        public Builder withText(String str) {
            this.text = str;
            return this;
        }

        public Builder withTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder withType(String str) {
            this.type = str;
            return this;
        }

        public Builder withUrl(String str) {
            this.url = str;
            return this;
        }
    }

    public static Link fromBlock(Block block) {
        if (block == null) {
            return new Link();
        }
        Builder builder = new Builder();
        builder.type = block.getType().name();
        builder.text = block.getText();
        builder.title = block.getTitle();
        builder.description = block.getDescription();
        builder.linkType = block.getLinkType();
        builder.author = block.getAuthor();
        builder.image = block.getImage();
        builder.data = block.getData();
        builder.siteName = block.getSiteName();
        builder.articleId = block.getArticleId();
        builder.url = block.getUrl();
        return new Link(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Link link = (Link) obj;
            if (this.type != link.type) {
                return false;
            }
            String str = this.text;
            if (str == null ? link.text != null : !str.equals(link.text)) {
                return false;
            }
            String str2 = this.title;
            if (str2 == null ? link.title != null : !str2.equals(link.title)) {
                return false;
            }
            String str3 = this.description;
            if (str3 == null ? link.description != null : !str3.equals(link.description)) {
                return false;
            }
            String str4 = this.linkType;
            if (str4 == null ? link.linkType != null : !str4.equals(link.linkType)) {
                return false;
            }
            Author author = this.author;
            if (author == null ? link.author != null : !author.equals(link.author)) {
                return false;
            }
            Image image = this.image;
            if (image == null ? link.image != null : !image.equals(link.image)) {
                return false;
            }
            Map<String, String> map = this.data;
            if (map == null ? link.data != null : !map.equals(link.data)) {
                return false;
            }
            String str5 = this.siteName;
            if (str5 == null ? link.siteName != null : !str5.equals(link.siteName)) {
                return false;
            }
            String str6 = this.articleId;
            if (str6 == null ? link.articleId != null : !str6.equals(link.articleId)) {
                return false;
            }
            String str7 = this.url;
            if (str7 != null) {
                return str7.equals(link.url);
            }
            if (link.url == null) {
                return true;
            }
        }
        return false;
    }

    public String getArticleId() {
        return this.articleId;
    }

    public Author getAuthor() {
        return this.author;
    }

    public Map<String, String> getData() {
        return this.data;
    }

    public String getDescription() {
        return this.description;
    }

    public Image getImage() {
        return this.image;
    }

    public String getLinkType() {
        return this.linkType;
    }

    public String getSiteName() {
        return this.siteName;
    }

    public String getText() {
        return this.text;
    }

    public String getTitle() {
        return this.title;
    }

    public BlockType getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        BlockType blockType = this.type;
        int iHashCode = (blockType != null ? blockType.hashCode() : 0) * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.linkType;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Author author = this.author;
        int iHashCode6 = (iHashCode5 + (author != null ? author.hashCode() : 0)) * 31;
        Image image = this.image;
        int iHashCode7 = (iHashCode6 + (image != null ? image.hashCode() : 0)) * 31;
        Map<String, String> map = this.data;
        int iHashCode8 = (iHashCode7 + (map != null ? map.hashCode() : 0)) * 31;
        String str5 = this.siteName;
        int iHashCode9 = (iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.articleId;
        int iHashCode10 = (iHashCode9 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.url;
        return iHashCode10 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "LinkCard{type=" + this.type + ", text='" + this.text + "', title='" + this.title + "', description='" + this.description + "', linkType='" + this.linkType + "', author=" + this.author + ", image=" + this.image + ", data=" + this.data + ", siteName='" + this.siteName + "', articleId='" + this.articleId + "', url='" + this.url + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.type.name());
        parcel.writeString(this.text);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.linkType);
        parcel.writeString(this.siteName);
        parcel.writeString(this.articleId);
        parcel.writeString(this.url);
        parcel.writeParcelable(this.author, i10);
        parcel.writeParcelable(this.image, i10);
        parcel.writeInt(this.data.size());
        for (Map.Entry<String, String> entry : this.data.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    Link() {
        this(new Builder());
    }

    private Link(Builder builder) {
        this.type = BlockType.typeValueOf(builder.type);
        String str = builder.text;
        this.text = str == null ? "" : str;
        String str2 = builder.title;
        this.title = str2 == null ? "" : str2;
        String str3 = builder.description;
        this.description = str3 == null ? "" : str3;
        String str4 = builder.linkType;
        this.linkType = str4 == null ? "" : str4;
        String str5 = builder.siteName;
        this.siteName = str5 == null ? "" : str5;
        String str6 = builder.articleId;
        this.articleId = str6 == null ? "" : str6;
        Author author = builder.author;
        this.author = author == null ? new Author() : author;
        Image image = builder.image;
        this.image = image == null ? new Image() : image;
        Map<String, String> map = builder.data;
        this.data = map == null ? new HashMap<>() : map;
        String str7 = builder.url;
        this.url = str7 != null ? str7 : "";
    }

    protected Link(Parcel parcel) {
        this.type = BlockType.typeValueOf(parcel.readString());
        this.text = parcel.readString();
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.linkType = parcel.readString();
        this.siteName = parcel.readString();
        this.articleId = parcel.readString();
        this.url = parcel.readString();
        this.author = (Author) parcel.readParcelable(Author.class.getClassLoader());
        this.image = (Image) parcel.readParcelable(Image.class.getClassLoader());
        this.data = new HashMap();
        int i10 = parcel.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            this.data.put(parcel.readString(), parcel.readString());
        }
    }
}
