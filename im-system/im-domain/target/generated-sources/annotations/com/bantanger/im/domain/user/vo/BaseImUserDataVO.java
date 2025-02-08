// --- Auto Generated by BanTanger ---
package com.bantanger.im.domain.user.vo;

import com.bantanger.codegen.processor.vo.AbstractBaseJpaVO;
import com.bantanger.common.enums.ValidStatus;
import com.bantanger.common.model.CodeValue;
import com.bantanger.im.domain.user.ImUserData;
import com.bantanger.im.domain.user.enums.FriendAllowType;
import com.bantanger.im.domain.user.enums.UserType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import lombok.Data;

@Schema
@Data
public class BaseImUserDataVO extends AbstractBaseJpaVO {
   @Schema(
         title = "用户名称"
   )
   private String nickName;

   @Schema(
         title = "位置"
   )
   private String location;

   @Schema(
         title = "生日"
   )
   private String birthDay;

   @Schema(
         title = "头像"
   )
   private String photo;

   @Schema(
         title = "性别"
   )
   private String userSex;

   @Schema(
         title = "个性签名"
   )
   private String selfSignature;

   @Schema(
         title = "加好友验证类型"
   )
   private FriendAllowType friendAllowType;

   @Schema(
         title = "管理员禁止用户添加加好友"
   )
   private ValidStatus disableAddFriend;

   @Schema(
         title = "禁用标识"
   )
   private ValidStatus forbiddenFlag;

   @Schema(
         title = "禁言标识"
   )
   private ValidStatus silentFlag;

   @Schema(
         title = "用户类型"
   )
   private UserType userType;

   @Schema(
         title = "用户所在APP"
   )
   private Integer appId;

   @Schema(
         title = "扩展信息"
   )
   private List<CodeValue> extra;

   @Schema(
         title = "validStatus"
   )
   private ValidStatus validStatus;

   protected BaseImUserDataVO() {
   }

   public BaseImUserDataVO(ImUserData source) {
      super(source);
      this.setNickName(source.getNickName());
      this.setLocation(source.getLocation());
      this.setBirthDay(source.getBirthDay());
      this.setPhoto(source.getPhoto());
      this.setUserSex(source.getUserSex());
      this.setSelfSignature(source.getSelfSignature());
      this.setFriendAllowType(source.getFriendAllowType());
      this.setDisableAddFriend(source.getDisableAddFriend());
      this.setForbiddenFlag(source.getForbiddenFlag());
      this.setSilentFlag(source.getSilentFlag());
      this.setUserType(source.getUserType());
      this.setAppId(source.getAppId());
      this.setExtra(source.getExtra());
      this.setValidStatus(source.getValidStatus());
   }

   public String getNickName() {
      return nickName;
   }

   public void setNickName(String nickName) {
      this.nickName = nickName;
   }

   public String getLocation() {
      return location;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public String getBirthDay() {
      return birthDay;
   }

   public void setBirthDay(String birthDay) {
      this.birthDay = birthDay;
   }

   public String getPhoto() {
      return photo;
   }

   public void setPhoto(String photo) {
      this.photo = photo;
   }

   public String getUserSex() {
      return userSex;
   }

   public void setUserSex(String userSex) {
      this.userSex = userSex;
   }

   public String getSelfSignature() {
      return selfSignature;
   }

   public void setSelfSignature(String selfSignature) {
      this.selfSignature = selfSignature;
   }

   public FriendAllowType getFriendAllowType() {
      return friendAllowType;
   }

   public void setFriendAllowType(FriendAllowType friendAllowType) {
      this.friendAllowType = friendAllowType;
   }

   public ValidStatus getDisableAddFriend() {
      return disableAddFriend;
   }

   public void setDisableAddFriend(ValidStatus disableAddFriend) {
      this.disableAddFriend = disableAddFriend;
   }

   public ValidStatus getForbiddenFlag() {
      return forbiddenFlag;
   }

   public void setForbiddenFlag(ValidStatus forbiddenFlag) {
      this.forbiddenFlag = forbiddenFlag;
   }

   public ValidStatus getSilentFlag() {
      return silentFlag;
   }

   public void setSilentFlag(ValidStatus silentFlag) {
      this.silentFlag = silentFlag;
   }

   public UserType getUserType() {
      return userType;
   }

   public void setUserType(UserType userType) {
      this.userType = userType;
   }

   public Integer getAppId() {
      return appId;
   }

   public void setAppId(Integer appId) {
      this.appId = appId;
   }

   public List<CodeValue> getExtra() {
      return extra;
   }

   public void setExtra(List<CodeValue> extra) {
      this.extra = extra;
   }

   public ValidStatus getValidStatus() {
      return validStatus;
   }

   public void setValidStatus(ValidStatus validStatus) {
      this.validStatus = validStatus;
   }
}
