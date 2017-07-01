package com.trouvere.entityKTP;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class ModelAllValueKTP {

	private List<String> typeKTP;

	private List<String> power;

	// private String climaticZone;
	//
	// private String voltageHVSide;
	//
	// // private String typeOfTransformer;
	// //
	// // private String schemeAndGroupOfLinks;
	// //
	// // private String inputOnTheHVSide;
	// //
	// // private String typeOfInputDeviceOnTheHVSide;
	// //
	// // private String typeOfLinearApparatusOnTheHVSide; // (для проходных
	// КТП)
	// //
	// // private String availabilityOvervoltageLimitersOnTheHVSide;
	//
	// private String voltageLVSide;
	//
	// // private String typeOfInputDeviceOnTheLVSide;
	//
	// // private String outputOnTheSideOfLV;
	// //
	// // private String typeOfInputDeviceOnTheOutputLines;
	// //
	// // private String nominalAmperageOutputLines; // МАССИВ ИЛИ КОЛЛЕКЦИЯ
	// //
	// // private String isAvavailableAndTheAmperageLightingLine;
	// //
	// private boolean thePresenceOfOvervoltageLimitersOnTheLVSide;
	// //
	// // private String availabilityOfAccountingSystemPower;
	// //
	// private boolean thePresenceOfTheHeatedEquipmentCompartment;
	// public static void main(String[] args) {
	// System.out.println("1");
	// ZakaznoeKTP z = new ZakaznoeKTP();
	// Class zClass = z.getClass();
	// Field fields[] = zClass.getDeclaredFields();
	// System.out.println("Access all the fields");
	// for (int i = 0; i < fields.length; i++) {
	// System.out.println("Field Name: " + fields[i].getName());
	// fields[i].setAccessible(true);
	// try {
	// System.out.println(fields[i].get(z) + "\n");
	// } catch (IllegalArgumentException | IllegalAccessException e) {
	// // TODO Auto-generated catch block
	//// e.printStackTrace();
	//// }
	// }
	// }
}
