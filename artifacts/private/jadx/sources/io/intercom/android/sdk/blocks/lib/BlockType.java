package io.intercom.android.sdk.blocks.lib;

import android.view.View;
import android.view.ViewGroup;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.lib.models.ConversationRating;
import io.intercom.android.sdk.blocks.lib.models.Link;
import io.intercom.android.sdk.blocks.lib.models.LinkList;
import io.intercom.android.sdk.utilities.commons.HtmlCompat;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public enum BlockType {
    PARAGRAPH("paragraph") { // from class: io.intercom.android.sdk.blocks.lib.BlockType.1
        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getParagraph().addParagraph(HtmlCompat.fromHtml(block.getText()), block.getAlign(), blockMetadata, viewGroup);
        }
    },
    HEADING("heading") { // from class: io.intercom.android.sdk.blocks.lib.BlockType.2
        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getHeading().addHeading(HtmlCompat.fromHtml(block.getText()), block.getAlign(), blockMetadata, viewGroup);
        }
    },
    SUBHEADING("subheading") { // from class: io.intercom.android.sdk.blocks.lib.BlockType.3
        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getSubheading().addSubheading(HtmlCompat.fromHtml(block.getText()), block.getAlign(), blockMetadata, viewGroup);
        }
    },
    CODE("code") { // from class: io.intercom.android.sdk.blocks.lib.BlockType.4
        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getCode().addCode(HtmlCompat.fromHtml(block.getText()), blockMetadata, viewGroup);
        }
    },
    LINK("link") { // from class: io.intercom.android.sdk.blocks.lib.BlockType.5
        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getLink().addLinkBlock(Link.fromBlock(block), blockMetadata, viewGroup);
        }
    },
    CONVERSATIONRATING("conversationRating") { // from class: io.intercom.android.sdk.blocks.lib.BlockType.6
        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getConversationRating().addConversationRatingBlock(ConversationRating.fromBlock(block), blockMetadata, viewGroup);
        }
    },
    LINKLIST("linkList") { // from class: io.intercom.android.sdk.blocks.lib.BlockType.7
        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getLinkList().addLinkListBlock(LinkList.fromBlock(block), blockMetadata, viewGroup);
        }
    },
    UNORDEREDLIST("unorderedList") { // from class: io.intercom.android.sdk.blocks.lib.BlockType.8
        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getUnorderedList().addUnorderedList(block.getItems(), blockMetadata, viewGroup);
        }
    },
    ORDEREDLIST("orderedList") { // from class: io.intercom.android.sdk.blocks.lib.BlockType.9
        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getOrderedList().addOrderedList(block.getItems(), blockMetadata, viewGroup);
        }
    },
    ATTACHMENTLIST("attachmentList") { // from class: io.intercom.android.sdk.blocks.lib.BlockType.10
        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getAttachmentList().addAttachmentList(block.getAttachments(), blockMetadata, viewGroup);
        }
    },
    IMAGE("image") { // from class: io.intercom.android.sdk.blocks.lib.BlockType.11
        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getImage().addImage(block.getUrl(), BlockType.getLinkUrl(block), block.getDescription(), block.getWidth(), block.getHeight(), block.getAlign(), blockMetadata, viewGroup);
        }
    },
    IMAGETEXT("imageText") { // from class: io.intercom.android.sdk.blocks.lib.BlockType.12
        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            block.getImage();
            return blocksViewHolder.getImageText().addImageText(HtmlCompat.fromHtml(block.getTitle()), HtmlCompat.fromHtml(block.getText()), block.getImageUrl(), block.getDescription(), block.getImageWidth(), block.getImageHeight(), blockMetadata, viewGroup);
        }
    },
    BUTTON("button") { // from class: io.intercom.android.sdk.blocks.lib.BlockType.13
        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getButton().addButton(HtmlCompat.fromHtml(block.getText()), BlockType.getLinkUrl(block), block.getAlign(), blockMetadata, viewGroup);
        }
    },
    FACEBOOKLIKEBUTTON("facebookLikeButton") { // from class: io.intercom.android.sdk.blocks.lib.BlockType.14
        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getFacebookButton().addFacebookButton(block.getUrl(), block.getAlign(), blockMetadata, viewGroup);
        }
    },
    TWITTERFOLLOWBUTTON("twitterFollowButton") { // from class: io.intercom.android.sdk.blocks.lib.BlockType.15
        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getTwitterButton().addTwitterButton("https://twitter.com/" + block.getUsername(), block.getAlign(), blockMetadata, viewGroup);
        }
    },
    VIDEO("video") { // from class: io.intercom.android.sdk.blocks.lib.BlockType.16
        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getVideo().addVideo(block.getText(), VideoProvider.videoValueOf(block.getProvider()), block.getId(), blockMetadata, viewGroup);
        }
    },
    VIDEOFILE("videoFile") { // from class: io.intercom.android.sdk.blocks.lib.BlockType.17
        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getVideoFile().addVideoFile(block.getText(), block.getUrl(), block.getThumbnailUrl(), blockMetadata, viewGroup);
        }
    },
    MESSENGERCARD("messengerCard") { // from class: io.intercom.android.sdk.blocks.lib.BlockType.18
        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getMessengerCardBlock().addCard(block.getText(), block.getFallbackUrl(), blockMetadata, viewGroup);
        }
    },
    LOCALIMAGE("localImage") { // from class: io.intercom.android.sdk.blocks.lib.BlockType.19
        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getLocalImage().addImage(block.getLocalUri(), block.getWidth(), block.getHeight(), block.getAlign(), blockMetadata, viewGroup);
        }
    },
    LOCAL_ATTACHMENT("local_attachment") { // from class: io.intercom.android.sdk.blocks.lib.BlockType.20
        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getLocalAttachment().addAttachment(block.getAttachments().get(0), blockMetadata, viewGroup);
        }
    },
    CREATETICKETCARD("createTicketCard") { // from class: io.intercom.android.sdk.blocks.lib.BlockType.21
        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getParagraph().addParagraph(HtmlCompat.fromHtml(block.getText()), block.getAlign(), blockMetadata, viewGroup);
        }
    },
    UNKNOWN("unknown") { // from class: io.intercom.android.sdk.blocks.lib.BlockType.22
        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            if (block.getText().isEmpty() || blocksViewHolder.getParagraph() == null) {
                throw new BlockTypeNotImplementedException();
            }
            return BlockType.PARAGRAPH.generateViewFromBlockAndLayout(blocksViewHolder, block, viewGroup, blockMetadata);
        }
    };

    private final String serializedName;

    protected static String getLinkUrl(Block block) {
        return block.getTrackingUrl().isEmpty() ? block.getLinkUrl() : block.getTrackingUrl();
    }

    public static BlockType typeValueOf(String str) {
        try {
            return valueOf(str.toUpperCase(Locale.ENGLISH));
        } catch (IllegalArgumentException | NullPointerException unused) {
            return UNKNOWN;
        }
    }

    abstract View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata);

    public String getSerializedName() {
        return this.serializedName;
    }

    public View getView(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) throws BlockTypeNotImplementedException {
        try {
            try {
                return generateViewFromBlockAndLayout(blocksViewHolder, block, viewGroup, blockMetadata);
            } catch (NullPointerException unused) {
                return UNKNOWN.generateViewFromBlockAndLayout(blocksViewHolder, block, viewGroup, blockMetadata);
            }
        } catch (BlockTypeNotImplementedException | NullPointerException unused2) {
            throw new BlockTypeNotImplementedException();
        }
    }

    BlockType(String str) {
        this.serializedName = str;
    }
}
