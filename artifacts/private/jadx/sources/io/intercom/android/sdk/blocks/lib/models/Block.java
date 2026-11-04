package io.intercom.android.sdk.blocks.lib.models;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.BlockType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
public class Block implements Parcelable {
    public static final Parcelable.Creator<Block> CREATOR = new Parcelable.Creator<Block>() { // from class: io.intercom.android.sdk.blocks.lib.models.Block.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Block createFromParcel(Parcel parcel) {
            return new Block(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Block[] newArray(int i10) {
            return new Block[i10];
        }
    };
    private final BlockAlignment align;
    private final String articleId;
    private final List<BlockAttachment> attachments;
    private final String attribution;
    private final Author author;
    private final Map<String, String> data;
    private final String description;
    private final long duration;
    private final String fallbackUrl;
    private final Link footerLink;
    private final int height;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f291536id;
    private final Image image;
    private final int imageHeight;
    private final String imageUrl;
    private final int imageWidth;
    private final List<String> items;
    private final String language;
    private final String linkType;
    private final String linkUrl;
    private final List<Link> links;
    private final Uri local_uri;
    private final List<ConversationRatingOption> options;
    private final String previewUrl;
    private final String provider;
    private final int ratingIndex;
    private final String remark;
    private final String siteName;
    private final String text;
    private final String thumbnailUrl;
    private int ticketTypeId;
    private final TicketType ticket_type;
    private final String ticket_type_title;
    private final String title;
    private final String trackingUrl;
    private final BlockType type;
    private final String url;
    private final String username;
    private final int width;

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.models.Block$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType;

        static {
            int[] iArr = new int[BlockType.values().length];
            $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType = iArr;
            try {
                iArr[BlockType.PARAGRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType[BlockType.LOCALIMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType[BlockType.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType[BlockType.LOCAL_ATTACHMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class Builder {
        String align;
        String articleId;
        List<BlockAttachment> attachments;
        String attribution;
        Author author;
        Map<String, String> data;
        String description;
        Long duration;
        String fallbackUrl;
        Builder footerLink;
        Integer height;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        String f291537id;
        Image image;
        Integer imageHeight;
        String imageUrl;
        Integer imageWidth;
        List<String> items;
        String language;
        String linkType;
        String linkUrl;
        List<Builder> links;
        Uri local_uri;
        List<ConversationRatingOption.Builder> options;
        String previewUrl;
        String provider;
        Integer ratingIndex;
        Integer rating_index;
        String remark;
        String siteName;
        String text;
        String thumbnailUrl;
        TicketType ticket_type;
        int ticket_type_id;
        String ticket_type_title;
        String title;
        String trackingUrl;
        String type;
        String url;
        String username;
        Integer width;

        public Block build() {
            return new Block(this);
        }

        /* JADX WARN: Code restructure failed: missing block: B:106:0x010a, code lost:
        
            if (r6.url != null) goto L107;
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x011f, code lost:
        
            if (r6.thumbnailUrl != null) goto L115;
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x0148, code lost:
        
            if (r6.trackingUrl != null) goto L131;
         */
        /* JADX WARN: Code restructure failed: missing block: B:155:0x0185, code lost:
        
            if (r6.provider != null) goto L156;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
        
            if (r6.type != null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:212:0x0216, code lost:
        
            if (r6.attribution != null) goto L213;
         */
        /* JADX WARN: Code restructure failed: missing block: B:237:0x0254, code lost:
        
            if (r6.rating_index != null) goto L238;
         */
        /* JADX WARN: Code restructure failed: missing block: B:254:0x0280, code lost:
        
            if (r6.remark != null) goto L255;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 822
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.lib.models.Block.Builder.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.type;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.text;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.title;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.description;
            int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.linkType;
            int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.siteName;
            int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
            String str7 = this.articleId;
            int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
            Author author = this.author;
            int iHashCode8 = (iHashCode7 + (author != null ? author.hashCode() : 0)) * 31;
            Image image = this.image;
            int iHashCode9 = (iHashCode8 + (image != null ? image.hashCode() : 0)) * 31;
            Map<String, String> map = this.data;
            int iHashCode10 = (iHashCode9 + (map != null ? map.hashCode() : 0)) * 31;
            String str8 = this.language;
            int iHashCode11 = (iHashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
            String str9 = this.url;
            int iHashCode12 = (iHashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
            String str10 = this.thumbnailUrl;
            int iHashCode13 = (iHashCode12 + (str10 != null ? str10.hashCode() : 0)) * 31;
            String str11 = this.linkUrl;
            int iHashCode14 = (iHashCode13 + (str11 != null ? str11.hashCode() : 0)) * 31;
            String str12 = this.trackingUrl;
            int iHashCode15 = (iHashCode14 + (str12 != null ? str12.hashCode() : 0)) * 31;
            String str13 = this.fallbackUrl;
            int iHashCode16 = (iHashCode15 + (str13 != null ? str13.hashCode() : 0)) * 31;
            String str14 = this.username;
            int iHashCode17 = (iHashCode16 + (str14 != null ? str14.hashCode() : 0)) * 31;
            String str15 = this.provider;
            int iHashCode18 = (iHashCode17 + (str15 != null ? str15.hashCode() : 0)) * 31;
            String str16 = this.f291537id;
            int iHashCode19 = (iHashCode18 + (str16 != null ? str16.hashCode() : 0)) * 31;
            String str17 = this.align;
            int iHashCode20 = (iHashCode19 + (str17 != null ? str17.hashCode() : 0)) * 31;
            Integer num = this.width;
            int iHashCode21 = (iHashCode20 + (num != null ? num.hashCode() : 0)) * 31;
            Integer num2 = this.height;
            int iHashCode22 = (iHashCode21 + (num2 != null ? num2.hashCode() : 0)) * 31;
            Long l10 = this.duration;
            int iHashCode23 = (iHashCode22 + (l10 != null ? l10.hashCode() : 0)) * 31;
            String str18 = this.previewUrl;
            int iHashCode24 = (iHashCode23 + (str18 != null ? str18.hashCode() : 0)) * 31;
            String str19 = this.attribution;
            int iHashCode25 = (iHashCode24 + (str19 != null ? str19.hashCode() : 0)) * 31;
            List<BlockAttachment> list = this.attachments;
            int iHashCode26 = (iHashCode25 + (list != null ? list.hashCode() : 0)) * 31;
            List<String> list2 = this.items;
            int iHashCode27 = (iHashCode26 + (list2 != null ? list2.hashCode() : 0)) * 31;
            Integer num3 = this.rating_index;
            int iHashCode28 = (iHashCode27 + (num3 != null ? num3.hashCode() : 0)) * 31;
            Integer num4 = this.ratingIndex;
            int iHashCode29 = (iHashCode28 + (num4 != null ? num4.hashCode() : 0)) * 31;
            String str20 = this.remark;
            int iHashCode30 = (iHashCode29 + (str20 != null ? str20.hashCode() : 0)) * 31;
            List<ConversationRatingOption.Builder> list3 = this.options;
            int iHashCode31 = (iHashCode30 + (list3 != null ? list3.hashCode() : 0)) * 31;
            List<Builder> list4 = this.links;
            int iHashCode32 = (iHashCode31 + (list4 != null ? list4.hashCode() : 0)) * 31;
            Builder builder = this.footerLink;
            int iHashCode33 = (iHashCode32 + (builder != null ? builder.hashCode() : 0)) * 31;
            String str21 = this.imageUrl;
            int iHashCode34 = (iHashCode33 + (str21 != null ? str21.hashCode() : 0)) * 31;
            Integer num5 = this.imageWidth;
            int iHashCode35 = (iHashCode34 + (num5 != null ? num5.hashCode() : 0)) * 31;
            Integer num6 = this.imageHeight;
            int iHashCode36 = (iHashCode35 + (num6 != null ? num6.hashCode() : 0)) * 31;
            String str22 = this.ticket_type_title;
            int iHashCode37 = (iHashCode36 + (str22 != null ? str22.hashCode() : 0)) * 31;
            TicketType ticketType = this.ticket_type;
            return ((iHashCode37 + (ticketType != null ? ticketType.hashCode() : 0)) * 31) + this.ticket_type_id;
        }

        public Builder withAlign(String str) {
            this.align = str;
            return this;
        }

        public Builder withArticleId(String str) {
            this.articleId = str;
            return this;
        }

        public Builder withAttachments(List<BlockAttachment> list) {
            this.attachments = list;
            return this;
        }

        public Builder withAttribution(String str) {
            this.attribution = str;
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

        public Builder withDuration(long j10) {
            this.duration = Long.valueOf(j10);
            return this;
        }

        public Builder withHeight(int i10) {
            this.height = Integer.valueOf(i10);
            return this;
        }

        public Builder withImage(Image image) {
            this.image = image;
            return this;
        }

        public Builder withImageHeight(int i10) {
            this.imageHeight = Integer.valueOf(i10);
            return this;
        }

        public Builder withImageUrl(String str) {
            this.imageUrl = str;
            return this;
        }

        public Builder withImageWidth(int i10) {
            this.imageWidth = Integer.valueOf(i10);
            return this;
        }

        public Builder withItems(List<String> list) {
            this.items = list;
            return this;
        }

        public Builder withLinkType(String str) {
            this.linkType = str;
            return this;
        }

        public Builder withLocalUri(Uri uri) {
            this.local_uri = uri;
            return this;
        }

        public Builder withOptions(List<ConversationRatingOption.Builder> list) {
            this.options = list;
            return this;
        }

        public Builder withPreviewUrl(String str) {
            this.previewUrl = str;
            return this;
        }

        public Builder withRatingIndex(Integer num) {
            this.ratingIndex = num;
            return this;
        }

        public Builder withRemark(String str) {
            this.remark = str;
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

        public Builder withThumbnailUrl(String str) {
            this.thumbnailUrl = str;
            return this;
        }

        public Builder withTicketType(TicketType ticketType) {
            this.ticket_type = ticketType;
            return this;
        }

        public Builder withTicketTypeTitle(String str) {
            this.ticket_type_title = str;
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

        public Builder withWidth(int i10) {
            this.width = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x010e, code lost:
    
        if (r6.siteName != null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x015e, code lost:
    
        if (r6.thumbnailUrl != null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0174, code lost:
    
        if (r6.previewUrl != null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x019e, code lost:
    
        if (r6.linkUrl != null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x01de, code lost:
    
        if (r6.username != null) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x01f3, code lost:
    
        if (r6.provider != null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0258, code lost:
    
        if (r6.local_uri != null) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0290, code lost:
    
        if (r6.ticket_type_title != null) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
    
        if (r6.attachments != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006a, code lost:
    
        if (r6.data != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00cc, code lost:
    
        if (r6.title != null) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.lib.models.Block.equals(java.lang.Object):boolean");
    }

    public BlockAlignment getAlign() {
        return this.align;
    }

    public String getArticleId() {
        return this.articleId;
    }

    public List<BlockAttachment> getAttachments() {
        return this.attachments;
    }

    public String getAttribution() {
        return this.attribution;
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

    public String getFallbackUrl() {
        return this.fallbackUrl;
    }

    public Link getFooterLink() {
        return this.footerLink;
    }

    public int getHeight() {
        return this.height;
    }

    public String getId() {
        return this.f291536id;
    }

    public Image getImage() {
        return this.image;
    }

    public int getImageHeight() {
        return this.imageHeight;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public int getImageWidth() {
        return this.imageWidth;
    }

    public List<String> getItems() {
        return this.items;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getLinkType() {
        return this.linkType;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public List<Link> getLinks() {
        return this.links;
    }

    public Uri getLocalUri() {
        return this.local_uri;
    }

    public List<ConversationRatingOption> getOptions() {
        return this.options;
    }

    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public String getProvider() {
        return this.provider;
    }

    public int getRatingIndex() {
        return this.ratingIndex;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getSiteName() {
        return this.siteName;
    }

    public String getText() {
        return this.text;
    }

    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public TicketType getTicketType() {
        return this.ticket_type;
    }

    public int getTicketTypeId() {
        return this.ticketTypeId;
    }

    public String getTicketTypeTitle() {
        return this.ticket_type_title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTrackingUrl() {
        return this.trackingUrl;
    }

    public BlockType getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUsername() {
        return this.username;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        List<BlockAttachment> list = this.attachments;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.items;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        Map<String, String> map = this.data;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        BlockType blockType = this.type;
        int iHashCode4 = (iHashCode3 + (blockType != null ? blockType.hashCode() : 0)) * 31;
        BlockAlignment blockAlignment = this.align;
        int iHashCode5 = (iHashCode4 + (blockAlignment != null ? blockAlignment.hashCode() : 0)) * 31;
        Author author = this.author;
        int iHashCode6 = (iHashCode5 + (author != null ? author.hashCode() : 0)) * 31;
        Image image = this.image;
        int iHashCode7 = (iHashCode6 + (image != null ? image.hashCode() : 0)) * 31;
        String str = this.text;
        int iHashCode8 = (iHashCode7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.title;
        int iHashCode9 = (iHashCode8 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.description;
        int iHashCode10 = (iHashCode9 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.linkType;
        int iHashCode11 = (iHashCode10 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.siteName;
        int iHashCode12 = (iHashCode11 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.articleId;
        int iHashCode13 = (iHashCode12 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.language;
        int iHashCode14 = (iHashCode13 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.url;
        int iHashCode15 = (iHashCode14 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.thumbnailUrl;
        int iHashCode16 = (iHashCode15 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.previewUrl;
        int iHashCode17 = (iHashCode16 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.attribution;
        int iHashCode18 = (iHashCode17 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.linkUrl;
        int iHashCode19 = (iHashCode18 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.trackingUrl;
        int iHashCode20 = (iHashCode19 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.fallbackUrl;
        int iHashCode21 = (iHashCode20 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.username;
        int iHashCode22 = (iHashCode21 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.provider;
        int iHashCode23 = (iHashCode22 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.f291536id;
        int iHashCode24 = (((((((iHashCode23 + (str17 != null ? str17.hashCode() : 0)) * 31) + this.width) * 31) + this.height) * 31) + this.ratingIndex) * 31;
        String str18 = this.remark;
        int iHashCode25 = (iHashCode24 + (str18 != null ? str18.hashCode() : 0)) * 31;
        List<ConversationRatingOption> list3 = this.options;
        int iHashCode26 = (iHashCode25 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<Link> list4 = this.links;
        int iHashCode27 = (iHashCode26 + (list4 != null ? list4.hashCode() : 0)) * 31;
        Link link = this.footerLink;
        int iHashCode28 = (iHashCode27 + (link != null ? link.hashCode() : 0)) * 31;
        Uri uri = this.local_uri;
        int iHashCode29 = (iHashCode28 + (uri != null ? uri.hashCode() : 0)) * 31;
        String str19 = this.imageUrl;
        int iHashCode30 = (((((iHashCode29 + (str19 != null ? str19.hashCode() : 0)) * 31) + this.imageWidth) * 31) + this.imageHeight) * 31;
        String str20 = this.ticket_type_title;
        int iHashCode31 = (iHashCode30 + (str20 != null ? str20.hashCode() : 0)) * 31;
        TicketType ticketType = this.ticket_type;
        return iHashCode31 + (ticketType != null ? ticketType.hashCode() : 0);
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        int i10 = AnonymousClass2.$SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType[this.type.ordinal()];
        if (i10 == 1) {
            builder.withText(this.text).withType(this.type.getSerializedName());
            return builder;
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 != 4) {
                return builder;
            }
            builder.withType(this.type.getSerializedName()).withAttachments(this.attachments);
            return builder;
        }
        String str = null;
        Builder builderWithAttribution = builder.withType(this.type.getSerializedName()).withUrl(this.url).withLocalUri(this.local_uri).withAttribution(this.attribution.isEmpty() ? null : this.attribution);
        if (!this.previewUrl.isEmpty()) {
            str = this.previewUrl;
        }
        builderWithAttribution.withPreviewUrl(str).withHeight(this.height).withWidth(this.width);
        return builder;
    }

    public String toString() {
        return "Block{attachments=" + this.attachments + ", items=" + this.items + ", data=" + this.data + ", type=" + this.type + ", align=" + this.align + ", author=" + this.author + ", image=" + this.image + ", text='" + this.text + "', title='" + this.title + "', description='" + this.description + "', linkType='" + this.linkType + "', siteName='" + this.siteName + "', articleId='" + this.articleId + "', language='" + this.language + "', url='" + this.url + "', thumbnailUrl='" + this.thumbnailUrl + "', previewUrl='" + this.previewUrl + "', attribution='" + this.attribution + "', linkUrl='" + this.linkUrl + "', trackingUrl='" + this.trackingUrl + "', fallbackUrl='" + this.fallbackUrl + "', username='" + this.username + "', provider='" + this.provider + "', id='" + this.f291536id + "', width=" + this.width + ", height=" + this.height + ", ratingIndex=" + this.ratingIndex + ", remark='" + this.remark + "', options=" + this.options + ", links=" + this.links + ", footerLink=" + this.footerLink + ", imageUrl=" + this.imageUrl + ", imageWidth=" + this.imageWidth + ", imageHeight=" + this.imageHeight + ", ticket_type_title=" + this.ticket_type_title + ", ticket_type=" + this.ticket_type + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.attachments);
        parcel.writeStringList(this.items);
        parcel.writeInt(this.data.size());
        for (Map.Entry<String, String> entry : this.data.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        BlockType blockType = this.type;
        parcel.writeInt(blockType == null ? -1 : blockType.ordinal());
        BlockAlignment blockAlignment = this.align;
        parcel.writeInt(blockAlignment != null ? blockAlignment.ordinal() : -1);
        parcel.writeParcelable(this.author, i10);
        parcel.writeParcelable(this.image, i10);
        parcel.writeString(this.text);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.linkType);
        parcel.writeString(this.siteName);
        parcel.writeString(this.articleId);
        parcel.writeString(this.language);
        parcel.writeString(this.url);
        parcel.writeString(this.thumbnailUrl);
        parcel.writeString(this.linkUrl);
        parcel.writeString(this.trackingUrl);
        parcel.writeString(this.fallbackUrl);
        parcel.writeString(this.username);
        parcel.writeString(this.provider);
        parcel.writeString(this.previewUrl);
        parcel.writeString(this.attribution);
        parcel.writeString(this.f291536id);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.ratingIndex);
        parcel.writeString(this.remark);
        parcel.writeTypedList(this.options);
        parcel.writeTypedList(this.links);
        parcel.writeParcelable(this.footerLink, i10);
        parcel.writeParcelable(this.local_uri, i10);
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.imageWidth);
        parcel.writeInt(this.imageHeight);
        parcel.writeString(this.ticket_type_title);
        parcel.writeParcelable(this.ticket_type, i10);
    }

    Block() {
        this(new Builder());
    }

    private Block(Builder builder) {
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
        this.data = map == null ? Collections.EMPTY_MAP : map;
        String str7 = builder.language;
        this.language = str7 == null ? "" : str7;
        String str8 = builder.url;
        this.url = str8 == null ? "" : str8;
        String str9 = builder.thumbnailUrl;
        this.thumbnailUrl = str9 == null ? "" : str9;
        String str10 = builder.linkUrl;
        this.linkUrl = str10 == null ? "" : str10;
        String str11 = builder.trackingUrl;
        this.trackingUrl = str11 == null ? "" : str11;
        String str12 = builder.fallbackUrl;
        this.fallbackUrl = str12 == null ? "" : str12;
        String str13 = builder.username;
        this.username = str13 == null ? "" : str13;
        String str14 = builder.provider;
        this.provider = str14 == null ? "" : str14;
        String str15 = builder.f291537id;
        this.f291536id = str15 == null ? "" : str15;
        this.align = BlockAlignment.alignValueOf(builder.align);
        Integer num = builder.width;
        this.width = num == null ? 0 : num.intValue();
        Integer num2 = builder.height;
        this.height = num2 == null ? 0 : num2.intValue();
        Long l10 = builder.duration;
        this.duration = l10 == null ? 0L : l10.longValue();
        String str16 = builder.previewUrl;
        this.previewUrl = str16 == null ? "" : str16;
        String str17 = builder.attribution;
        this.attribution = str17 == null ? "" : str17;
        Uri uri = builder.local_uri;
        this.local_uri = uri == null ? Uri.EMPTY : uri;
        String str18 = builder.imageUrl;
        this.imageUrl = str18 == null ? "" : str18;
        Integer num3 = builder.imageWidth;
        this.imageWidth = num3 == null ? 0 : num3.intValue();
        Integer num4 = builder.imageHeight;
        this.imageHeight = num4 != null ? num4.intValue() : 0;
        this.attachments = new ArrayList();
        List<BlockAttachment> list = builder.attachments;
        if (list != null) {
            for (BlockAttachment blockAttachment : list) {
                if (blockAttachment != null) {
                    this.attachments.add(blockAttachment);
                }
            }
        }
        this.items = new ArrayList();
        List<String> list2 = builder.items;
        if (list2 != null) {
            for (String str19 : list2) {
                if (str19 != null) {
                    this.items.add(str19);
                }
            }
        }
        Integer num5 = builder.ratingIndex;
        if (num5 != null) {
            this.ratingIndex = num5.intValue();
        } else {
            Integer num6 = builder.rating_index;
            if (num6 != null) {
                this.ratingIndex = num6.intValue();
            } else {
                this.ratingIndex = -1;
            }
        }
        String str20 = builder.remark;
        this.remark = str20 == null ? "" : str20;
        this.options = new ArrayList();
        List<ConversationRatingOption.Builder> list3 = builder.options;
        if (list3 != null) {
            for (ConversationRatingOption.Builder builder2 : list3) {
                if (builder2 != null) {
                    this.options.add(builder2.build());
                }
            }
        }
        this.links = new ArrayList();
        List<Builder> list4 = builder.links;
        if (list4 != null) {
            for (Builder builder3 : list4) {
                if (builder3 != null) {
                    this.links.add(Link.fromBlock(builder3.build()));
                }
            }
        }
        Builder builder4 = builder.footerLink;
        this.footerLink = builder4 == null ? new Link() : Link.fromBlock(builder4.build());
        String str21 = builder.ticket_type_title;
        this.ticket_type_title = str21 != null ? str21 : "";
        TicketType ticketType = builder.ticket_type;
        this.ticket_type = ticketType == null ? TicketType.Companion.getNULL() : ticketType;
        this.ticketTypeId = builder.ticket_type_id;
    }

    protected Block(Parcel parcel) {
        this.attachments = parcel.createTypedArrayList(BlockAttachment.CREATOR);
        this.items = parcel.createStringArrayList();
        int i10 = parcel.readInt();
        this.data = new HashMap(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.data.put(parcel.readString(), parcel.readString());
        }
        int i12 = parcel.readInt();
        BlockAlignment blockAlignment = null;
        this.type = i12 == -1 ? null : BlockType.values()[i12];
        int i13 = parcel.readInt();
        if (i13 != -1) {
            blockAlignment = BlockAlignment.values()[i13];
        }
        this.align = blockAlignment;
        this.author = (Author) parcel.readParcelable(Author.class.getClassLoader());
        this.image = (Image) parcel.readParcelable(Image.class.getClassLoader());
        this.text = parcel.readString();
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.linkType = parcel.readString();
        this.siteName = parcel.readString();
        this.articleId = parcel.readString();
        this.language = parcel.readString();
        this.url = parcel.readString();
        this.thumbnailUrl = parcel.readString();
        this.linkUrl = parcel.readString();
        this.trackingUrl = parcel.readString();
        this.fallbackUrl = parcel.readString();
        this.username = parcel.readString();
        this.provider = parcel.readString();
        this.previewUrl = parcel.readString();
        this.attribution = parcel.readString();
        this.f291536id = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.duration = parcel.readLong();
        this.ratingIndex = parcel.readInt();
        this.remark = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.options = arrayList;
        parcel.readList(arrayList, ConversationRatingOption.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.links = arrayList2;
        parcel.readList(arrayList2, Link.class.getClassLoader());
        this.footerLink = (Link) parcel.readParcelable(Link.class.getClassLoader());
        this.local_uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.imageUrl = parcel.readString();
        this.imageWidth = parcel.readInt();
        this.imageHeight = parcel.readInt();
        this.ticket_type_title = parcel.readString();
        this.ticket_type = (TicketType) parcel.readParcelable(TicketType.class.getClassLoader());
    }
}
