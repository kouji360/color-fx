export class FxCard {
  id: number;
  leftColor: FxColor;
  rightColor: FxColor;
}

export enum Color {
  RED = 'RED',
  GREEN = 'GREEN',
  BLUE = 'BLUE',
}

export class FxColor {
  id: number;
  color: Color;
  value: number;
}

