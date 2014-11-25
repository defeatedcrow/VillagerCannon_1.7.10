package mods.villagercannon.client;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class VillagerForceModel extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer nose;
    ModelRenderer core;
    ModelRenderer rodA1;
    ModelRenderer rodA2;
    ModelRenderer rodA3;
    ModelRenderer rodA4;
    ModelRenderer rodA5;
    ModelRenderer rodA6;
    ModelRenderer rodA7;
    ModelRenderer rodB1;
    ModelRenderer rodB2;
    ModelRenderer rodB3;
    ModelRenderer rodB4;
    ModelRenderer rodB5;
    ModelRenderer rodB6;
    ModelRenderer rodB7;
    ModelRenderer rodC1;
    ModelRenderer rodC2;
    ModelRenderer rodC3;
    ModelRenderer rodC4;
    ModelRenderer rodC5;
    ModelRenderer rodC6;
    ModelRenderer rodC7;
    ModelRenderer rodD1;
    ModelRenderer rodD2;
    ModelRenderer rodD3;
    ModelRenderer rodD4;
    ModelRenderer rodD5;
    ModelRenderer rodD6;
    ModelRenderer rodD7;
  
  public VillagerForceModel()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -5F, -4F, 8, 10, 8);
      head.setRotationPoint(0F, 16F, 0F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      nose = new ModelRenderer(this, 24, 0);
      nose.addBox(-1F, 2F, -6F, 2, 4, 2);
      nose.setRotationPoint(0F, 16F, 0F);
      nose.setTextureSize(128, 64);
      nose.mirror = true;
      setRotation(nose, 0F, 0F, 0F);
      core = new ModelRenderer(this, 0, 20);
      core.addBox(-5F, -5F, -5F, 10, 10, 10);
      core.setRotationPoint(0F, 16F, 0F);
      core.setTextureSize(128, 64);
      core.mirror = true;
      setRotation(core, 0F, 0F, 0F);
      rodA1 = new ModelRenderer(this, 40, 0);
      rodA1.addBox(-1F, -7F, -4F, 2, 2, 3);
      rodA1.setRotationPoint(0F, 16F, 0F);
      rodA1.setTextureSize(128, 64);
      rodA1.mirror = true;
      setRotation(rodA1, 0.2617994F, 0F, 0F);
      rodA2 = new ModelRenderer(this, 51, 0);
      rodA2.addBox(-1.5F, -7F, -3F, 3, 2, 3);
      rodA2.setRotationPoint(0F, 16F, 0F);
      rodA2.setTextureSize(128, 64);
      rodA2.mirror = true;
      setRotation(rodA2, 0F, 0F, 0F);
      rodA3 = new ModelRenderer(this, 40, 0);
      rodA3.addBox(0.5F, -7F, -2.5F, 2, 2, 3);
      rodA3.setRotationPoint(0F, 16F, 0F);
      rodA3.setTextureSize(128, 64);
      rodA3.mirror = true;
      setRotation(rodA3, 0.2617994F, 1.570796F, 0F);
      rodA4 = new ModelRenderer(this, 40, 0);
      rodA4.addBox(-2.5F, -7F, -2.5F, 2, 2, 3);
      rodA4.setRotationPoint(0F, 16F, 0F);
      rodA4.setTextureSize(128, 64);
      rodA4.mirror = true;
      setRotation(rodA4, 0.2617994F, -1.570796F, 0F);
      rodA5 = new ModelRenderer(this, 64, 0);
      rodA5.addBox(-1.5F, -6F, 0F, 3, 1, 4);
      rodA5.setRotationPoint(0F, 16F, 0F);
      rodA5.setTextureSize(128, 64);
      rodA5.mirror = true;
      setRotation(rodA5, 0F, 0F, 0F);
      rodA6 = new ModelRenderer(this, 79, 0);
      rodA6.addBox(-1F, -7F, -1.5F, 2, 2, 3);
      rodA6.setRotationPoint(0F, 16F, 0F);
      rodA6.setTextureSize(128, 64);
      rodA6.mirror = true;
      setRotation(rodA6, -0.2617994F, 0F, 0F);
      rodA7 = new ModelRenderer(this, 40, 6);
      rodA7.addBox(-1.5F, -6.5F, 4F, 3, 2, 12);
      rodA7.setRotationPoint(0F, 16F, 0F);
      rodA7.setTextureSize(128, 64);
      rodA7.mirror = true;
      setRotation(rodA7, 0.0872665F, 0F, 0F);
      rodB1 = new ModelRenderer(this, 40, 0);
      rodB1.addBox(-1F, 5F, -3F, 2, 2, 3);
      rodB1.setRotationPoint(0F, 16F, 0F);
      rodB1.setTextureSize(128, 64);
      rodB1.mirror = true;
      setRotation(rodB1, -0.2617994F, 0F, 0F);
      rodB2 = new ModelRenderer(this, 51, 0);
      rodB2.addBox(-1.5F, 5F, -3F, 3, 2, 3);
      rodB2.setRotationPoint(0F, 16F, 0F);
      rodB2.setTextureSize(128, 64);
      rodB2.mirror = true;
      setRotation(rodB2, 0F, 0F, 0F);
      rodB3 = new ModelRenderer(this, 40, 0);
      rodB3.addBox(0.5F, 5F, -0.5F, 2, 2, 3);
      rodB3.setRotationPoint(0F, 16F, 0F);
      rodB3.setTextureSize(128, 64);
      rodB3.mirror = true;
      setRotation(rodB3, 0.2617994F, 1.570796F, 0F);
      rodB4 = new ModelRenderer(this, 40, 0);
      rodB4.addBox(-2.5F, 5F, -0.5F, 2, 2, 3);
      rodB4.setRotationPoint(0F, 16F, 0F);
      rodB4.setTextureSize(128, 64);
      rodB4.mirror = true;
      setRotation(rodB4, 0.2617994F, -1.570796F, 0F);
      rodB5 = new ModelRenderer(this, 64, 0);
      rodB5.addBox(-1.5F, 5F, 0F, 3, 1, 4);
      rodB5.setRotationPoint(0F, 16F, 0F);
      rodB5.setTextureSize(128, 64);
      rodB5.mirror = true;
      setRotation(rodB5, 0F, 0F, 0F);
      rodB6 = new ModelRenderer(this, 79, 0);
      rodB6.addBox(-1F, 5F, -1.5F, 2, 2, 3);
      rodB6.setRotationPoint(0F, 16F, 0F);
      rodB6.setTextureSize(128, 64);
      rodB6.mirror = true;
      setRotation(rodB6, 0.2617994F, 0F, 0F);
      rodB7 = new ModelRenderer(this, 40, 6);
      rodB7.addBox(-1.5F, 4.5F, 4F, 3, 2, 12);
      rodB7.setRotationPoint(0F, 16F, 0F);
      rodB7.setTextureSize(128, 64);
      rodB7.mirror = true;
      setRotation(rodB7, -0.0872665F, 0F, 0F);
      rodC1 = new ModelRenderer(this, 40, 24);
      rodC1.addBox(5F, -1F, -4F, 2, 2, 3);
      rodC1.setRotationPoint(0F, 16F, 0F);
      rodC1.setTextureSize(128, 64);
      rodC1.mirror = true;
      setRotation(rodC1, 0F, 0.2617994F, 0F);
      rodC2 = new ModelRenderer(this, 51, 24);
      rodC2.addBox(5F, -1.5F, -3F, 2, 3, 3);
      rodC2.setRotationPoint(0F, 16F, 0F);
      rodC2.setTextureSize(128, 64);
      rodC2.mirror = true;
      setRotation(rodC2, 0F, 0F, 0F);
      rodC3 = new ModelRenderer(this, 40, 24);
      rodC3.addBox(0.5F, 5F, -2.5F, 2, 2, 3);
      rodC3.setRotationPoint(0F, 16F, 0F);
      rodC3.setTextureSize(128, 64);
      rodC3.mirror = true;
      setRotation(rodC3, 1.308997F, 1.570796F, 0F);
      rodC3.mirror = false;
      rodC4 = new ModelRenderer(this, 40, 24);
      rodC4.addBox(0.5F, -7F, -2.5F, 2, 2, 3);
      rodC4.setRotationPoint(0F, 16F, 0F);
      rodC4.setTextureSize(128, 64);
      rodC4.mirror = true;
      setRotation(rodC4, -1.308997F, 1.570796F, 0F);
      rodC5 = new ModelRenderer(this, 63, 24);
      rodC5.addBox(5F, -1.5F, 0F, 1, 3, 4);
      rodC5.setRotationPoint(0F, 16F, 0F);
      rodC5.setTextureSize(128, 64);
      rodC5.mirror = true;
      setRotation(rodC5, 0F, 0F, 0F);
      rodC6 = new ModelRenderer(this, 75, 24);
      rodC6.addBox(5F, -1F, -1.5F, 2, 2, 3);
      rodC6.setRotationPoint(0F, 16F, 0F);
      rodC6.setTextureSize(128, 64);
      rodC6.mirror = true;
      setRotation(rodC6, 0F, -0.2617994F, 0F);
      rodC7 = new ModelRenderer(this, 40, 32);
      rodC7.addBox(4.5F, -1.5F, 4F, 2, 3, 12);
      rodC7.setRotationPoint(0F, 16F, 0F);
      rodC7.setTextureSize(128, 64);
      rodC7.mirror = true;
      setRotation(rodC7, 0F, 0.0872665F, 0F);
      rodD1 = new ModelRenderer(this, 40, 24);
      rodD1.addBox(-7F, -1F, -4F, 2, 2, 3);
      rodD1.setRotationPoint(0F, 16F, 0F);
      rodD1.setTextureSize(128, 64);
      rodD1.mirror = true;
      setRotation(rodD1, 0F, -0.2617994F, 0F);
      rodD2 = new ModelRenderer(this, 51, 24);
      rodD2.addBox(-7F, -1.5F, -3F, 2, 3, 3);
      rodD2.setRotationPoint(0F, 16F, 0F);
      rodD2.setTextureSize(128, 64);
      rodD2.mirror = true;
      setRotation(rodD2, 0F, 0F, 0F);
      rodD3 = new ModelRenderer(this, 40, 24);
      rodD3.addBox(0.5F, -7F, -0.5F, 2, 2, 3);
      rodD3.setRotationPoint(0F, 16F, 0F);
      rodD3.setTextureSize(128, 64);
      rodD3.mirror = true;
      setRotation(rodD3, 1.308997F, 1.570796F, 0F);
      rodD4 = new ModelRenderer(this, 40, 24);
      rodD4.addBox(0.5F, 5F, -0.5F, 2, 2, 3);
      rodD4.setRotationPoint(0F, 16F, 0F);
      rodD4.setTextureSize(128, 64);
      rodD4.mirror = true;
      setRotation(rodD4, -1.308997F, 1.570796F, 0F);
      rodD5 = new ModelRenderer(this, 63, 24);
      rodD5.addBox(-6F, -1.5F, 0F, 1, 3, 4);
      rodD5.setRotationPoint(0F, 16F, 0F);
      rodD5.setTextureSize(128, 64);
      rodD5.mirror = true;
      setRotation(rodD5, 0F, 0F, 0F);
      rodD6 = new ModelRenderer(this, 75, 24);
      rodD6.addBox(-7F, -1F, -1.5F, 2, 2, 3);
      rodD6.setRotationPoint(0F, 16F, 0F);
      rodD6.setTextureSize(128, 64);
      rodD6.mirror = true;
      setRotation(rodD6, 0F, 0.2617994F, 0F);
      rodD7 = new ModelRenderer(this, 40, 32);
      rodD7.addBox(-6.5F, -1.5F, 4F, 2, 3, 12);
      rodD7.setRotationPoint(0F, 16F, 0F);
      rodD7.setTextureSize(128, 64);
      rodD7.mirror = true;
      setRotation(rodD7, 0F, -0.0872665F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    rodA1.render(f5);
    rodA2.render(f5);
    rodA3.render(f5);
    rodA4.render(f5);
    rodA5.render(f5);
    rodA6.render(f5);
    rodA7.render(f5);
    rodB1.render(f5);
    rodB2.render(f5);
    rodB3.render(f5);
    rodB4.render(f5);
    rodB5.render(f5);
    rodB6.render(f5);
    rodB7.render(f5);
    rodC1.render(f5);
    rodC2.render(f5);
    rodC3.render(f5);
    rodC4.render(f5);
    rodC5.render(f5);
    rodC6.render(f5);
    rodC7.render(f5);
    rodD1.render(f5);
    rodD2.render(f5);
    rodD3.render(f5);
    rodD4.render(f5);
    rodD5.render(f5);
    rodD6.render(f5);
    rodD7.render(f5);
  }
  
  public void renderHead(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
	  super.render(entity, f, f1, f2, f3, f4, f5);
	  setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	  head.render(f5);
	  nose.render(f5);
  }
  
  public void renderCore(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
	  super.render(entity, f, f1, f2, f3, f4, f5);
	  setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	  core.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
